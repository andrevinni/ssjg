
<div style="display: flex; justify-content: center; align-items: center; width: 100vw; height: 100vh; box-sizing: border-box; margin: 0; padding: 0;">
    <img src="imagens/favicon.png" alt="alt text" style="display: block;">
</div>

<!-- Força a quebra de página no PDF/Impressão -->
<div style="page-break-after: always; break-after: page;"></div>

# 📖 Manual do Usuário: Central de Comandos

O **Módulo de Comandos** permite que o controlador envie comandos diretos e parametrizados para as plataformas ativas no simulador de jogos de guerra (SSJG).

Abaixo está o fluxo correto para preenchimento e envio de um novo comando.

---

## ↔️ Acessando a Central de Comandos

Para abrir ou fechar a Central de **Comandos**, utilize a barra de ferramentas localizada no canto esquerdo da tela:

- **Botão da Central de Comandos (Ícone de Seta Bidirecional ↔️):** Localizado no primeiro bloco vertical da barra de ferramentas (último botão deste bloco).
  - _Nota de Operação:_ Este ícone representa a comunicação em tempo real entre a interface (Frontend) e o motor da simulação. Clique nele para abrir o formulário de preenchimento de comandos ou para ocultá-lo da tela.

---

## 🛠️ Passo a Passo para Envio de Comando

A janela da Central de Comandos é dividida em blocos de seleção obrigatórios. Siga a ordem descrita para garantir o envio correto ao simulador:

### 1. Seleção do Comando Principal

- **Campo "COMANDO":** Clique no menu suspenso e escolha a ação que deseja executar (Ex: ASSociar).
- **Campo "VARIAÇÃO":** Escolha a subcategoria ou o modo específico da ação selecionada (Ex: ASSOC_PLATAFORMA).

### 2. Definição da Unidade de Movimento (UM)

Neste bloco, você deve determinar qual unidade de movimento (UM) executará a ação desejada:

- **Opções de Origem:**
  - Marque **"USAR UM EXISTENTE"** para selecionar uma unidade já plotada no mapa/carta.
  - Marque **"CRIAR UM"** caso o comando exija a geração de uma nova entidade na simulação.
- **Campo "SELECIONE A UM":** Escolha o indicativo da Unidade de Movimento correspondente (Ex: UM_502 - AZUL).

### 3. Vinculação de Plataformas

- **Campo "PLATAFORMAS":** Selecione as plataformas (de superfície, aéreas ou submarinas) que formarão um agrupamento de meios utilizável em qualquer comando.
- O tipo da 1ª plataforma associada determinará o tipo da UM.
- **Tags de Seleção:** As plataformas selecionadas aparecerão como blocos cinzas logo abaixo do campo (Ex: `PS_112 X`). Para remover uma plataforma da lista, clique no **"X"** ao lado do nome.

---
<!-- Força a quebra de página no PDF/Impressão -->
<div style="page-break-after: always; break-after: page;"></div>

### 4. Finalização e Envio

- **Botão Cancelar:** Aborta a operação atual e limpa os campos preenchidos.
- **Botão Enviar Comando:** Valida os parâmetros e o envia imediatamente para o motor da simulação.

## 🗂️ Catálogo e Grupos de Comandos Disponíveis

Ao preencher o campo **"COMANDO"**, as opções estarão catalogadas de acordo com as seguintes regras de agrupamento semântico do simulador:

### 📁 Analista

Comandos voltados à alteração dos parâmetros e cenários do ambiente de simulação.

- `DESTruir` - Aplicado somente às plataformas: superfície e submarina. Ocorre a destruição total do meio (afundamento).

### 📁 Controle de Posição

Comandos voltados à definição e controle da posição geográfica das UMs.

- `REPOsicionar` - Move a unidade para novas coordenadas geográficas pré-determinadas.

### 📁 Movimento Aeronaves

Operações exclusivas de meios de asa fixa ou rotativa baseados em terra ou em navios aeródromos.

- `DEColar` - Lança aeronaves prontas a partir de uma base ou plataformas de superfícies qualificadas para operações aéreas.
- `POUsar` - Recolhe a aeronave para pouso seguro em pista ou convoo homologado.

### 📁 Movimento Geral

Manobras padrão de navegação e cinemática tática das Unidades de Movimento.

