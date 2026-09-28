cy.getOlMap().then((map) => {
  expect(map.getView().getZoom()).to.eq(5);
});

cy.getOlLayerByZ(10).then((umsLayer) => {          // umsLayer
  const feats = umsLayer.getSource().getFeatures();
  expect(feats.length).to.be.greaterThan(0);
});
