package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "PlataformaSuperficie")
@Table(schema = "Dominio")
public class PlataformaSuperficie extends Elemento {
    @Column(name = "Id_Elemento_Origem")
    private Integer idElementoOrigem;

    @Column(name = "NomeClasse", nullable = false, length = 50)
    private String nomeClasse;

    @Column(name = "Id_SituacaoPlataforma", nullable = false)
    private Integer idSituacaoplataforma;

    @Column(name = "VelocLogistica")
    private Double velocLogistica;

    @Column(name = "CteConsumo1")
    private Double cteConsumo1;

    @Column(name = "CteConsumo2")
    private Double cteConsumo2;

    @Column(name = "CtePatrulha")
    private Double ctePatrulha;

    @Column(name = "DanoVeloc")
    private Double danoVeloc;

    @Column(name = "CME")
    private Character cme;

    @Column(name = "BandaCME", length = 50)
    private String bandaCME;

    @Column(name = "IFF")
    private Character iff;

    @Column(name = "MAGE")
    private Character mage;

    @Column(name = "BandaMAGE", length = 50)
    private String bandaMAGE;

    @Column(name = "TipoPlatSuperficieNum")
    private Integer tipoPlatSuperficieNum;

    @Column(name = "TipoPlatSuperficie", nullable = false, length = 50)
    private String tipoPlatSuperficie;

    @Column(name = "Deslocamento", nullable = false)
    private Double deslocamento;

    @Column(name = "Calado", nullable = false)
    private Double calado;

    @Column(name = "Comprimento", nullable = false)
    private Double comprimento;

    @Column(name = "Boca", nullable = false)
    private Double boca;

    @Column(name = "VelocEC")
    private Integer velocEC;

    @Column(name = "VelocMM")
    private Integer velocMM;

    @Column(name = "VelocMAX")
    private Integer velocMAX;

    @Column(name = "RAVelocEC")
    private Integer rAVelocEC;

    @Column(name = "RAVelocMM")
    private Integer rAVelocMM;

    @Column(name = "RAVelocMAX")
    private Integer rAVelocMAX;

    @Column(name = "ConsumoVelocEC")
    private Double consumoVelocEC;

    @Column(name = "ConsumoVelocMM")
    private Double consumoVelocMM;

    @Column(name = "ConsumoVelocMAX")
    private Double consumoVelocMAX;

    @Column(name = "Propulsao", length = 3)
    private String propulsao;

    @Column(name = "CapacDocagem")
    private Double capacDocagem;

    @Column(name = "CapacHangaragem")
    private Double capacHangaragem;

    @Column(name = "AreaHangarOcupada")
    private Double areaHangarOcupada;

    @Column(name = "id_pista")
    private Integer idPista;

    @Column(name = "Janela")
    private Character janela;

    @Column(name = "VHF", length = 10)
    private String vhf;

    @Column(name = "UHF", length = 10)
    private String uhf;

    @Column(name = "HF", length = 10)
    private String hf;

    @Column(name = "Guia")
    private Integer guia;

    @Column(name = "Id_TipoPropulsao")
    private Integer idTipopropulsao;

    @Column(name = "Id_RecursoPropulsao")
    private Integer idRecursopropulsao;

    @Column(name = "Id_PlantaPropulsora")
    private Integer idPlantapropulsora;

    @Column(name = "DanoSensor")
    private Double danoSensor;

    @Column(name = "Sigla", length = 10)
    private String sigla;

    @Column(name = "m_DanoReabastecimento")
    private Integer mDanoreabastecimento;

    @Column(name = "m_DanoOpsAereasHE")
    private Integer mDanoopsaereashe;

    @Column(name = "m_DanoOpsAereasAsaFixa")
    private Integer mDanoopsaereasasafixa;

    @Column(name = "m_DanoComs_HF")
    private Integer mDanocomsHf;

    @Column(name = "m_DanoComs_VHF")
    private Integer mDanocomsVhf;

    @Column(name = "m_DanoComs_UHF")
    private Integer mDanocomsUhf;

    @Column(name = "EhCapitanea")
    private Character ehCapitanea;

    public Integer getIdElementoOrigem() {
        return idElementoOrigem;
    }

    public PlataformaSuperficie setIdElementoOrigem(Integer idElementoOrigem) {
        this.idElementoOrigem = idElementoOrigem;
        return this;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    public PlataformaSuperficie setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
        return this;
    }

    public Integer getIdSituacaoplataforma() {
        return idSituacaoplataforma;
    }

    public PlataformaSuperficie setIdSituacaoplataforma(Integer idSituacaoplataforma) {
        this.idSituacaoplataforma = idSituacaoplataforma;
        return this;
    }

    public Double getVelocLogistica() {
        return velocLogistica;
    }

    public PlataformaSuperficie setVelocLogistica(Double velocLogistica) {
        this.velocLogistica = velocLogistica;
        return this;
    }

    public Double getCteConsumo1() {
        return cteConsumo1;
    }