- `ACOmpanhar` - Estabelece escolta ou rastreamento automático de um alvo/unidade de interesse.
- `ATRacar` - Realiza a amarração da plataforma em instalações portuárias ou contrabordo.
- `EXEcutar` - Dá início a um plano ou derrota previamente traçada e em espera.
- `INTerceptar` - Traça uma derrota de aproximação rápida para interceptar o rumo de um alvo.
- `MOVimentar` - Deslocamento cinemático padrão realizado pela UM de um ponto A para um ponto B qualquer.

### 📁 Organização

Estruturação e vinculação hierárquica das Unidades de Movimento.

- [`ASSociar`](#detalhes-do-comando-associar) - Vincula logicamente plataformas de superfície e submarina a uma UM específica.

---
<!-- Força a quebra de página no PDF/Impressão -->
<div style="page-break-after: always; break-after: page;"></div>

<span id="detalhes-do-comando-associar"></span>
## 🔍 Detalhes do Comando ASSociar

O comando **ASSociar** estabelece um vínculo operacional e lógico entre plataformas avulsas (superfície e submarina) e uma Unidade de Movimento (UM) já ativa ou nova no cenário do SSJG.

### 📸 Sequência de Preenchimento Padrão

Siga as diretrizes visuais abaixo para configurar corretamente a janela flutuante sobre o mapa tático:

1. **Seleção do Comando:** Defina o campo `COMANDO` como `Associar (ASS)` e a `VARIAÇÃO` correspondente como `ASSOC_PLATAFORMA`.
2. **Referência da UM:** Em `UM *`, mantenha a opção **"USAR UM EXISTENTE"** marcada. No campo `SELECIONE A UM *`, defina o indicativo desejado (Ex: `UM_502 - AZUL`).
3. **Inclusão de Componentes:** No menu suspenso `PLATAFORMAS *`, clique e adicione as plataformas desejadas. Elas serão plotadas como pequenas tags cinzas logo abaixo do seletor (Ex: `PS_112 X`).
4. **Verificação de Posição:** Antes de enviar, certifique-se de que a UM selecionada corresponde aos ícones plotados no mapa tático (meios Azuis ou Vermelhos) e valide a posição atual olhando o painel flutuante de coordenadas (`LAT` e `LON`) no canto inferior direito.

#### Exemplo Visual do Formulário de Comando Preenchido:

![Janela de Comandos e Mapa Tático do SSJG](imagens/ASSOciar.png)

5. **Envio:** Se todos os campos obrigatórios com asterisco (`*`) estiverem preenchidos como na imagem acima, clique no botão azul **Enviar Comando** para transmitir a ordem ao motor do simulador.

## 🔍 Detalhes do Comando ATRacar

O comando **ATRacar** Encerra o vínculo operacional e lógico entre plataformas avulsas (superfície e submarina) e uma Unidade de Movimento (UM) ativa no cenário do SSJG.

### 📸 Sequência de Preenchimento Padrão

Siga as diretrizes visuais abaixo para configurar corretamente a janela flutuante sobre o mapa tático:

1. **Seleção do Comando:** Defina o campo `COMANDO` como `Atracar (ATR)` e a `VARIAÇÃO` correspondente como `ATRACAR_UM_BASE`.
2. **Seleção da Base de Atracação:** No campo `Base *`, selecione o indicativo desejado (Ex: `ITAJ - AZUL`).
3. **Seleção da UM :** No menu suspenso `UNIDADE DE MOVIMENTO *`, selecione o indicativo desejado (Ex: `102 - AZUL`).
4. **Verificação de Posição:** Antes de enviar, certifique-se de que a UM selecionada corresponde aos ícones plotados no mapa tático (meios Azuis ou Vermelhos) e valide a posição atual (deve estar dentro do raio de 25 MN, distância máxima permitida para a manobra de atracação).

#### Exemplo Visual do Formulário de Comando Preenchido:

![Janela de Comandos e Mapa Tático do SSJG](imagens/ATRacar.png)

5. **Envio:** Se todos os campos obrigatórios com asterisco (`*`) estiverem preenchidos como na imagem acima, clique no botão azul **Enviar Comando** para transmitir a ordem ao motor do simulador.

## 🔍 Detalhes do Comando DEColar

O comando **DEColar** estabelece um vínculo operacional e lógico entre plataforma aérea e uma Unidade de Movimento (UM) nova no cenário do SSJG.

### 📸 Sequência de Preenchimento Padrão

Siga as diretrizes visuais abaixo para configurar corretamente a janela flutuante sobre o mapa tático:

1. **Seleção do Comando:** Defina o campo `COMANDO` como `DEColar (DEC)` e a `VARIAÇÃO` correspondente como `DECOLAR_AERO_BASE_NOVA_UM`.
2. **Seleção da Base de decolagem:** Em `BASE *`, selecione a base de onde a plataforma aérea decolará (Ex: `OANAC - AZUL`).
3. **Unidade de Movimento Aérea:** Observe que a opção `Criar UM`, está selecionada. Forneça então o nome para esta UM (Ex: `606`).
4. **Inclusão de Componentes:** No menu suspenso `PLATAFORMA AÉREA *`, selecione uma plataforma. (Ex: `PA_504`). Após a seleção, está ficará disponível abaixo do menu suspenso. Se a plataforma selecionada não for a correta, clique no X para retirar e permitir uma nova seleção. No menu suspenso `PERFIL de VÔO *`, selecione `Alto Alto` ou `Baixo Baixo`.

#### Exemplo Visual do Formulário de Comando Preenchido:

![Janela de Comandos e Mapa Tático do SSJG](imagens/DEColar.png)

5. **Envio:** Se todos os campos obrigatórios com asterisco (`*`) estiverem preenchidos como na imagem acima, clique no botão azul **Enviar Comando** para transmitir a ordem ao motor do simulador.

## 🔍 Detalhes do Comando POUsar

O comando **POUsar** encerra o vínculo operacional e lógico entre a plataforma aérea e uma Unidade de Movimento (UM) no cenário do SSJG.

### 📸 Sequência de Preenchimento Padrão

Siga as diretrizes visuais abaixo para configurar corretamente a janela flutuante sobre o mapa tático:

1. **Seleção do Comando:** Defina o campo `COMANDO` como `POUsar (POU)` e a `VARIAÇÃO` correspondente como `POUSAR_UM_BASE`.
2. **Seleção da Unidade de Movimento Aérea:** Em `UNID. MOVIMENTO AÉREA *`, selecione a UM aérea que pousará (Ex: `606 - AZUL`).
3. **Seleção da Base Aérea:** Em `BASE *`, selecione a base onde a plataforma aérea pousará. (Ex.: OANAC - AZUL)

#### Exemplo Visual do Formulário de Comando Preenchido:

![Janela de Comandos e Mapa Tático do SSJG](imagens/POUsar.png)

4. **Envio:** Se todos os campos obrigatórios com asterisco (`*`) estiverem preenchidos como na imagem acima, clique no botão azul **Enviar Comando** para transmitir a ordem ao motor do simulador.

## 🔍 Detalhes do Comando REPOsicionar

O comando **REPOsicionar** Move uma determinada Unidade de Movimento (UM) e suas plataformas associadas para outra posição geográfica (Lat/Long) no cenário do SSJG.

### 📸 Sequência de Preenchimento Padrão

Siga as diretrizes visuais abaixo para configurar corretamente a janela flutuante sobre o mapa tático:

1. **Seleção do Comando:** Defina o campo `COMANDO` como `REPOsicionar (REPO)` e a `VARIAÇÃO` correspondente como `REPO_UM_POS`.
2. **Seleção da UM que será reposicionada:** No campo `UNIDADE DE MOVIMENTO *`, selecione o indicativo desejado (Ex: `102 - AZUL`).
3. **Preencha a Latitude:** Nas caixas de textos `LATITUDE *`, preencha os valores correspondentes (Ex: `26 na 1ª, 45 na 2ª e 22.68 na 3ª no 4ª selecione N ou S`).
4. **Preencha a Longitude:** Nas caixas de textos `LONGITUDE *`, preencha os valores correspondentes (Ex: `48 na 1ª, 14 na 2ª e 31.56 na 3ª no 4ª selecione E ou W`).
5. **Verificação de Posição:** Antes de enviar, certifique-se de que a UM selecionada corresponde aos ícones plotados no mapa tático (meios Azuis ou Vermelhos) e valide a posição futura para onde a UM será reposicionada.

#### Exemplo Visual do Formulário de Comando Preenchido:

![Janela de Comandos e Mapa Tático do SSJG](imagens/REPOsicionar.png)

5. **Envio:** Se todos os campos obrigatórios com asterisco (`*`) estiverem preenchidos como na imagem acima, clique no botão azul **Enviar Comando** para transmitir a ordem ao motor do simulador.

## 🔍 Detalhes do Comando MOVImentar

O comando **MOVImentar** Movimenta uma determinada Unidade de Movimento (UM) e suas plataformas associadas em determinado rumo e velocidade.

### 📸 Sequência de Preenchimento Padrão

Siga as diretrizes visuais abaixo para configurar corretamente a janela flutuante sobre o mapa tático:

1. **Seleção do Comando:** Defina o campo `COMANDO` como `MOVImentar (MOVI)` e a `VARIAÇÃO` correspondente como `MOVI_UM`.
2. **Seleção da UM que será movimentada:** No campo `UNIDADE DE MOVIMENTO *`, selecione o indicativo desejado (Ex: `102 - AZUL`).
3. **Preencha a Rumo:** Na caixa de texto `RUMO (0° - 360°)*`, preencha o valor desejado (Ex: `90`).
4. **Preencha a Velocidade:** Na caixa de texto `VELOCIDADE DE AVANÇO (NÓS) *`, preencha o valor desejado (Ex: `12`).
5. **Verificação de Posição:** Antes de enviar, certifique-se de que a UM selecionada corresponde aos ícones plotados no mapa tático (meios Azuis ou Vermelhos) e confirme a posição atual e observe um vetor junta do símbolo da UM indicando o rumo definido.

#### Exemplo Visual do Formulário de Comando Preenchido:

![Janela de Comandos e Mapa Tático do SSJG](imagens/MOVImentar.png)

5. **Envio:** Se todos os campos obrigatórios com asterisco (`*`) estiverem preenchidos como na imagem acima, clique no botão azul **Enviar Comando** para transmitir a ordem ao motor do simulador.

## 🔍 Detalhes do Comando EXEcutar

O comando **EXEcutar** Movimenta uma Unidade de Movimento (UM) e suas plataformas associadas em um trajeto prévio e limitado (início e fim) cumprindo rigorasamente as mudanças de rumo previstas na derrota/rota.

### 📸 Sequência de Preenchimento Padrão

Siga as diretrizes visuais abaixo para configurar corretamente a janela flutuante sobre o mapa tático:

1. **Seleção do Comando:** Defina o campo `COMANDO` como `EXEcutar (EXE)` e a `VARIAÇÃO` correspondente como `EXEC_TRAJETO`.
2. **Seleção da UM que executará o trajeto:** No campo `UNIDADE DE MOVIMENTO *`, selecione o indicativo desejado (Ex: `102 - AZUL`).
3. **Seleção do trajeto que a UM executará:** No campo `TRAJETO *`, selecione o trajeto desejado (Ex: `F41_AZUL`).
4. **Preencha a Velocidade:** Na caixa de texto `VELOCIDADE DE AVANÇO (NÓS) *`, preencha o valor desejado observando a velocidade máxima da plataforma VMM1234 (Ex: `12`).
5. **Observação:** Caso a UM não esteja na mesma Lat/Long do 1º ponto do trajeto, a UM iniciará primeiro o movimento de interceptação deste ponto inicial, somente após atingí-lo é que terá início a execução do trajeto.

#### Exemplo Visual do Formulário de Comando Preenchido:

![Janela de Comandos e Mapa Tático do SSJG](imagens/EXEcutar.png)

5. **Envio:** Se todos os campos obrigatórios com asterisco (`*`) estiverem preenchidos como na imagem acima, clique no botão azul **Enviar Comando** para transmitir a ordem ao motor do simulador.

## 🔍 Detalhes do Comando INTerceptar

O comando **INTerceptar** Movimenta uma (UM) a partir de uma posição inicial (LAT/LONG), calcula o rumo exato para uma nova posição futura definida pela nova LAT/LONG preenchida (ponto de interceptação).

### 📸 Sequência de Preenchimento Padrão

Siga as diretrizes visuais abaixo para configurar corretamente a janela flutuante sobre o mapa tático:

1. **Seleção do Comando:** Defina o campo `COMANDO` como `INTerceptar (INT)` e a `VARIAÇÃO` correspondente como `INTERCEPTAR_POS`.
2. **Seleção da UM que interceptará posição:** No campo `UNIDADE DE MOVIMENTO *`, selecione o indicativo desejado (Ex: `102 - AZUL`).
3. **Preencha a Latitude:** Nas caixas de textos `LATITUDE *`, preencha os valores correspondentes (Ex: `26 na 1ª, 45 na 2ª e 22.68 na 3ª no 4ª selecione N ou S`).
4. **Preencha a Longitude:** Nas caixas de textos `LONGITUDE *`, preencha os valores correspondentes (Ex: `48 na 1ª, 14 na 2ª e 31.56 na 3ª no 4ª selecione E ou W`).
5. **Preencha a velocidade:** Na caixa de texto `VELOCIDADE DE AVANÇO (NÓS) *`, preencha o valor observando sempre a menor VMM da(s) plataforma(s) vinculada(s) (Ex: `12`).

#### Exemplo Visual do Formulário de Comando Preenchido:

![Janela de Comandos e Mapa Tático do SSJG](imagens/INTerceptar.png)

5. **Envio:** Se todos os campos obrigatórios com asterisco (`*`) estiverem preenchidos como na imagem acima, clique no botão azul **Enviar Comando** para transmitir a ordem ao motor do simulador.

## 🔍 Detalhes do Comando ACoMpanhar

O comando **ACoMpanhar** é um movimento que faz com que uma determinada UM (acompanhante) reproduza rigorasamente a mesma cinemática da outra UM (acompanhada) ou seja, repete dinamicamente os mesmos valores fundamentais do movimento da simulação (rumo e velocidade).

### 📸 Sequência de Preenchimento Padrão

Siga as diretrizes visuais abaixo para configurar corretamente a janela flutuante sobre o mapa tático:

1. **Seleção do Comando:** Defina o campo `COMANDO` como `Acompanhar (ACM)` e a `VARIAÇÃO` correspondente como `ACOMPANHAR_UM`.
2. **Seleção da UM acompanhamente:** No campo `UM DE SUPERFÍCIE ACOMPANHANTE *`, selecione o indicativo desejado (Ex: `102 - AZUL`).
3. **Seleção da UM acompanhada:** No campo `UM DE SUPERFÍCIE ACOMPANHADA *`, selecione o indicativo desejado (Ex: `109 - VERMELHO`).

#### Exemplo Visual do Formulário de Comando Preenchido:

![Janela de Comandos e Mapa Tático do SSJG](imagens/ACoMpanhar.png)

5. **Envio:** Se todos os campos obrigatórios com asterisco (`*`) estiverem preenchidos como na imagem acima, clique no botão azul **Enviar Comando** para transmitir a ordem ao motor do simulador.

## 🔍 Detalhes do Comando DEStruir

O comando **DEStruir** é aplicado exclusivamente em plataformas de superfície.

### 📸 Sequência de Preenchimento Padrão

Siga as diretrizes visuais abaixo para configurar corretamente a janela flutuante sobre o mapa tático:

1. **Seleção do Comando:** Defina o campo `COMANDO` como `DEStruir (DES)` e a `VARIAÇÃO` correspondente como `DESTRUIR_PLAT`.
2. **Seleção da plataforma a ser destruída:** No campo `PLATAFORMAS *`, selecione as plataformas que serão destruídas (Ex: `102 - AZUL`).
3. **Observação:** Se alguma plataforma foi selecionada indevidamente, retire da lista clicando no `X` ao lado do nome (Ex: `PS_102 X` ).

#### Exemplo Visual do Formulário de Comando Preenchido:

![Janela de Comandos e Mapa Tático do SSJG](imagens/DEStruir.png)

5. **Envio:** Se todos os campos obrigatórios com asterisco (`*`) estiverem preenchidos como na imagem acima, clique no botão azul **Enviar Comando** para transmitir a ordem ao motor do simulador.

## 🚨 Resolução de Problemas e Alertas Visuais

### Alerta de Erro no Envio

Se o simulador recusar a ordem ou houver perda de conexão, um banner vermelho de notificação aparecerá no canto superior direito da tela com a mensagem:

> ❌ **"Erro ao enviar comando, tente novamente"**

**O que fazer nesses casos?**

1. Verifique se a Unidade de Movimento selecionada ainda está ativa no mapa.
2. Certifique-se de que todos os campos obrigatórios (marcados com um asterisco vermelho `*`) foram preenchidos.
3. Se o erro persistir, cancele a operação e abra o formulário novamente para atualizar o estado dos componentes React.
