package com.casnav.testeapi.ssgnApi.entities.montagem;

import jakarta.persistence.*;

@Entity(name = "TipoAeronave")
@Table(schema = "Montagem_Jogos")
public class TipoAeronave {
    @Id
    @Column(name = "Id_TipoAeronave", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_TipoAeronave", nullable = false)
    private ElementoMontagem elementoMontagem;

    @Column(name = "NomeTipoAeronave", length = 50)
    private String nomeTipoAeronave;

    @Column(name = "Modelo", length = 50)
    private String modelo;

    @Column(name = "Id_EmpregoAeronave")
    private Integer idEmpregoaeronave;

    @Column(name = "Embarcado")
    private Character embarcado;

    @Column(name = "Id_OperacaoAeronave")
    private Integer idOperacaoaeronave;

    @Column(name = "Id_InterceptacaoAeronave")
    private Integer idInterceptacaoaeronave;

    @Column(name = "Id_AtaqueAeronave")
    private Integer idAtaqueaeronave;

    @Column(name = "IndiceSortidas", length = 15)
    private String indiceSortidas;

    @Column(name = "HorasMes")
    private Double horasMes;

    @Column(name = "Id_TipoMotor")
    private Integer idTipomotor;

    @Column(name = "QtdeMotores")
    private Integer qtdeMotores;

    @Column(name = "Empuxo")
    private Double empuxo;

    @Column(name = "ConsumoMedio")
    private Double consumoMedio;

    @Column(name = "ReabastecimentoVoo")
    private Character reabastecimentoVoo;

    @Column(name = "Altura")
    private Double altura;

    @Column(name = "Comprimento")
    private Double comprimento;

    @Column(name = "Largura")
    private Double largura;

    @Column(name = "HangaragemS2")
    private Double hangaragemS2;

    @Column(name = "AreaAsas")
    private Double areaAsas;

    @Column(name = "DiametroRA")
    private Double diametroRA;

    @Column(name = "PesoBasico")
    private Integer pesoBasico;

    @Column(name = "PesoMaximo")
    private Integer pesoMaximo;

    @Column(name = "Id_Propulsao")
    private Integer idPropulsao;

    @Column(name = "Id_Pista")
    private Integer idPista;

    @Column(name = "CargaUtil")
    private Double cargaUtil;

    @Column(name = "GeometriaVariavel")
    private Character geometriaVariavel;

    @Column(name = "Id_TipoAsa")
    private Integer idTipoasa;

    @Column(name = "PesoPotencia")
    private Double pesoPotencia;

    @Column(name = "RazaoSubida")
    private Double razaoSubida;

    @Column(name = "TetoServico")
    private Double tetoServico;

    @Column(name = "TetoVooLibrado")
    private Double tetoVooLibrado;

    @Column(name = "VelocMAXAlto")
    private Double velocMAXAlto;

    @Column(name = "VelocMAXBaixo")
    private Double velocMAXBaixo;

    @Column(name = "VelocCruzeiroAlto")
    private Double velocCruzeiroAlto;

    @Column(name = "VelocCruzeiroBaixo")
    private Double velocCruzeiroBaixo;

    @Column(name = "HorizontalSubida")
    private Double horizontalSubida;

    @Column(name = "Navegacao", length = 50)
    private String navegacao;

    @Column(name = "Bloqueio")
    private Character bloqueio;

    @Column(name = "EquipamentoBloqueio", length = 50)
    private String equipamentoBloqueio;

    @Column(name = "PerfilVoo", length = 50)
    private String perfilVoo;

    @Column(name = "IFF")
    private Character iff;

    @Column(name = "MAGE")
    private Character mage;

    @Column(name = "VHF", length = 10)
    private String vhf;

    @Column(name = "UHF", length = 10)
    private String uhf;

    @Column(name = "HF", length = 10)
    private String hf;

    @Column(name = "Observacao", length = 100)
    private String observacao;

    @Column(name = "OutrosSistemasComunicacao", length = 50)
    private String outrosSistemasComunicacao;

    @Column(name = "Sigla", length = 10)
    private String sigla;

    @Column(name = "Modelo_Nome", length = 102)
    private String modeloNome;

    public Long getId() {
        return id;
    }

    public TipoAeronave setId(Long id) {
        this.id = id;
        return this;
    }

    public ElementoMontagem getElementoMontagem() {
        return elementoMontagem;
    }

    public TipoAeronave setElementoMontagem(ElementoMontagem elementoMontagem) {
        this.elementoMontagem = elementoMontagem;
        return this;
    }

    public String getNomeTipoAeronave() {
        return nomeTipoAeronave;
    }

    public TipoAeronave setNomeTipoAeronave(String nomeTipoAeronave) {
        this.nomeTipoAeronave = nomeTipoAeronave;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public TipoAeronave setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public Integer getIdEmpregoaeronave() {
        return idEmpregoaeronave;
    }

    public TipoAeronave setIdEmpregoaeronave(Integer idEmpregoaeronave) {
        this.idEmpregoaeronave = idEmpregoaeronave;
        return this;
    }

    public Character getEmbarcado() {
        return embarcado;
    }

    public TipoAeronave setEmbarcado(Character embarcado) {
        this.embarcado = embarcado;
        return this;
    }

    public Integer getIdOperacaoaeronave() {
        return idOperacaoaeronave;
    }

    public TipoAeronave setIdOperacaoaeronave(Integer idOperacaoaeronave) {
        this.idOperacaoaeronave = idOperacaoaeronave;
        return this;
    }

    public Integer getIdInterceptacaoaeronave() {
        return idInterceptacaoaeronave;
    }

    public TipoAeronave setIdInterceptacaoaeronave(Integer idInterceptacaoaeronave) {
        this.idInterceptacaoaeronave = idInterceptacaoaeronave;
        return this;
    }

    public Integer getIdAtaqueaeronave() {
        return idAtaqueaeronave;
    }

    public TipoAeronave setIdAtaqueaeronave(Integer idAtaqueaeronave) {
        this.idAtaqueaeronave = idAtaqueaeronave;
        return this;
    }

    public String getIndiceSortidas() {
        return indiceSortidas;
    }

    public TipoAeronave setIndiceSortidas(String indiceSortidas) {
        this.indiceSortidas = indiceSortidas;
        return this;
    }

    public Double getHorasMes() {
        return horasMes;
    }

    public TipoAeronave setHorasMes(Double horasMes) {
        this.horasMes = horasMes;
        return this;
    }

    public Integer getIdTipomotor() {
        return idTipomotor;
    }

    public TipoAeronave setIdTipomotor(Integer idTipomotor) {
        this.idTipomotor = idTipomotor;
        return this;
    }

    public Integer getQtdeMotores() {
        return qtdeMotores;
    }

    public TipoAeronave setQtdeMotores(Integer qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
        return this;
    }

    public Double getEmpuxo() {
        return empuxo;
    }

    public TipoAeronave setEmpuxo(Double empuxo) {
        this.empuxo = empuxo;
        return this;
    }

    public Double getConsumoMedio() {
        return consumoMedio;
    }

    public TipoAeronave setConsumoMedio(Double consumoMedio) {
        this.consumoMedio = consumoMedio;
        return this;
    }

    public Character getReabastecimentoVoo() {
        return reabastecimentoVoo;
    }

    public TipoAeronave setReabastecimentoVoo(Character reabastecimentoVoo) {
        this.reabastecimentoVoo = reabastecimentoVoo;
        return this;
    }

    public Double getAltura() {
        return altura;
    }

    public TipoAeronave setAltura(Double altura) {
        this.altura = altura;
        return this;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public TipoAeronave setComprimento(Double comprimento) {
        this.comprimento = comprimento;
        return this;
    }

    public Double getLargura() {
        return largura;
    }

    public TipoAeronave setLargura(Double largura) {
        this.largura = largura;
        return this;
    }

    public Double getHangaragemS2() {
        return hangaragemS2;
    }

    public TipoAeronave setHangaragemS2(Double hangaragemS2) {
        this.hangaragemS2 = hangaragemS2;
        return this;
    }

    public Double getAreaAsas() {
        return areaAsas;
    }

    public TipoAeronave setAreaAsas(Double areaAsas) {
        this.areaAsas = areaAsas;
        return this;
    }

    public Double getDiametroRA() {
        return diametroRA;
    }

    public TipoAeronave setDiametroRA(Double diametroRA) {
        this.diametroRA = diametroRA;
        return this;
    }

    public Integer getPesoBasico() {
        return pesoBasico;
    }

    public TipoAeronave setPesoBasico(Integer pesoBasico) {
        this.pesoBasico = pesoBasico;
        return this;
    }

    public Integer getPesoMaximo() {
        return pesoMaximo;
    }

    public TipoAeronave setPesoMaximo(Integer pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
        return this;
    }

    public Integer getIdPropulsao() {
        return idPropulsao;
    }

    public TipoAeronave setIdPropulsao(Integer idPropulsao) {
        this.idPropulsao = idPropulsao;
        return this;
    }

    public Integer getIdPista() {
        return idPista;
    }

    public TipoAeronave setIdPista(Integer idPista) {
        this.idPista = idPista;
        return this;
    }

    public Double getCargaUtil() {
        return cargaUtil;
    }

    public TipoAeronave setCargaUtil(Double cargaUtil) {
        this.cargaUtil = cargaUtil;
        return this;
    }

    public Character getGeometriaVariavel() {
        return geometriaVariavel;
    }

    public TipoAeronave setGeometriaVariavel(Character geometriaVariavel) {
        this.geometriaVariavel = geometriaVariavel;
        return this;
    }

    public Integer getIdTipoasa() {
        return idTipoasa;
    }

    public TipoAeronave setIdTipoasa(Integer idTipoasa) {
        this.idTipoasa = idTipoasa;
        return this;
    }

    public Double getPesoPotencia() {
        return pesoPotencia;
    }

    public TipoAeronave setPesoPotencia(Double pesoPotencia) {
        this.pesoPotencia = pesoPotencia;
        return this;
    }

    public Double getRazaoSubida() {
        return razaoSubida;
    }

    public TipoAeronave setRazaoSubida(Double razaoSubida) {
        this.razaoSubida = razaoSubida;
        return this;
    }

    public Double getTetoServico() {
        return tetoServico;
    }

    public TipoAeronave setTetoServico(Double tetoServico) {
        this.tetoServico = tetoServico;
        return this;
    }

    public Double getTetoVooLibrado() {
        return tetoVooLibrado;
    }

    public TipoAeronave setTetoVooLibrado(Double tetoVooLibrado) {
        this.tetoVooLibrado = tetoVooLibrado;
        return this;
    }

    public Double getVelocMAXAlto() {
        return velocMAXAlto;
    }

    public TipoAeronave setVelocMAXAlto(Double velocMAXAlto) {
        this.velocMAXAlto = velocMAXAlto;
        return this;
    }

    public Double getVelocMAXBaixo() {
        return velocMAXBaixo;
    }

    public TipoAeronave setVelocMAXBaixo(Double velocMAXBaixo) {
        this.velocMAXBaixo = velocMAXBaixo;
        return this;
    }

    public Double getVelocCruzeiroAlto() {
        return velocCruzeiroAlto;
    }

    public TipoAeronave setVelocCruzeiroAlto(Double velocCruzeiroAlto) {
        this.velocCruzeiroAlto = velocCruzeiroAlto;
        return this;
    }

    public Double getVelocCruzeiroBaixo() {
        return velocCruzeiroBaixo;
    }

    public TipoAeronave setVelocCruzeiroBaixo(Double velocCruzeiroBaixo) {
        this.velocCruzeiroBaixo = velocCruzeiroBaixo;
        return this;
    }

    public Double getHorizontalSubida() {
        return horizontalSubida;
    }

    public TipoAeronave setHorizontalSubida(Double horizontalSubida) {
        this.horizontalSubida = horizontalSubida;
        return this;
    }

    public String getNavegacao() {
        return navegacao;
    }

    public TipoAeronave setNavegacao(String navegacao) {
        this.navegacao = navegacao;
        return this;
    }

    public Character getBloqueio() {
        return bloqueio;
    }

    public TipoAeronave setBloqueio(Character bloqueio) {
        this.bloqueio = bloqueio;
        return this;
    }

    public String getEquipamentoBloqueio() {
        return equipamentoBloqueio;
    }

    public TipoAeronave setEquipamentoBloqueio(String equipamentoBloqueio) {
        this.equipamentoBloqueio = equipamentoBloqueio;
        return this;
    }

    public String getPerfilVoo() {
        return perfilVoo;
    }

    public TipoAeronave setPerfilVoo(String perfilVoo) {
        this.perfilVoo = perfilVoo;
        return this;
    }

    public Character getIff() {
        return iff;
    }

    public TipoAeronave setIff(Character iff) {
        this.iff = iff;
        return this;
    }

    public Character getMage() {
        return mage;
    }

    public TipoAeronave setMage(Character mage) {
        this.mage = mage;
        return this;
    }

    public String getVhf() {
        return vhf;
    }

    public TipoAeronave setVhf(String vhf) {
        this.vhf = vhf;
        return this;
    }

    public String getUhf() {
        return uhf;
    }

    public TipoAeronave setUhf(String uhf) {
        this.uhf = uhf;
        return this;
    }

    public String getHf() {
        return hf;
    }

    public TipoAeronave setHf(String hf) {
        this.hf = hf;
        return this;
    }

    public String getObservacao() {
        return observacao;
    }

    public TipoAeronave setObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    public String getOutrosSistemasComunicacao() {
        return outrosSistemasComunicacao;
    }

    public TipoAeronave setOutrosSistemasComunicacao(String outrosSistemasComunicacao) {
        this.outrosSistemasComunicacao = outrosSistemasComunicacao;
        return this;
    }

    public String getSigla() {
        return sigla;
    }

    public TipoAeronave setSigla(String sigla) {
        this.sigla = sigla;
        return this;
    }

    public String getModeloNome() {
        return modeloNome;
    }

    public TipoAeronave setModeloNome(String modeloNome) {
        this.modeloNome = modeloNome;
        return this;
    }

}