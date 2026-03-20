// ✅ TESTE 2: Clica no botão e aguarda redirecionamento (VERSÃO ATUALIZADA)
test('Deve redirecionar para OIDC ao clicar em Autenticar', async ({ page }) => {
  const loginButton = page.getByRole('button', { name: 'Autenticar' });
  
  // Padrão moderno: Promise.all com waitForURL
  await Promise.all([
    page.waitForURL(/.*\/auth.*/, { 
      waitUntil: 'networkidle',
      timeout: 10000 
    }),
    loginButton.click()
  ]);
  
  const currentUrl = page.url();
  console.log('URL após redirecionamento:', currentUrl);
  
  // Verifica se foi para URL de autenticação
  expect(currentUrl).toContain('auth');
});
