// src/components/LayerManager/hooks/useCustomLayers.js
import { useState, useEffect, useCallback, useRef } from 'react';
import VectorLayer from 'ol/layer/Vector';
import VectorSource from 'ol/source/Vector';
import GeoJSON from 'ol/format/GeoJSON';
import { Style, Fill, Stroke, Circle, Text } from 'ol/style';

export const useCustomLayers = (mapInstance) => {
  const [layers, setLayers] = useState([]);
  const layersRef = useRef(new Map()); // layerId -> { layer, source, style }

  // Estilos padrão para GeoJSON
  const getDefaultStyle = (feature) => {
    const geometryType = feature.getGeometry()?.getType();
    const properties = feature.getProperties();
    
    // Polígonos
    if (geometryType === 'Polygon' || geometryType === 'MultiPolygon') {
      return new Style({
        fill: new Fill({ color: 'rgba(66, 133, 244, 0.3)' }),
        stroke: new Stroke({ color: '#4285f4', width: 2 }),
      });
    }
    // Linhas
    else if (geometryType === 'LineString' || geometryType === 'MultiLineString') {
      return new Style({
        stroke: new Stroke({ color: '#ea4335', width: 3 }),
      });
    }
    // Pontos
    else {
      const partido = properties.partido || properties.PARTIDO;
      let color = '#4285f4';
      if (partido === 'VERMELHO') color = '#ea4335';
      if (partido === 'AZUL') color = '#4285f4';
      
      return new Style({
        image: new Circle({
          radius: 8,
          fill: new Fill({ color: color + 'cc' }),
          stroke: new Stroke({ color: '#fff', width: 2 }),
        }),
        text: new Text({
          text: properties.nome || properties.NOME || '',
          offsetY: -15,
          fill: new Fill({ color: '#fff' }),
          stroke: new Stroke({ color: '#000', width: 2 }),
          font: '12px Arial',
        }),
      });
    }
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

  // Extrair legendas do GeoJSON
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
      if (values.size <= 10) { // Só mostra legendas com até 10 valores únicos
        legend.push({
          property: key,
          values: Array.from(values),
        });
      }
    });
    
    return legend;
  };

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

    const styleFunction = customStyle || ((feature) => getDefaultStyle(feature));
    
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
      geoJson: save ? geoJson : null, // Só salva se necessário
    };
    
    layersRef.current.set(layerId, { layer, source, style: styleFunction });
    setLayers(prev => [...prev, newLayer]);
    
    if (save) {
      saveToLocalStorage();
    }
    
    return layerId;
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
      }));
    localStorage.setItem('custom_layers', JSON.stringify(toSave));
  }, [layers]);

  // Sync com backend (exemplo)
  const syncToBackend = useCallback(async (userId) => {
    const layersToSync = layers.filter(l => l.geoJson);
    try {
      const response = await fetch('/api/user-layers', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ userId, layers: layersToSync }),
      });
      return response.ok;
    } catch (error) {
      console.error('Erro ao sincronizar:', error);
      return false;
    }
  }, [layers]);

  return {
    layers,
    addLayer,
    removeLayer,
    toggleVisibility,
    setOpacity,
    syncToBackend,
  };
};
