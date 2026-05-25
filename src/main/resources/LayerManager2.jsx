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
