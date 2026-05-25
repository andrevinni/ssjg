import { useState, useEffect, useCallback, useRef } from 'react';
import VectorLayer from 'ol/layer/Vector';
import VectorSource from 'ol/source/Vector';
import GeoJSON from 'ol/format/GeoJSON';
import { Style, Fill, Stroke, Circle, Text } from 'ol/style';

export const useCustomLayers = (mapInstance) => {
  const [layers, setLayers] = useState([]);
  const layersRef = useRef(new Map());

  // Estilos padrão por tipo de geometria
  const defaultStyles = {
    Polygon: {
      fill: { color: 'rgba(66, 133, 244, 0.3)' },
      stroke: { color: '#4285f4', width: 2 }
    },
    LineString: {
      stroke: { color: '#ea4335', width: 3, lineDash: undefined }
    },
    Point: {
      circle: { radius: 8, color: '#4285f4', strokeColor: '#fff', strokeWidth: 2 },
      text: { show: true, color: '#fff', strokeColor: '#000', fontSize: 12, offsetY: -15 }
    }
  };

  // Aplicar estilo customizado
  const applyCustomStyle = (styleConfig, feature) => {
    const geometryType = feature.getGeometry()?.getType();
    
    if (geometryType === 'Polygon' || geometryType === 'MultiPolygon') {
      return new Style({
        fill: new Fill({ 
          color: styleConfig?.fill?.color || defaultStyles.Polygon.fill.color 
        }),
        stroke: new Stroke({ 
          color: styleConfig?.stroke?.color || defaultStyles.Polygon.stroke.color,
          width: styleConfig?.stroke?.width || defaultStyles.Polygon.stroke.width
        }),
      });
    }
    else if (geometryType === 'LineString' || geometryType === 'MultiLineString') {
      return new Style({
        stroke: new Stroke({ 
          color: styleConfig?.stroke?.color || defaultStyles.LineString.stroke.color,
          width: styleConfig?.stroke?.width || defaultStyles.LineString.stroke.width,
          lineDash: styleConfig?.stroke?.lineDash || undefined
        }),
      });
    }
    else {
      // Pontos
      const circleStyle = new Style({
        image: new Circle({
          radius: styleConfig?.circle?.radius || defaultStyles.Point.circle.radius,
          fill: new Fill({ color: styleConfig?.circle?.color || defaultStyles.Point.circle.color }),
          stroke: new Stroke({ 
            color: styleConfig?.circle?.strokeColor || defaultStyles.Point.circle.strokeColor,
            width: styleConfig?.circle?.strokeWidth || defaultStyles.Point.circle.strokeWidth
          })
        })
      });
      
      // Adicionar texto se configurado
      if (styleConfig?.text?.show !== false) {
        const properties = feature.getProperties();
        const textContent = properties.nome || properties.NOME || properties.name;
        
        if (textContent) {
          circleStyle.setText(new Text({
            text: textContent,
            offsetY: styleConfig?.text?.offsetY || defaultStyles.Point.text.offsetY,
            fill: new Fill({ color: styleConfig?.text?.color || defaultStyles.Point.text.color }),
            stroke: new Stroke({ 
              color: styleConfig?.text?.strokeColor || defaultStyles.Point.text.strokeColor,
              width: 2
            }),
            font: `${styleConfig?.text?.fontSize || defaultStyles.Point.text.fontSize}px Arial`,
          }));
        }
      }
      
      return circleStyle;
    }
  };

  // Extrair legendas
  const extractLegend = (geoJsonData) => {
    const features = geoJsonData.features || [];
    const propertiesMap = new Map();
    
    features.forEach(feature => {
      const props = feature.properties;
      Object.keys(props).forEach(key => {
        if (!propertiesMap.has(key)) {
          propertiesMap.set(key, new Set());
        }
        const value = props[key];
        if (value && typeof value !== 'object') {
          propertiesMap.get(key).add(String(value));
        }
      });
    });
    
    const legend = [];
    propertiesMap.forEach((values, key) => {
      if (values.size <= 10) {
        legend.push({
          property: key,
          values: Array.from(values),
        });
      }
    });
    
    return legend;
  };

  // Carregar do localStorage
  useEffect(() => {
    const saved = localStorage.getItem('custom_layers');
    if (saved && mapInstance) {
      const savedLayers = JSON.parse(saved);
      savedLayers.forEach(layerData => {
        if (layerData.geoJson) {
          addLayer(layerData.name, layerData.geoJson, layerData.style, false);
        }
      });
    }
  }, [mapInstance]);

  // Adicionar camada
  const addLayer = useCallback((name, geoJson, customStyle = null, save = true) => {
    if (!mapInstance) return null;

    const layerId = `${Date.now()}_${name}`;
    const source = new VectorSource({
      features: new GeoJSON().readFeatures(geoJson, {
        dataProjection: 'EPSG:4326',
        featureProjection: 'EPSG:3857',
      }),
    });

    // Detectar tipo de geometria principal
    const features = source.getFeatures();
    let primaryType = 'Point';
    if (features.length > 0) {
      const type = features[0].getGeometry()?.getType();
      if (type?.includes('Polygon')) primaryType = 'Polygon';
      else if (type?.includes('Line')) primaryType = 'LineString';
    }

    const styleConfig = customStyle || defaultStyles[primaryType];
    
    const styleFunction = (feature) => applyCustomStyle(styleConfig, feature);
    
    const layer = new VectorLayer({
      source,
      style: styleFunction,
      opacity: 1,
      visible: true,
      properties: { id: layerId, name, type: 'custom' },
    });

    const legend = extractLegend(geoJson);
    
    mapInstance.addLayer(layer);
    
    const newLayer = {
      id: layerId,
      name,
      visible: true,
      opacity: 1,
      legend,
      style: styleConfig,
      primaryType,
      geoJson: save ? geoJson : null,
    };
    
    layersRef.current.set(layerId, { layer, source, style: styleFunction });
    setLayers(prev => [...prev, newLayer]);
    
    if (save) {
      saveToLocalStorage();
    }
    
    return layerId;
  }, [mapInstance]);

  // Atualizar estilo da camada
  const updateLayerStyle = useCallback((layerId, newStyle) => {
    const layerData = layersRef.current.get(layerId);
    if (!layerData || !mapInstance) return;

    const styleFunction = (feature) => applyCustomStyle(newStyle, feature);
    layerData.layer.setStyle(styleFunction);
    
    setLayers(prev => prev.map(layer => 
      layer.id === layerId 
        ? { ...layer, style: newStyle }
        : layer
    ));
    
    // Salvar no localStorage
    saveToLocalStorage();
  }, [mapInstance]);

  // Remover camada
  const removeLayer = useCallback((layerId) => {
    const layerData = layersRef.current.get(layerId);
    if (layerData && mapInstance) {
      mapInstance.removeLayer(layerData.layer);
      layersRef.current.delete(layerId);
      setLayers(prev => prev.filter(l => l.id !== layerId));
      saveToLocalStorage();
    }
  }, [mapInstance]);

  // Toggle visibilidade
  const toggleVisibility = useCallback((layerId) => {
    const layerData = layersRef.current.get(layerId);
    if (layerData) {
      const newVisible = !layerData.layer.getVisible();
      layerData.layer.setVisible(newVisible);
      setLayers(prev => prev.map(l => 
        l.id === layerId ? { ...l, visible: newVisible } : l
      ));
      saveToLocalStorage();
    }
  }, []);

  // Alterar opacidade
  const setOpacity = useCallback((layerId, opacity) => {
    const layerData = layersRef.current.get(layerId);
    if (layerData) {
      layerData.layer.setOpacity(opacity);
      setLayers(prev => prev.map(l => 
        l.id === layerId ? { ...l, opacity } : l
      ));
      saveToLocalStorage();
    }
  }, []);

  // Salvar no localStorage
  const saveToLocalStorage = useCallback(() => {
    const toSave = layers
      .filter(l => l.geoJson)
      .map(l => ({
        id: l.id,
        name: l.name,
        geoJson: l.geoJson,
        visible: l.visible,
        opacity: l.opacity,
        style: l.style,
        primaryType: l.primaryType,
      }));
    localStorage.setItem('custom_layers', JSON.stringify(toSave));
  }, [layers]);

  return {
    layers,
    addLayer,
    removeLayer,
    toggleVisibility,
    setOpacity,
    updateLayerStyle,
  };
};
