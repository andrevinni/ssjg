// src/components/LayerManager/LayerManager.jsx
import { useState } from 'react';
import './LayerManager.scss';

export const LayerManager = ({ mapInstance, onAddLayer, layers, onToggle, onRemove, onOpacityChange }) => {
  const [isOpen, setIsOpen] = useState(false);
  const [showAddModal, setShowAddModal] = useState(false);
  const [layerName, setLayerName] = useState('');
  const [geoJsonText, setGeoJsonText] = useState('');
  const [error, setError] = useState('');

  const handleAddLayer = () => {
    setError('');
    
    if (!layerName.trim()) {
      setError('Nome da camada é obrigatório');
      return;
    }
    
    if (!geoJsonText.trim()) {
      setError('GeoJSON é obrigatório');
      return;
    }
    
    try {
      const geoJson = JSON.parse(geoJsonText);
      if (!geoJson.type || !geoJson.features) {
        throw new Error('GeoJSON inválido');
      }
      
      onAddLayer(layerName, geoJson);
      setLayerName('');
      setGeoJsonText('');
      setShowAddModal(false);
    } catch (err) {
      setError('GeoJSON inválido: ' + err.message);
    }
  };

  const handleFileUpload = (event) => {
    const file = event.target.files[0];
    if (!file) return;
    
    const reader = new FileReader();
    reader.onload = (e) => {
      try {
        const geoJson = JSON.parse(e.target.result);
        setGeoJsonText(JSON.stringify(geoJson, null, 2));
        setError('');
      } catch (err) {
        setError('Erro ao ler arquivo: ' + err.message);
      }
    };
    reader.readAsText(file);
  };

  return (
    <>
      {/* Botão toggle */}
      <button 
        className={`layer-toggle-btn ${isOpen ? 'active' : ''}`}
        onClick={() => setIsOpen(!isOpen)}
        title="Gerenciar Camadas"
      >
        🗺️
      </button>

      {/* Painel de camadas */}
      {isOpen && (
        <div className="layer-manager-panel">
          <div className="layer-manager-header">
            <h3>Camadas Personalizadas</h3>
            <button 
              className="close-btn"
              onClick={() => setIsOpen(false)}
            >
              ✕
            </button>
          </div>
          
          <div className="layer-manager-content">
            <button 
              className="add-layer-btn"
              onClick={() => setShowAddModal(true)}
            >
              + Adicionar Camada GeoJSON
            </button>
            
            <div className="layers-list">
              {layers.length === 0 && (
                <div className="empty-state">
                  Nenhuma camada personalizada
                </div>
              )}
              
              {layers.map(layer => (
                <div key={layer.id} className="layer-item">
                  <div className="layer-header">
                    <button 
                      className={`visibility-btn ${layer.visible ? 'visible' : 'hidden'}`}
                      onClick={() => onToggle(layer.id)}
                      title={layer.visible ? 'Ocultar' : 'Mostrar'}
                    >
                      {layer.visible ? '👁️' : '👁️‍🗨️'}
                    </button>
                    
                    <span className="layer-name">{layer.name}</span>
                    
                    <button 
                      className="remove-btn"
                      onClick={() => onRemove(layer.id)}
                      title="Remover camada"
                    >
                      🗑️
                    </button>
                  </div>
                  
                  <div className="layer-controls">
                    <label>
                      Opacidade: 
                      <input 
                        type="range"
                        min="0"
                        max="1"
                        step="0.05"
                        value={layer.opacity}
                        onChange={(e) => onOpacityChange(layer.id, parseFloat(e.target.value))}
                      />
                      <span>{Math.round(layer.opacity * 100)}%</span>
                    </label>
                  </div>
                  
                  {layer.legend && layer.legend.length > 0 && (
                    <div className="layer-legend">
                      <strong>Legenda:</strong>
                      {layer.legend.map((item, idx) => (
                        <div key={idx} className="legend-item">
                          <span className="legend-property">{item.property}:</span>
                          <div className="legend-values">
                            {item.values.map((val, vIdx) => (
                              <span key={vIdx} className="legend-value">{val}</span>
                            ))}
                          </div>
                        </div>
                      ))}
                    </div>
                  )}
                </div>
              ))}
            </div>
          </div>
        </div>
      )}

      {/* Modal para adicionar camada */}
      {showAddModal && (
        <div className="layer-modal-overlay" onClick={() => setShowAddModal(false)}>
          <div className="layer-modal" onClick={(e) => e.stopPropagation()}>
            <h3>Adicionar Camada GeoJSON</h3>
            
            <div className="form-group">
              <label>Nome da Camada:</label>
              <input 
                type="text"
                value={layerName}
                onChange={(e) => setLayerName(e.target.value)}
                placeholder="Ex: Limites Municipais"
              />
            </div>
            
            <div className="form-group">
              <label>GeoJSON (cole ou faça upload):</label>
              <textarea 
                value={geoJsonText}
                onChange={(e) => setGeoJsonText(e.target.value)}
                placeholder='{"type":"FeatureCollection","features":[...]}'
                rows={10}
              />
              <input 
                type="file"
                accept=".geojson,.json"
                onChange={handleFileUpload}
                style={{ marginTop: '8px' }}
              />
            </div>
            
            {error && <div className="error-message">{error}</div>}
            
            <div className="modal-buttons">
              <button onClick={() => setShowAddModal(false)}>Cancelar</button>
              <button onClick={handleAddLayer}>Adicionar</button>
            </div>
          </div>
        </div>
      )}
    </>
  );
};
