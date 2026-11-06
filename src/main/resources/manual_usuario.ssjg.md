<style>
  /* Define a margem padrão elegante para as páginas de texto do manual */
  @page {
    size: A4;
    margin: 25mm 20mm 20mm 20mm;
  }

  /* Ajusta a primeira página para atuar como capa (imagem em tela cheia/centralizada) */
  .capa-A4 {
    page-break-before: avoid;
    page-break-after: always;
    margin: -25mm -20mm -20mm -20mm !important; /* Neutraliza as margens do documento */
    width: 210mm;
    height: 297mm;
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: #ffffff;
  }

  .capa-A4 img {
    max-width: 80%;
    max-height: 80%;
    object-fit: contain;
    display: block;
  }
</style>

<!-- Página de Capa Automatizada -->
<div class="capa-A4">
    <img src="imagens/favicon.png" alt="Logo SSJG">
</div>

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

Operações exclusivas de meios de asa fixa ou rotativa baseado em terra ou em navios aeródromos.

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

- [**`ASSociar`**](#detalhes-do-comando-associar) - Vincula logicamente plataformas de superfície e submarina a uma UM específica.

---
<div style="page-break-after: always; break-after: page;"></div>

## Detalhes do Comando Associar

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

## Detalhes do Comando Atracar

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

## Detalhes do Comando Decolar

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

---
<div style="page-break-after: always; break-after: page;"></div>

## Detalhes do Comando Pousar

O comando **POUsar** encerra o vínculo operacional e lógico entre a plataforma aérea e uma Unidade de Movimento (UM) no cenário do SSJG.

### 📸 Sequência de Preenchimento Padrão