    public PlataformaSuperficie setCteConsumo1(Double cteConsumo1) {
        this.cteConsumo1 = cteConsumo1;
        return this;
    }

    public Double getCteConsumo2() {
        return cteConsumo2;
    }

    public PlataformaSuperficie setCteConsumo2(Double cteConsumo2) {
        this.cteConsumo2 = cteConsumo2;
        return this;
    }

    public Double getCtePatrulha() {
        return ctePatrulha;
    }

    public PlataformaSuperficie setCtePatrulha(Double ctePatrulha) {
        this.ctePatrulha = ctePatrulha;
        return this;
    }

    public Double getDanoVeloc() {
        return danoVeloc;
    }

    public PlataformaSuperficie setDanoVeloc(Double danoVeloc) {
        this.danoVeloc = danoVeloc;
        return this;
    }

    public Character getCme() {
        return cme;
    }

    public PlataformaSuperficie setCme(Character cme) {
        this.cme = cme;
        return this;
    }

    public String getBandaCME() {
        return bandaCME;
    }

    public PlataformaSuperficie setBandaCME(String bandaCME) {
        this.bandaCME = bandaCME;
        return this;
    }

    public Character getIff() {
        return iff;
    }

    public PlataformaSuperficie setIff(Character iff) {
        this.iff = iff;
        return this;
    }

    public Character getMage() {
        return mage;
    }

    public PlataformaSuperficie setMage(Character mage) {
        this.mage = mage;
        return this;
    }

    public String getBandaMAGE() {
        return bandaMAGE;
    }

    public PlataformaSuperficie setBandaMAGE(String bandaMAGE) {
        this.bandaMAGE = bandaMAGE;
        return this;
    }

    public Integer getTipoPlatSuperficieNum() {
        return tipoPlatSuperficieNum;
    }

    public PlataformaSuperficie setTipoPlatSuperficieNum(Integer tipoPlatSuperficieNum) {
        this.tipoPlatSuperficieNum = tipoPlatSuperficieNum;
        return this;
    }

    public String getTipoPlatSuperficie() {
        return tipoPlatSuperficie;
    }

    public PlataformaSuperficie setTipoPlatSuperficie(String tipoPlatSuperficie) {
        this.tipoPlatSuperficie = tipoPlatSuperficie;
        return this;
    }

    public Double getDeslocamento() {
        return deslocamento;
    }

    public PlataformaSuperficie setDeslocamento(Double deslocamento) {
        this.deslocamento = deslocamento;
        return this;
    }

    public Double getCalado() {
        return calado;
    }

