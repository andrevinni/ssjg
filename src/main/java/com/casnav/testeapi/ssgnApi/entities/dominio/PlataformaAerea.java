package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "PlataformaAerea")
@Table(schema = "Dominio")
//@AttributeOverrides({
//        @AttributeOverride(name = "observacao", column = @Column(name = "Observacao", length = 50))
//})
public class PlataformaAerea extends Elemento {
    @Column(name = "Id_ElementoOrigem")
    private Integer idElementoorigem;

    @Column(name = "Id_ElementoPousado")
    private Integer idElementopousado;

    @Column(name = "NomeTipoAeronave", length = 50)
    private String nomeTipoAeronave;

    @Column(name = "Id_SituacaoPlataforma", nullable = false)
    private Integer idSituacaoplataforma;

    @Column(name = "Modelo", length = 50)
    private String modelo;

    @Column(name = "Operacao_Embarcado")
    private Character operacaoEmbarcado;

    @Column(name = "TipoAsa", length = 50)
    private String tipoAsa;

    @Column(name = "IndiceSortidas", length = 15)
    private String indiceSortidas;

    @Column(name = "HorasMes")
    private Double horasMes;

    @Column(name = "TipoMotorAeronave", length = 50)
    private String tipoMotorAeronave;

    @Column(name = "QtdeMotores")
    private Integer qtdeMotores;

    @Column(name = "Propulsao", length = 3)
    private String propulsao;

    @Column(name = "Empuxo")
    private Double empuxo;

    @Column(name = "ConsumoMedio")
    private Double consumoMedio;

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
    private Double pesoBasico;

    @Column(name = "PesoMaximo")
    private Double pesoMaximo;

    @Column(name = "PesoSupAsa")
    private Double pesoSupAsa;

    @Column(name = "PesoPotencia")
    private Double pesoPotencia;

    @Column(name = "CargaUtil")
    private Double cargaUtil;

    @Column(name = "GeometriaVariavel")
    private Character geometriaVariavel;

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

    @Column(name = "Altitude")
    private Double altitude;

    @Column(name = "HorizontalSubida")
    private Double horizontalSubida;

    @Column(name = "Navegacao", length = 50)
    private String navegacao;

    @Column(name = "Bloqueio")
    private Character bloqueio;

    @Column(name = "EquipamentoBloqueio", length = 50)
    private String equipamentoBloqueio;

    @Column(name = "EmpregoAeronave", length = 50)
    private String empregoAeronave;

    @Column(name = "ReabastecimentoVoo")
    private Character reabastecimentoVoo;

    @Column(name = "OperacaoAeronave", length = 50)
    private String operacaoAeronave;

    @Column(name = "InterceptacaoAeronave", length = 50)
    private String interceptacaoAeronave;

    @Column(name = "AtaqueAeronave", length = 50)
    private String ataqueAeronave;

    @Column(name = "AltitudePerfilVooA")
    private Double altitudePerfilVooA;

    @Column(name = "AltitudePerfilVooB")
    private Double altitudePerfilVooB;

    @Column(name = "Autonomia")
    private Double autonomia;

    @Column(name = "PerfilVoo", length = 3)
    private String perfilVoo;

    @Column(name = "CteConsumo1")
    private Double cteConsumo1;

    @Column(name = "CteConsumo2")
    private Double cteConsumo2;

    @Column(name = "CtePatrulha")
    private Double ctePatrulha;

    @Column(name = "DanoVeloc")
    private Double danoVeloc;

    @Column(name = "IFF")
    private Character iff;

    @Column(name = "MAGE")
    private Character mage;

    @Column(name = "VelocLogistica")
    private Double velocLogistica;

    @Column(name = "Id_ConfiguracaoCorrente")
    private Integer idConfiguracaocorrente;

    @Column(name = "HF", length = 10)
    private String hf;

    @Column(name = "UHF", length = 10)
    private String uhf;

    @Column(name = "VHF", length = 10)
    private String vhf;

    @Column(name = "Id_Pista")
    private Integer idPista;

    @Column(name = "Id_TipoPropulsao")
    private Integer idTipopropulsao;

    @Column(name = "Id_RecursoPropulsao")
    private Integer idRecursopropulsao;

    @Column(name = "DanoSensor")
    private Double danoSensor;

    @Column(name = "OutrosSistemasComunicacao", length = 50)
    private String outrosSistemasComunicacao;

    @Column(name = "Sigla", length = 10)
    private String sigla;

    @Column(name = "EmEspera", nullable = false)
    private Character emEspera;

    @Column(name = "DHTerminoEspera", length = 15)
    private String dHTerminoEspera;

