// cypress/support/olMap.js
const isOlMap = (v) =>
  v &&
  typeof v.getView === 'function' &&
  typeof v.getLayers === 'function' &&
  typeof v.getTargetElement === 'function';

function findOlMap(startEl) {
  // .ol-viewport é criado pelo OL (sem fiber): sobe até um elemento gerenciado pelo React
  let node = startEl;
  let key;
  while (node && !key) {
    key = Object.keys(node).find(
      (k) => k.startsWith('__reactFiber$') || k.startsWith('__reactInternalInstance$')
    );
    if (!key) node = node.parentElement;
  }
  if (!key) return null;

  let fiber = node[key];
  while (fiber) {
    let hook = fiber.memoizedState;
    while (hook && typeof hook === 'object') {
      const s = hook.memoizedState;
      if (isOlMap(s)) return s;            // useState
      if (isOlMap(s?.current)) return s.current; // useRef (mapInstRef)
      hook = hook.next;
    }
    fiber = fiber.return;
  }
  return null;
}

Cypress.Commands.add('getOlMap', () => {
  let map;
  return cy
    .get('.ol-viewport', { timeout: 15000 })
    .should(($vp) => {
      map = findOlMap($vp[0]);
      expect(map, 'OpenLayers map via React fiber').to.exist;
    })
    .then(() => map);
});

// Camadas: sem o _layers do seu patch, use o zIndex do código original
Cypress.Commands.add('getOlLayerByZ', (z) =>
  cy.getOlMap().then((map) =>
    map.getLayers().getArray().find((l) => l.getZIndex() === z)
  )
);
