// Adicione no LayerManager.jsx, dentro do layer-item, após o botão de remover:

import { StyleEditor } from './StyleEditor';
import { useState } from 'react';

// Dentro do componente LayerManager, adicione:
const [editingLayer, setEditingLayer] = useState(null);

// No JSX, dentro do layer-header, adicione:
<button 
  className="style-btn"
  onClick={() => setEditingLayer(layer)}
  title="Editar estilo"
>
  🎨
</button>

// No final do componente, antes da closing tag do fragment:
{editingLayer && (
  <StyleEditor 
    layer={editingLayer}
    onUpdateStyle={(newStyle) => {
      onUpdateStyle(editingLayer.id, newStyle);
    }}
    onClose={() => setEditingLayer(null)}
  />
)}


// Adicione no LayerManager.scss, dentro de .layer-header:
.style-btn {
  background: none;
  border: none;
  cursor: pointer;
  font-size: 16px;
  padding: 4px;
  
  &:hover {
    transform: scale(1.1);
  }
}


// Adicione updateLayerStyle nas props do LayerManager:
<LayerManager 
  mapInstance={mapInstRef.current}
  layers={layers}
  onAddLayer={addLayer}
  onRemove={removeLayer}
  onToggle={toggleVisibility}
  onOpacityChange={setOpacity}
  onUpdateStyle={updateLayerStyle}  // NOVA LINHA
/>


