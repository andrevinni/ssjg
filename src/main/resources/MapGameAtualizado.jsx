// Adicione no topo dos imports:
import { LayerManager } from "../LayerManager/LayerManager";
import { useCustomLayers } from "../LayerManager/hooks/useCustomLayers";

// Dentro do componente MapGame, depois dos useRefs existentes:
const { layers, addLayer, removeLayer, toggleVisibility, setOpacity } = useCustomLayers(mapInstRef.current);

// No return, adicione o LayerManager junto com os outros botões:
{mapInstRef.current && (
  <LayerManager 
    mapInstance={mapInstRef.current}
    layers={layers}
    onAddLayer={addLayer}
    onRemove={removeLayer}
    onToggle={toggleVisibility}
    onOpacityChange={setOpacity}
  />
)}
