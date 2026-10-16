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
