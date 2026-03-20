// ✅ TESTE 4: Logout - VERSÃO COM DIAGNÓSTICO
test('Deve fazer logout e limpar token', async ({ page }) => {
  if (!DEV_TOKEN) {
    console.log('ℹ️ Pulando teste - token não configurado');
    return;
  }
  
  console.log('🔍 Iniciando teste de logout...');
  
  // Injeta token
  await page.context().addCookies([{
    name: 'access_token',
    value: DEV_TOKEN,
    domain: 'localhost',
    path: '/'
  }]);
  
  await page.goto('/home');
  await page.waitForLoadState('networkidle');
  console.log(`1️⃣ URL: ${page.url()}`);
  
  // Abre menu do usuário
  const userArea = page.getByText(/Olá, usuário/i);
  await userArea.waitFor({ state: 'visible', timeout: 5000 });
  await userArea.click();
  await page.waitForTimeout(500);
  console.log('2️⃣ Menu do usuário aberto');
  
  // Clica em Sair
  const logoutButton = page.getByRole('button', { name: /sair/i });
  await logoutButton.waitFor({ state: 'visible', timeout: 3000 });
  console.log('3️⃣ Botão Sair encontrado');
  
  // Clica e monitora
  console.log('4️⃣ Clicando em Sair...');
  await logoutButton.click();
  
  // Aguarda qualquer mudança de URL
  console.log('5️⃣ Aguardando mudança de URL...');
  await page.waitForTimeout(3000);
  
  const currentUrl = page.url();
  console.log(`6️⃣ URL após clique: ${currentUrl}`);
  
  // Se ainda está na home, tenta aguardar mais
  if (currentUrl.includes('/home')) {
    console.log('7️⃣ Ainda na home, aguardando mais 3 segundos...');
    await page.waitForTimeout(3000);
    const newUrl = page.url();
    console.log(`8️⃣ URL após espera: ${newUrl}`);
  }
  
  // Verifica cookie
  const cookies = await page.context().cookies();
  const tokenCookie = cookies.find(c => c.name === 'access_token');
  
  if (!tokenCookie) {
    console.log('✅ Cookie removido!');
  } else {
    console.log('⚠️ Cookie ainda presente');
  }
  
  // Verifica se apareceu botão de login
  const loginButton = page.getByRole('button', { name: 'Autenticar' });
  const hasLogin = await loginButton.count() > 0;
  
  if (hasLogin) {
    console.log('✅ Botão Autenticar apareceu');
  } else {
    console.log('⚠️ Botão Autenticar não apareceu');
  }
  
  // Expect suave
  expect(tokenCookie).toBeUndefined();
  console.log('✅ Teste finalizado');
});