    public Integer getIdElementoorigem() {
        return idElementoorigem;
    }

    public PlataformaAerea setIdElementoorigem(Integer idElementoorigem) {
        this.idElementoorigem = idElementoorigem;
        return this;
    }

    public Integer getIdElementopousado() {
        return idElementopousado;
    }

    public PlataformaAerea setIdElementopousado(Integer idElementopousado) {
        this.idElementopousado = idElementopousado;
        return this;
    }

    public String getNomeTipoAeronave() {
        return nomeTipoAeronave;
    }

    public PlataformaAerea setNomeTipoAeronave(String nomeTipoAeronave) {
        this.nomeTipoAeronave = nomeTipoAeronave;
        return this;
    }

    public Integer getIdSituacaoplataforma() {
        return idSituacaoplataforma;
    }

    public PlataformaAerea setIdSituacaoplataforma(Integer idSituacaoplataforma) {
        this.idSituacaoplataforma = idSituacaoplataforma;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public PlataformaAerea setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public Character getOperacaoEmbarcado() {
        return operacaoEmbarcado;
    }

    public PlataformaAerea setOperacaoEmbarcado(Character operacaoEmbarcado) {
        this.operacaoEmbarcado = operacaoEmbarcado;
        return this;
    }

    public String getTipoAsa() {
        return tipoAsa;
    }

    public PlataformaAerea setTipoAsa(String tipoAsa) {
        this.tipoAsa = tipoAsa;
        return this;
    }

    public String getIndiceSortidas() {
        return indiceSortidas;
    }

    public PlataformaAerea setIndiceSortidas(String indiceSortidas) {
        this.indiceSortidas = indiceSortidas;
        return this;
    }

    public Double getHorasMes() {
        return horasMes;
    }

    public PlataformaAerea setHorasMes(Double horasMes) {
        this.horasMes = horasMes;
        return this;
    }

    public String getTipoMotorAeronave() {
        return tipoMotorAeronave;
    }

    public PlataformaAerea setTipoMotorAeronave(String tipoMotorAeronave) {
        this.tipoMotorAeronave = tipoMotorAeronave;
        return this;
    }

    public Integer getQtdeMotores() {
        return qtdeMotores;
    }

    public PlataformaAerea setQtdeMotores(Integer qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
        return this;
    }

    public String getPropulsao() {
        return propulsao;
    }

    public PlataformaAerea setPropulsao(String propulsao) {
        this.propulsao = propulsao;
        return this;
    }

    public Double getEmpuxo() {
        return empuxo;
    }

    public PlataformaAerea setEmpuxo(Double empuxo) {
        this.empuxo = empuxo;
        return this;
    }

    public Double getConsumoMedio() {
        return consumoMedio;
    }

    public PlataformaAerea setConsumoMedio(Double consumoMedio) {
        this.consumoMedio = consumoMedio;
        return this;
    }

    public Double getAltura() {
        return altura;
    }

    public PlataformaAerea setAltura(Double altura) {
        this.altura = altura;
        return this;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public PlataformaAerea setComprimento(Double comprimento) {
        this.comprimento = comprimento;
        return this;
    }

    public Double getLargura() {
        return largura;
    }

    public PlataformaAerea setLargura(Double largura) {
        this.largura = largura;
        return this;
    }

    public Double getHangaragemS2() {
        return hangaragemS2;
    }

    public PlataformaAerea setHangaragemS2(Double hangaragemS2) {
        this.hangaragemS2 = hangaragemS2;
        return this;
    }

    public Double getAreaAsas() {
        return areaAsas;
    }

    public PlataformaAerea setAreaAsas(Double areaAsas) {
        this.areaAsas = areaAsas;
        return this;
    }

    public Double getDiametroRA() {
        return diametroRA;
    }

    public PlataformaAerea setDiametroRA(Double diametroRA) {
        this.diametroRA = diametroRA;
        return this;
    }

    public Double getPesoBasico() {
        return pesoBasico;
    }

    public PlataformaAerea setPesoBasico(Double pesoBasico) {
        this.pesoBasico = pesoBasico;
        return this;
    }

    public Double getPesoMaximo() {
        return pesoMaximo;
    }

    public PlataformaAerea setPesoMaximo(Double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
        return this;
    }

    public Double getPesoSupAsa() {
        return pesoSupAsa;
    }

    public PlataformaAerea setPesoSupAsa(Double pesoSupAsa) {
        this.pesoSupAsa = pesoSupAsa;
        return this;
    }

    public Double getPesoPotencia() {
        return pesoPotencia;
    }

    public PlataformaAerea setPesoPotencia(Double pesoPotencia) {
        this.pesoPotencia = pesoPotencia;
        return this;
    }

    public Double getCargaUtil() {
        return cargaUtil;
    }

    public PlataformaAerea setCargaUtil(Double cargaUtil) {
        this.cargaUtil = cargaUtil;
        return this;
    }

    public Character getGeometriaVariavel() {
        return geometriaVariavel;
    }

    public PlataformaAerea setGeometriaVariavel(Character geometriaVariavel) {
        this.geometriaVariavel = geometriaVariavel;
        return this;
    }

    public Double getRazaoSubida() {
        return razaoSubida;
    }

    public PlataformaAerea setRazaoSubida(Double razaoSubida) {
        this.razaoSubida = razaoSubida;
        return this;
    }

    public Double getTetoServico() {
        return tetoServico;
    }

    public PlataformaAerea setTetoServico(Double tetoServico) {
        this.tetoServico = tetoServico;
        return this;
    }

    public Double getTetoVooLibrado() {
        return tetoVooLibrado;
    }

    public PlataformaAerea setTetoVooLibrado(Double tetoVooLibrado) {
        this.tetoVooLibrado = tetoVooLibrado;
        return this;
    }

    public Double getVelocMAXAlto() {
        return velocMAXAlto;
    }

    public PlataformaAerea setVelocMAXAlto(Double velocMAXAlto) {
        this.velocMAXAlto = velocMAXAlto;
        return this;
    }

    public Double getVelocMAXBaixo() {
        return velocMAXBaixo;
    }

    public PlataformaAerea setVelocMAXBaixo(Double velocMAXBaixo) {
        this.velocMAXBaixo = velocMAXBaixo;
        return this;
    }

    public Double getVelocCruzeiroAlto() {
        return velocCruzeiroAlto;
    }

    public PlataformaAerea setVelocCruzeiroAlto(Double velocCruzeiroAlto) {
        this.velocCruzeiroAlto = velocCruzeiroAlto;
        return this;
    }

    public Double getVelocCruzeiroBaixo() {
        return velocCruzeiroBaixo;
    }

    public PlataformaAerea setVelocCruzeiroBaixo(Double velocCruzeiroBaixo) {
        this.velocCruzeiroBaixo = velocCruzeiroBaixo;
        return this;
    }

    public Double getAltitude() {
        return altitude;
    }

    public PlataformaAerea setAltitude(Double altitude) {
        this.altitude = altitude;
        return this;
    }

    public Double getHorizontalSubida() {
        return horizontalSubida;
    }

    public PlataformaAerea setHorizontalSubida(Double horizontalSubida) {
        this.horizontalSubida = horizontalSubida;
        return this;
    }

    public String getNavegacao() {
        return navegacao;
    }

    public PlataformaAerea setNavegacao(String navegacao) {
        this.navegacao = navegacao;
        return this;
    }

    public Character getBloqueio() {
        return bloqueio;
    }

    public PlataformaAerea setBloqueio(Character bloqueio) {
        this.bloqueio = bloqueio;
        return this;
    }

    public String getEquipamentoBloqueio() {
        return equipamentoBloqueio;
    }

    public PlataformaAerea setEquipamentoBloqueio(String equipamentoBloqueio) {
        this.equipamentoBloqueio = equipamentoBloqueio;
        return this;
    }

    public String getEmpregoAeronave() {
        return empregoAeronave;
    }

    public PlataformaAerea setEmpregoAeronave(String empregoAeronave) {
        this.empregoAeronave = empregoAeronave;
        return this;
    }

    public Character getReabastecimentoVoo() {
        return reabastecimentoVoo;
    }

    public PlataformaAerea setReabastecimentoVoo(Character reabastecimentoVoo) {
        this.reabastecimentoVoo = reabastecimentoVoo;
        return this;
    }

    public String getOperacaoAeronave() {
        return operacaoAeronave;
    }

    public PlataformaAerea setOperacaoAeronave(String operacaoAeronave) {
        this.operacaoAeronave = operacaoAeronave;
        return this;
    }

    public String getInterceptacaoAeronave() {
        return interceptacaoAeronave;
    }

    public PlataformaAerea setInterceptacaoAeronave(String interceptacaoAeronave) {
        this.interceptacaoAeronave = interceptacaoAeronave;
        return this;
    }

    public String getAtaqueAeronave() {
        return ataqueAeronave;
    }

    public PlataformaAerea setAtaqueAeronave(String ataqueAeronave) {
        this.ataqueAeronave = ataqueAeronave;
        return this;
    }

    public Double getAltitudePerfilVooA() {
        return altitudePerfilVooA;
    }

    public PlataformaAerea setAltitudePerfilVooA(Double altitudePerfilVooA) {
        this.altitudePerfilVooA = altitudePerfilVooA;
        return this;
    }

    public Double getAltitudePerfilVooB() {
        return altitudePerfilVooB;
    }

    public PlataformaAerea setAltitudePerfilVooB(Double altitudePerfilVooB) {
        this.altitudePerfilVooB = altitudePerfilVooB;
        return this;
    }

    public Double getAutonomia() {
        return autonomia;
    }

    public PlataformaAerea setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
        return this;
    }

    public String getPerfilVoo() {
        return perfilVoo;
    }

    public PlataformaAerea setPerfilVoo(String perfilVoo) {
        this.perfilVoo = perfilVoo;
        return this;
    }

    public Double getCteConsumo1() {
        return cteConsumo1;
    }

    public PlataformaAerea setCteConsumo1(Double cteConsumo1) {
        this.cteConsumo1 = cteConsumo1;
        return this;
    }

    public Double getCteConsumo2() {
        return cteConsumo2;
    }

    public PlataformaAerea setCteConsumo2(Double cteConsumo2) {
        this.cteConsumo2 = cteConsumo2;
        return this;
    }

    public Double getCtePatrulha() {
        return ctePatrulha;
    }

    public PlataformaAerea setCtePatrulha(Double ctePatrulha) {
        this.ctePatrulha = ctePatrulha;
        return this;
    }

    public Double getDanoVeloc() {
        return danoVeloc;
    }

    public PlataformaAerea setDanoVeloc(Double danoVeloc) {
        this.danoVeloc = danoVeloc;
        return this;
    }

    public Character getIff() {
        return iff;
    }

    public PlataformaAerea setIff(Character iff) {
        this.iff = iff;
        return this;
    }

    public Character getMage() {
        return mage;
    }

    public PlataformaAerea setMage(Character mage) {
        this.mage = mage;
        return this;
    }

    public Double getVelocLogistica() {
        return velocLogistica;
    }

    public PlataformaAerea setVelocLogistica(Double velocLogistica) {
        this.velocLogistica = velocLogistica;
        return this;
    }

    public Integer getIdConfiguracaocorrente() {
        return idConfiguracaocorrente;
    }

    public PlataformaAerea setIdConfiguracaocorrente(Integer idConfiguracaocorrente) {
        this.idConfiguracaocorrente = idConfiguracaocorrente;
        return this;
    }

    public String getHf() {
        return hf;
    }

    public PlataformaAerea setHf(String hf) {
        this.hf = hf;
        return this;
    }

    public String getUhf() {
        return uhf;
    }

    public PlataformaAerea setUhf(String uhf) {
        this.uhf = uhf;
        return this;
    }

    public String getVhf() {
        return vhf;
    }

    public PlataformaAerea setVhf(String vhf) {
        this.vhf = vhf;
        return this;
    }

    public Integer getIdPista() {
        return idPista;
    }

    public PlataformaAerea setIdPista(Integer idPista) {
        this.idPista = idPista;
        return this;
    }

    public Integer getIdTipopropulsao() {
        return idTipopropulsao;
    }

    public PlataformaAerea setIdTipopropulsao(Integer idTipopropulsao) {
        this.idTipopropulsao = idTipopropulsao;
        return this;
    }

    public Integer getIdRecursopropulsao() {
        return idRecursopropulsao;
    }

    public PlataformaAerea setIdRecursopropulsao(Integer idRecursopropulsao) {
        this.idRecursopropulsao = idRecursopropulsao;
        return this;
    }

    public Double getDanoSensor() {
        return danoSensor;
    }

    public PlataformaAerea setDanoSensor(Double danoSensor) {
        this.danoSensor = danoSensor;
        return this;
    }

    public String getOutrosSistemasComunicacao() {
        return outrosSistemasComunicacao;
    }

    public PlataformaAerea setOutrosSistemasComunicacao(String outrosSistemasComunicacao) {
        this.outrosSistemasComunicacao = outrosSistemasComunicacao;
        return this;
    }

    public String getSigla() {
        return sigla;
    }

    public PlataformaAerea setSigla(String sigla) {
        this.sigla = sigla;
        return this;
    }

    public Character getEmEspera() {
        return emEspera;
    }

    public PlataformaAerea setEmEspera(Character emEspera) {
        this.emEspera = emEspera;
        return this;
    }

    public String getDHTerminoEspera() {
        return dHTerminoEspera;
    }

    public PlataformaAerea setDHTerminoEspera(String dHTerminoEspera) {
        this.dHTerminoEspera = dHTerminoEspera;
        return this;
    }

}