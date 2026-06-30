// cypress/e2e/map-draw-toolbar.cy.js

describe('Testes da DrawToolbar no Mapa', () => {
  beforeEach(() => {
    // Acessa a página do mapa - ajuste a rota conforme seu app
    cy.visit('/mapa/jogo-id/cenario-id'); // ou a rota correta
    
    // Aguarda o mapa carregar completamente
    cy.get('.map-container .ol-viewport', { timeout: 10000 }).should('be.visible');
    
    // Aguarda a toolbar ser renderizada
    cy.get('[data-testid="draw-toolbar"]', { timeout: 5000 }).should('be.visible');
  });

  // ============ TESTES DE CLIQUE ============
  
  it('deve clicar no botão Polygon e ativá-lo', () => {
    // Clica no botão Polygon
    cy.get('[data-testid="tool-polygon"]').click();
    
    // Verifica se ficou ativo (classe active)
    cy.get('[data-testid="tool-polygon"]').should('have.class', 'active');
    
    // Verifica se outros botões não estão ativos
    cy.get('[data-testid="tool-circle"]').should('not.have.class', 'active');
    cy.get('[data-testid="tool-linestring"]').should('not.have.class', 'active');
    cy.get('[data-testid="tool-grade"]').should('not.have.class', 'active');
  });

  it('deve clicar no botão Circle e ativá-lo', () => {
    cy.get('[data-testid="tool-circle"]').click();
    cy.get('[data-testid="tool-circle"]').should('have.class', 'active');
  });

  it('deve clicar no botão LineString e ativá-lo', () => {
    cy.get('[data-testid="tool-linestring"]').click();
    cy.get('[data-testid="tool-linestring"]').should('have.class', 'active');
  });

  it('deve clicar no botão Grade e ativá-lo', () => {
    cy.get('[data-testid="tool-grade"]').click();
    cy.get('[data-testid="tool-grade"]').should('have.class', 'active');
  });

  // ============ TESTE DE DESATIVAÇÃO ============
  
  it('deve desativar uma ferramenta ao clicar novamente nela', () => {
    // Ativa o Polygon
    cy.get('[data-testid="tool-polygon"]').click();
    cy.get('[data-testid="tool-polygon"]').should('have.class', 'active');
    
    // Clica novamente para desativar
    cy.get('[data-testid="tool-polygon"]').click();
    cy.get('[data-testid="tool-polygon"]').should('not.have.class', 'active');
  });

  // ============ TESTE DE ALTERNÂNCIA ENTRE FERRAMENTAS ============
  
  it('deve alternar entre ferramentas corretamente', () => {
    // Ativa Polygon
    cy.get('[data-testid="tool-polygon"]').click();
    cy.get('[data-testid="tool-polygon"]').should('have.class', 'active');
    
    // Ativa Circle - deve desativar Polygon
    cy.get('[data-testid="tool-circle"]').click();
    cy.get('[data-testid="tool-circle"]').should('have.class', 'active');
    cy.get('[data-testid="tool-polygon"]').should('not.have.class', 'active');
    
    // Ativa LineString - deve desativar Circle
    cy.get('[data-testid="tool-linestring"]').click();
    cy.get('[data-testid="tool-linestring"]').should('have.class', 'active');
    cy.get('[data-testid="tool-circle"]').should('not.have.class', 'active');
  });

  // ============ TESTE DE INTERAÇÃO COM O MAPA ============
  
  it('deve permitir desenhar após ativar ferramenta', () => {
    // Ativa Polygon
    cy.get('[data-testid="tool-polygon"]').click();
    cy.get('[data-testid="tool-polygon"]').should('have.class', 'active');
    
    // Clica no mapa para desenhar um polígono
    const canvas = cy.get('.ol-viewport canvas');
    
    // Desenha um polígono simples (4 cliques)
    canvas.click(100, 100);
    canvas.click(200, 100);
    canvas.click(200, 200);
    canvas.click(100, 200);
    canvas.click(100, 100); // Fecha o polígono
    
    // Verifica se alguma feature foi adicionada (ex: verifica o source)
    // Isso depende de como você quer validar - pode verificar se há elementos no draw source
    // ou se o estado do mapa mudou
    cy.window().then((win) => {
      // Se você expôs o source ou mapInstRef na window para testes
      const drawSource = win.drawSource; // ou win.__drawSource
      // Verifica se há features no source
      expect(drawSource.getFeatures().length).to.be.greaterThan(0);
    });
  });

  it('deve exibir tooltip com coordenadas ao passar mouse no mapa', () => {
    // Move mouse sobre o mapa
    cy.get('.ol-viewport canvas').trigger('mousemove', 150, 150);
    
    // Verifica se o tooltip aparece (se você tem um MapTooltip)
    cy.get('.map-tooltip').should('be.visible');
    // ou verifica o conteúdo
    cy.get('.map-tooltip').should('contain', 'Lat:');
  });

  // ============ TESTE DE COMPORTAMENTO ESPECÍFICO DA GRADE ============
  
  it('deve ativar/desativar a Grade sem afetar outras ferramentas', () => {
    // Ativa a Grade
    cy.get('[data-testid="tool-grade"]').click();
    cy.get('[data-testid="tool-grade"]').should('have.class', 'active');
    
    // Ativa Polygon - Grade deve continuar ativa
    cy.get('[data-testid="tool-polygon"]').click();
    cy.get('[data-testid="tool-polygon"]').should('have.class', 'active');
    cy.get('[data-testid="tool-grade"]').should('have.class', 'active');
    
    // Desativa Polygon
    cy.get('[data-testid="tool-polygon"]').click();
    cy.get('[data-testid="tool-polygon"]').should('not.have.class', 'active');
    cy.get('[data-testid="tool-grade"]').should('have.class', 'active');
    
    // Desativa Grade
    cy.get('[data-testid="tool-grade"]').click();
    cy.get('[data-testid="tool-grade"]').should('not.have.class', 'active');
  });

  // ============ TESTES DE ACESSIBILIDADE ============
  
  it('deve ter titles/tooltips nos botões', () => {
    cy.get('[data-testid="tool-polygon"]').should('have.attr', 'title', 'Consulta Espacial Poligonal');
    cy.get('[data-testid="tool-circle"]').should('have.attr', 'title', 'Consulta Espacial Circular');
    cy.get('[data-testid="tool-linestring"]').should('have.attr', 'title', 'Calcular Distância');
    cy.get('[data-testid="tool-grade"]').should('have.attr', 'title', 'Grade');
  });
});