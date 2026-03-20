// ✅ TESTE 4: Logout com token injetado (CORRIGIDO - COM MENU DROPDOWN)
test('Deve fazer logout e limpar token', async ({ page }) => {
  if (!DEV_TOKEN) {
    console.log('ℹ️ Pulando teste - token não configurado');
    return;
  }
  
  console.log('🔍 Iniciando teste de logout...');
  
  // 1. Injeta token e vai para home
  await page.context().addCookies([{
    name: 'access_token',
    value: DEV_TOKEN,
    domain: 'localhost',
    path: '/'
  }]);
  
  await page.goto('/home');
  await page.waitForLoadState('networkidle');
  await page.waitForTimeout(1000);
  
  console.log(`📍 URL atual: ${page.url()}`);
  
  // 2. Primeiro, clica no avatar/área do usuário para abrir o menu dropdown
  // Tenta diferentes seletores para o avatar/área do usuário
  const userAreaSelectors = [
    page.getByText(/Olá, usuário/i),
    page.getByText(/Olá,/i),
    page.getByRole('button', { name: /usuário/i }),
    page.locator('[data-testid="user-menu"]'),
    page.locator('.user-avatar'),
    page.locator('.avatar'),
    page.locator('img[alt*="avatar"]'),
    page.locator('img[alt*="usuario"]'),
    page.locator('header button:last-child'), // Último botão do header
    page.locator('header div:has-text("Olá")')
  ];
  
  let userMenuButton = null;
  for (const selector of userAreaSelectors) {
    if (await selector.count() > 0) {
      userMenuButton = selector.first();
      console.log(`✅ Área do usuário encontrada: ${await userMenuButton.textContent() || 'elemento'}`);
      break;
    }
  }
  
  if (!userMenuButton) {
    console.log('⚠️ Área do usuário não encontrada!');
    console.log('💡 Listando todos os elementos com texto "Olá":');
    const olaElements = await page.getByText(/Olá/).all();
    for (const el of olaElements) {
      console.log(`   - ${await el.textContent()}`);
    }
    await page.screenshot({ path: 'erro-user-area-nao-encontrada.png' });
    return;
  }
  
  // 3. Clica na área do usuário para abrir o menu dropdown
  console.log('🖱️ Clicando na área do usuário para abrir o menu...');
  await userMenuButton.click();
  await page.waitForTimeout(500); // Aguarda o menu abrir
  
  // 4. Agora procura pelo botão "Sair" no menu dropdown
  const logoutButton = page.getByRole('button', { name: /sair/i });
  
  // Verifica se o botão Sair está visível
  const isLogoutVisible = await logoutButton.isVisible();
  if (!isLogoutVisible) {
    console.log('❌ Botão Sair não encontrado no menu!');
    console.log('💡 Listando todos os botões visíveis no momento:');
    const visibleButtons = await page.getByRole('button').all();
    for (let i = 0; i < visibleButtons.length; i++) {
      const text = await visibleButtons[i].textContent();
      const isVisible = await visibleButtons[i].isVisible();
      if (isVisible) {
        console.log(`   - Botão: "${text}"`);
      }
    }
    await page.screenshot({ path: 'erro-logout-nao-encontrado.png' });
    return;
  }
  
  console.log('✅ Botão "Sair" encontrado no menu dropdown');
  
  // 5. Clica em Sair e aguarda redirecionamento
  console.log('🖱️ Clicando em Sair...');
  await Promise.all([
    page.waitForURL('/', { timeout: 10000 }),
    logoutButton.click()
  ]);
  
  // 6. Verifica se voltou para página de login
  await page.waitForTimeout(1000);
  const currentUrl = page.url();
  console.log(`📍 URL após logout: ${currentUrl}`);
  
  if (currentUrl.includes('/home')) {
    console.log('❌ Ainda está na home - logout não funcionou');
    await page.screenshot({ path: 'erro-logout-falhou.png' });
  } else {
    console.log('✅ Redirecionado para página inicial');
    
    // Verifica se o botão de login apareceu
    const loginButton = page.getByRole('button', { name: 'Autenticar' });
    await expect(loginButton).toBeVisible();
    console.log('✅ Página de login visível');
  }
  
  // 7. Verifica se o cookie foi removido
  const cookies = await page.context().cookies();
  const tokenCookie = cookies.find(c => c.name === 'access_token');
  
  if (tokenCookie) {
    console.log(`❌ Cookie ainda existe!`);
  } else {
    console.log('✅ Cookie access_token removido com sucesso');
  }
  
  expect(tokenCookie).toBeUndefined();
});
