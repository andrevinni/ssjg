const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    baseUrl: 'http://localhost:3000', // URL do seu app React
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
    env: {
      keycloakUrl: 'http://localhost:8080', // URL do Keycloak
      realm: 'seu-realm',
      clientId: 'seu-client-id',
      username: 'testuser',
      password: 'password123'
    }
  },
});




Cypress.Commands.add('loginKeycloak', (username, password) => {
  const url = `${Cypress.env('keycloakUrl')}/realms/${Cypress.env('realm')}/protocol/openid-connect/token`;
  
  // Requisição POST para obter o token
  cy.request({
    method: 'POST',
    url: url,
    form: true, // Keycloak espera 'application/x-www-form-urlencoded'
    body: {
      grant_type: 'password',
      client_id: Cypress.env('clientId'),
      username: username,
      password: password,
      scope: 'openid'
    },
  }).then((response) => {
    // Salva o token no localStorage ou sessionStorage, 
    // dependendo de como sua app React (ex: keycloak-js) espera
    window.localStorage.setItem('keycloak_token', response.body.access_token);
    window.localStorage.setItem('keycloak_refresh_token', response.body.refresh_token);
  });
});