    public PlataformaSuperficie setCalado(Double calado) {
        this.calado = calado;
        return this;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public PlataformaSuperficie setComprimento(Double comprimento) {
        this.comprimento = comprimento;
        return this;
    }

    public Double getBoca() {
        return boca;
    }

    public PlataformaSuperficie setBoca(Double boca) {
        this.boca = boca;
        return this;
    }

    public Integer getVelocEC() {
        return velocEC;
    }

    public PlataformaSuperficie setVelocEC(Integer velocEC) {
        this.velocEC = velocEC;
        return this;
    }

    public Integer getVelocMM() {
        return velocMM;
    }

    public PlataformaSuperficie setVelocMM(Integer velocMM) {
        this.velocMM = velocMM;
        return this;
    }

    public Integer getVelocMAX() {
        return velocMAX;
    }

    public PlataformaSuperficie setVelocMAX(Integer velocMAX) {
        this.velocMAX = velocMAX;
        return this;
    }

    public Integer getRAVelocEC() {
        return rAVelocEC;
    }

    public PlataformaSuperficie setRAVelocEC(Integer rAVelocEC) {
        this.rAVelocEC = rAVelocEC;
        return this;
    }

    public Integer getRAVelocMM() {
        return rAVelocMM;
    }

    public PlataformaSuperficie setRAVelocMM(Integer rAVelocMM) {
        this.rAVelocMM = rAVelocMM;
        return this;
    }

    public Integer getRAVelocMAX() {
        return rAVelocMAX;
    }

    public PlataformaSuperficie setRAVelocMAX(Integer rAVelocMAX) {
        this.rAVelocMAX = rAVelocMAX;
        return this;
    }

    public Double getConsumoVelocEC() {
        return consumoVelocEC;
    }

    public PlataformaSuperficie setConsumoVelocEC(Double consumoVelocEC) {
        this.consumoVelocEC = consumoVelocEC;
        return this;
    }

    public Double getConsumoVelocMM() {
        return consumoVelocMM;
    }

    public PlataformaSuperficie setConsumoVelocMM(Double consumoVelocMM) {
        this.consumoVelocMM = consumoVelocMM;
        return this;
    }

    public Double getConsumoVelocMAX() {
        return consumoVelocMAX;
    }

    public PlataformaSuperficie setConsumoVelocMAX(Double consumoVelocMAX) {
        this.consumoVelocMAX = consumoVelocMAX;
        return this;
    }

    public String getPropulsao() {
        return propulsao;
    }

    public PlataformaSuperficie setPropulsao(String propulsao) {
        this.propulsao = propulsao;
        return this;
    }

    public Double getCapacDocagem() {
        return capacDocagem;
    }

    public PlataformaSuperficie setCapacDocagem(Double capacDocagem) {
        this.capacDocagem = capacDocagem;
        return this;
    }

    public Double getCapacHangaragem() {
        return capacHangaragem;
    }

    public PlataformaSuperficie setCapacHangaragem(Double capacHangaragem) {
        this.capacHangaragem = capacHangaragem;
        return this;
    }

    public Double getAreaHangarOcupada() {
        return areaHangarOcupada;
    }

    public PlataformaSuperficie setAreaHangarOcupada(Double areaHangarOcupada) {
        this.areaHangarOcupada = areaHangarOcupada;
        return this;
    }

    public Integer getIdPista() {
        return idPista;
    }

    public PlataformaSuperficie setIdPista(Integer idPista) {
        this.idPista = idPista;
        return this;
    }

    public Character getJanela() {
        return janela;
    }

    public PlataformaSuperficie setJanela(Character janela) {
        this.janela = janela;
        return this;
    }

    public String getVhf() {
        return vhf;
    }

    public PlataformaSuperficie setVhf(String vhf) {
        this.vhf = vhf;
        return this;
    }

    public String getUhf() {
        return uhf;
    }

    public PlataformaSuperficie setUhf(String uhf) {
        this.uhf = uhf;
        return this;
    }

    public String getHf() {
        return hf;
    }

    public PlataformaSuperficie setHf(String hf) {
        this.hf = hf;
        return this;
    }

    public Integer getGuia() {
        return guia;
    }

    public PlataformaSuperficie setGuia(Integer guia) {
        this.guia = guia;
        return this;
    }

    public Integer getIdTipopropulsao() {
        return idTipopropulsao;
    }

    public PlataformaSuperficie setIdTipopropulsao(Integer idTipopropulsao) {
        this.idTipopropulsao = idTipopropulsao;
        return this;
    }

    public Integer getIdRecursopropulsao() {
        return idRecursopropulsao;
    }

    public PlataformaSuperficie setIdRecursopropulsao(Integer idRecursopropulsao) {
        this.idRecursopropulsao = idRecursopropulsao;
        return this;
    }

    public Integer getIdPlantapropulsora() {
        return idPlantapropulsora;
    }

    public PlataformaSuperficie setIdPlantapropulsora(Integer idPlantapropulsora) {
        this.idPlantapropulsora = idPlantapropulsora;
        return this;
    }

    public Double getDanoSensor() {
        return danoSensor;
    }

    public PlataformaSuperficie setDanoSensor(Double danoSensor) {
        this.danoSensor = danoSensor;
        return this;
    }

    public String getSigla() {
        return sigla;
    }

    public PlataformaSuperficie setSigla(String sigla) {
        this.sigla = sigla;
        return this;
    }

    public Integer getMDanoreabastecimento() {
        return mDanoreabastecimento;
    }

    public PlataformaSuperficie setMDanoreabastecimento(Integer mDanoreabastecimento) {
        this.mDanoreabastecimento = mDanoreabastecimento;
        return this;
    }

    public Integer getMDanoopsaereashe() {
        return mDanoopsaereashe;
    }

    public PlataformaSuperficie setMDanoopsaereashe(Integer mDanoopsaereashe) {
        this.mDanoopsaereashe = mDanoopsaereashe;
        return this;
    }

    public Integer getMDanoopsaereasasafixa() {
        return mDanoopsaereasasafixa;
    }

    public PlataformaSuperficie setMDanoopsaereasasafixa(Integer mDanoopsaereasasafixa) {
        this.mDanoopsaereasasafixa = mDanoopsaereasasafixa;
        return this;
    }

    public Integer getMDanocomsHf() {
        return mDanocomsHf;
    }

    public PlataformaSuperficie setMDanocomsHf(Integer mDanocomsHf) {
        this.mDanocomsHf = mDanocomsHf;
        return this;
    }

    public Integer getMDanocomsVhf() {
        return mDanocomsVhf;
    }

    public PlataformaSuperficie setMDanocomsVhf(Integer mDanocomsVhf) {
        this.mDanocomsVhf = mDanocomsVhf;
        return this;
    }

    public Integer getMDanocomsUhf() {
        return mDanocomsUhf;
    }

    public PlataformaSuperficie setMDanocomsUhf(Integer mDanocomsUhf) {
        this.mDanocomsUhf = mDanocomsUhf;
        return this;
    }

    public Character getEhCapitanea() {
        return ehCapitanea;
    }

    public PlataformaSuperficie setEhCapitanea(Character ehCapitanea) {
        this.ehCapitanea = ehCapitanea;
        return this;
    }

}