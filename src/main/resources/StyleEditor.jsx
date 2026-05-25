// src/components/LayerManager/StyleEditor.jsx
import { useState } from 'react';
import './StyleEditor.scss';

export const StyleEditor = ({ layer, onUpdateStyle, onClose }) => {
  const [style, setStyle] = useState(layer.style);
  const [activeTab, setActiveTab] = useState('fill');

  const handleStyleChange = (category, property, value) => {
    const newStyle = {
      ...style,
      [category]: {
        ...style[category],
        [property]: value
      }
    };
    setStyle(newStyle);
    onUpdateStyle(newStyle);
  };

  const renderPolygonControls = () => (
    <>
      <div className="style-group">
        <label>Cor de Preenchimento</label>
        <div className="color-control">
          <input
            type="color"
            value={style.fill?.color?.replace(/[^#\d]/g, '') || '#4285f4'}
            onChange={(e) => {
              const newColor = e.target.value + 'cc';
              handleStyleChange('fill', 'color', newColor);
            }}
          />
          <input
            type="range"
            min="0"
            max="1"
            step="0.05"
            value={parseFloat(style.fill?.color?.match(/[\d.]+/g)?.[3] || 0.3)}
            onChange={(e) => {
              const opacity = parseFloat(e.target.value);
              const baseColor = style.fill?.color?.slice(0, -2) || '#4285f4';
              handleStyleChange('fill', 'color', `${baseColor}${Math.floor(opacity * 255).toString(16).padStart(2, '0')}`);
            }}
          />
          <span>{Math.round((parseFloat(style.fill?.color?.match(/[\d.]+/g)?.[3] || 0.3)) * 100)}%</span>
        </div>
      </div>

      <div className="style-group">
        <label>Borda</label>
        <div className="color-control">
          <input
            type="color"
            value={style.stroke?.color || '#4285f4'}
            onChange={(e) => handleStyleChange('stroke', 'color', e.target.value)}
          />
          <input
            type="range"
            min="0"
            max="10"
            step="0.5"
            value={style.stroke?.width || 2}
            onChange={(e) => handleStyleChange('stroke', 'width', parseFloat(e.target.value))}
          />
          <span>{style.stroke?.width || 2}px</span>
        </div>
      </div>
    </>
  );

  const renderLineControls = () => (
    <>
      <div className="style-group">
        <label>Cor da Linha</label>
        <input
          type="color"
          value={style.stroke?.color || '#ea4335'}
          onChange={(e) => handleStyleChange('stroke', 'color', e.target.value)}
        />
      </div>

      <div className="style-group">
        <label>Espessura</label>
        <input
          type="range"
          min="1"
          max="10"
          step="0.5"
          value={style.stroke?.width || 3}
          onChange={(e) => handleStyleChange('stroke', 'width', parseFloat(e.target.value))}
        />
        <span>{style.stroke?.width || 3}px</span>
      </div>

      <div className="style-group">
        <label>
          <input
            type="checkbox"
            checked={!!style.stroke?.lineDash}
            onChange={(e) => {
              if (e.target.checked) {
                handleStyleChange('stroke', 'lineDash', [10, 10]);
              } else {
                handleStyleChange('stroke', 'lineDash', undefined);
              }
            }}
          />
          Linha Tracejada
        </label>
      </div>
    </>
  );

  const renderPointControls = () => (
    <>
      <div className="style-group">
        <label>Cor do Ponto</label>
        <input
          type="color"
          value={style.circle?.color || '#4285f4'}
          onChange={(e) => handleStyleChange('circle', 'color', e.target.value)}
        />
      </div>

      <div className="style-group">
        <label>Tamanho do Ponto</label>
        <input
          type="range"
          min="4"
          max="20"
          step="1"
          value={style.circle?.radius || 8}
          onChange={(e) => handleStyleChange('circle', 'radius', parseInt(e.target.value))}
        />
        <span>{style.circle?.radius || 8}px</span>
      </div>

      <div className="style-group">
        <label>Borda do Ponto</label>
        <div className="color-control">
          <input
            type="color"
            value={style.circle?.strokeColor || '#ffffff'}
            onChange={(e) => handleStyleChange('circle', 'strokeColor', e.target.value)}
          />
          <input
            type="range"
            min="0"
            max="5"
            step="0.5"
            value={style.circle?.strokeWidth || 2}
            onChange={(e) => handleStyleChange('circle', 'strokeWidth', parseFloat(e.target.value))}
          />
        </div>
      </div>

      <div className="style-group">
        <label>
          <input
            type="checkbox"
            checked={style.text?.show !== false}
            onChange={(e) => handleStyleChange('text', 'show', e.target.checked)}
          />
          Mostrar Rótulos
        </label>
      </div>

      {style.text?.show !== false && (
        <>
          <div className="style-group">
            <label>Cor do Texto</label>
            <input
              type="color"
              value={style.text?.color || '#ffffff'}
              onChange={(e) => handleStyleChange('text', 'color', e.target.value)}
            />
          </div>

          <div className="style-group">
            <label>Tamanho do Texto</label>
            <input
              type="range"
              min="8"
              max="20"
              step="1"
              value={style.text?.fontSize || 12}
              onChange={(e) => handleStyleChange('text', 'fontSize', parseInt(e.target.value))}
            />
            <span>{style.text?.fontSize || 12}px</span>
          </div>
        </>
      )}
    </>
  );

  return (
    <div className="style-editor-overlay" onClick={onClose}>
      <div className="style-editor" onClick={(e) => e.stopPropagation()}>
        <div className="style-editor-header">
          <h3>Editar Estilo: {layer.name}</h3>
          <button className="close-btn" onClick={onClose}>✕</button>
        </div>

        <div className="style-tabs">
          {layer.primaryType === 'Polygon' && (
            <>
              <button 
                className={activeTab === 'fill' ? 'active' : ''}
                onClick={() => setActiveTab('fill')}
              >
                Preenchimento
              </button>
              <button 
                className={activeTab === 'border' ? 'active' : ''}
                onClick={() => setActiveTab('border')}
              >
                Borda
              </button>
            </>
          )}
          {layer.primaryType === 'LineString' && (
            <button className="active">Linha</button>
          )}
          {layer.primaryType === 'Point' && (
            <>
              <button 
                className={activeTab === 'point' ? 'active' : ''}
                onClick={() => setActiveTab('point')}
              >
                Ponto
              </button>
              <button 
                className={activeTab === 'label' ? 'active' : ''}
                onClick={() => setActiveTab('label')}
              >
                Rótulo
              </button>
            </>
          )}
        </div>

        <div className="style-content">
          {layer.primaryType === 'Polygon' && activeTab === 'fill' && renderPolygonControls()}
          {layer.primaryType === 'Polygon' && activeTab === 'border' && renderLineControls()}
          {layer.primaryType === 'LineString' && renderLineControls()}
          {layer.primaryType === 'Point' && activeTab === 'point' && renderPointControls()}
          {layer.primaryType === 'Point' && activeTab === 'label' && (
            <div className="style-group">
              <p className="info-text">
                Os rótulos usam as propriedades 'nome', 'NOME' ou 'name' do GeoJSON
              </p>
            </div>
          )}
        </div>

        <div className="style-preview">
          <h4>Preview</h4>
          <div className="preview-box">
            {layer.primaryType === 'Polygon' && (
              <div className="preview-polygon" style={{
                backgroundColor: style.fill?.color || '#4285f4cc',
                border: `${style.stroke?.width || 2}px solid ${style.stroke?.color || '#4285f4'}`
              }} />
            )}
            {layer.primaryType === 'LineString' && (
              <div className="preview-line" style={{
                borderBottom: `${style.stroke?.width || 3}px solid ${style.stroke?.color || '#ea4335'}`,
                ...(style.stroke?.lineDash && { borderBottomStyle: 'dashed' })
              }} />
            )}
            {layer.primaryType === 'Point' && (
              <div className="preview-point">
                <div className="point-marker" style={{
                  width: `${(style.circle?.radius || 8) * 2}px`,
                  height: `${(style.circle?.radius || 8) * 2}px`,
                  backgroundColor: style.circle?.color || '#4285f4',
                  border: `${style.circle?.strokeWidth || 2}px solid ${style.circle?.strokeColor || '#fff'}`
                }}>
                  {style.text?.show !== false && (
                    <span style={{
                      color: style.text?.color || '#fff',
                      fontSize: `${style.text?.fontSize || 12}px`
                    }}>
                      Aa
                    </span>
                  )}
                </div>
              </div>
            )}
          </div>
        </div>
      </div>
    </div>
  );
};
