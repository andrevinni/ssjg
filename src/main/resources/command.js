// Função recursiva de sincronização dinâmica baseada no JSON real do jogo
function sincronizarCinematicaComMock(idAeronave, lonAlvo, latAlvo, tentativas = 0) {
  // Limite de segurança (120 tentativas * 5s = 10 minutos)
  if (tentativas > 120) {
    throw new Error(`Timeout: A aeronave ${idAeronave} não atingiu o alvo na cinemática real.`);
  }

  // 1. Busca os dados reais diretamente da API do jogo
  cy.request("GET", "http://10.5.112.199/ssjg/jogos/1/cenario").then((response) => {
    const payloadReal = response.body;
    let dadosAviao = null;

    // 2. Vasculha as bases e as plataformas para achar a aeronave alvo
    payloadReal.cenario.bases.forEach((base) => {
      if (base.plataformas && base.plataformas.length > 0) {
        const achou = base.plataformas.find(p => p.nome === idAeronave);
        if (achou) dadosAviao = achou;
      }
    });

    if (!dadosAviao) {
      throw new Error(`Aeronave ${idAeronave} não encontrada em nenhuma plataforma do cenário real.`);
    }

    // 3. ATUALIZA O MOCK NA MEMÓRIA: Alimenta o frontend com os dados vivos obtidos
    // Substitua '**/sua-rota-de-mock-local' pela URL relativa que o seu frontend consome para ler o mock
    cy.intercept("GET", "**/sua-rota-de-mock-local", { body: payloadReal }).as("mockSincronizado");

    // 4. Captura as coordenadas decimais diretas fornecidas pelo backend
    const lonAtual = dadosAviao.coordenadas.decimal.longitude;
    const latAtual = dadosAviao.coordenadas.decimal.latitude;

    // Aplica uma margem de tolerância aceitável para considerar que chegou no alvo (ex: 0.001 graus)
    const chegouNoAlvo = Math.abs(lonAtual - lonAlvo) < 0.001 && Math.abs(latAtual - latAlvo) < 0.001;

    if (chegouNoAlvo) {
      cy.log(`🎯 Sucesso! A cinemática confirmou que ${idAeronave} pousou/atingiu as coordenadas alvo.`);
      return; // Sai da recursão e prossegue com o fluxo do teste
    }

    // Se o avião ainda estiver se deslocando na física do backend, aguarda 5 segundos e repete o loop
    cy.wait(5000);
    sincronizarCinematicaComMock(idAeronave, lonAlvo, latAlvo, tentativas + 1);
  });
}














// Função recursiva de sincronização injetando os dados reais na Fixture local
function sincronizarCinematicaNaFixture(idAeronave, lonAlvo, latAlvo, token, tentativas = 0) {
  if (tentativas > 120) {
    throw new Error(`Timeout: A aeronave ${idAeronave} não atingiu o alvo na cinemática real.`);
  }

  // 1. Faz a requisição HTTP passando o token de autorização no Header
  cy.request({
    method: "GET",
    url: "http://10.5.112",
    headers: {
      Authorization: `Bearer ${token}` // Ou o formato que seu backend exigir (ex: 'Token XYZ')
    }
  }).then((response) => {
    const payloadReal = response.body;
    let dadosAviao = null;

    // 2. Procura a aeronave dentro das plataformas das bases
    payloadReal.cenario.bases.forEach((base) => {
      if (base.plataformas && base.plataformas.length > 0) {
        const achou = base.plataformas.find(p => p.nome === idAeronave);
        if (achou) dadosAviao = achou;
      }
    });

    if (!dadosAviao) {
      throw new Error(`Aeronave ${idAeronave} não encontrada no cenário real.`);
    }

    // 3. ATUALIZA O ARQUIVO FÍSICO: Sobrescreve a fixture mockada que o app consome
    // Isso garante que o frontend leia os dados atualizados sem afetar permanentemente o Git, 
    // pois o arquivo é atualizado dinamicamente em tempo de execução.
    cy.writeFile("cypress/fixtures/cenario.json", payloadReal);

    // 4. Captura as coordenadas decimais diretas
    const lonAtual = dadosAviao.coordenadas.decimal.longitude;
    const latAtual = dadosAviao.coordenadas.decimal.latitude;

    // Margem de tolerância aceitável (0.001 graus)
    const chegouNoAlvo = Math.abs(lonAtual - lonAlvo) < 0.001 && Math.abs(latAtual - latAlvo) < 0.001;

    if (chegouNoAlvo) {
      cy.log(`🎯 Sucesso! ${idAeronave} chegou nas coordenadas alvo no backend.`);
      return; // Sai da recursão e prossegue com o teste
    }

    // Se ainda estiver em trânsito, espera 5 segundos e repete o processo
    cy.wait(5000);
    sincronizarCinematicaNaFixture(idAeronave, lonAlvo, latAlvo, token, tentativas + 1);
  });
}

