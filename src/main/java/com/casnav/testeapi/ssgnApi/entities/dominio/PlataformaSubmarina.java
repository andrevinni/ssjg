package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "PlataformaSubmarina")
@Table(schema = "Dominio")
public class PlataformaSubmarina extends Elemento {
    @Column(name = "id_Elemento_Origem")
    private Integer idElementoOrigem;

    @Column(name = "NomeClasse", length = 50)
    private String nomeClasse;

    @Column(name = "Id_SituacaoPlataforma", nullable = false)
    private Integer idSituacaoplataforma;

    @Column(name = "DeslocamentoSup")
    private Double deslocamentoSup;

    @Column(name = "DeslocamentoImerso")
    private Double deslocamentoImerso;

    @Column(name = "Boca")
    private Double boca;

    @Column(name = "Calado")
    private Double calado;

    @Column(name = "Comprimento")
    private Double comprimento;

    @Column(name = "Esnorquel", length = 50)
    private String esnorquel;

    @Column(name = "CoeficienteSeguranca")
    private Double coeficienteSeguranca;

    @Column(name = "Autonomia")
    private Double autonomia;

    @Column(name = "Manutencao")
    private Integer manutencao;

    @Column(name = "NumTubos")
    private Integer numTubos;

    @Column(name = "VelocECSup")
    private Integer velocECSup;

    @Column(name = "VelocECImerso")
    private Integer velocECImerso;

    @Column(name = "VelocMAXImerso")
    private Integer velocMAXImerso;

    @Column(name = "VelocMMSuperficie")
    private Integer velocMMSuperficie;

    @Column(name = "VelocMMEsnorquel")
    private Integer velocMMEsnorquel;

    @Column(name = "VelocMMNuclear")
    private Integer velocMMNuclear;

    @Column(name = "RAVECSup")
    private Integer rAVECSup;

    @Column(name = "RAVelocMAXImerso")
    private Integer rAVelocMAXImerso;

    @Column(name = "RAVelocMMSup")
    private Integer rAVelocMMSup;

    @Column(name = "RAVelocMMEsnorquel")
    private Integer rAVelocMMEsnorquel;

    @Column(name = "RAVelocECImerso")
    private Integer rAVelocECImerso;

    @Column(name = "RAVelocMMNuclear")
    private Integer rAVelocMMNuclear;

    @Column(name = "ConsumoVelocECSup")
    private Double consumoVelocECSup;

    @Column(name = "ConsumoVelocECImerso")
    private Double consumoVelocECImerso;

    @Column(name = "ConsumoVelocMAXImerso")
    private Double consumoVelocMAXImerso;

    @Column(name = "ConsumoVelocMMSup")
    private Double consumoVelocMMSup;

    @Column(name = "ConsumoVelocMMEsnorquel")
    private Double consumoVelocMMEsnorquel;

    @Column(name = "CargaMaxima")
    private Double cargaMaxima;

    @Column(name = "CargaAtual")
    private Double cargaAtual;

    @Column(name = "CteDescarga1")
    private Double cteDescarga1;

    @Column(name = "CteDescarga2")
    private Double cteDescarga2;

    @Column(name = "Profundidade")
    private Integer profundidade;

    @Column(name = "Propulsao", length = 3)
    private String propulsao;

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

    @Column(name = "BandaMAGE", length = 50)
    private String bandaMAGE;

    @Column(name = "Despist", length = 10)
    private String despist;

    @Column(name = "VLF", length = 10)
    private String vlf;

    @Column(name = "HF_LF", length = 10)
    private String hfLf;

    @Column(name = "VHF", length = 10)
    private String vhf;

    @Column(name = "UHF", length = 10)
    private String uhf;

    @Column(name = "CotaMaxOperac")
    private Double cotaMaxOperac;

    @Column(name = "VelocLogistica")
    private Double velocLogistica;

    @Column(name = "Id_PlantaPropulsora")
    private Integer idPlantapropulsora;

    @Column(name = "Id_TipoPropulsao")
    private Integer idTipopropulsao;

    @Column(name = "Id_RecursoPropulsao")
    private Integer idRecursopropulsao;

    @Column(name = "DanoSensor")
    private Double danoSensor;

    @Column(name = "Sigla", length = 10)
    private String sigla;

    @Column(name = "m_DanoComs_HF")
    private Integer mDanocomsHf;

    @Column(name = "m_DanoComs_VHF")
    private Integer mDanocomsVhf;

    @Column(name = "m_DanoComs_VLF")
    private Integer mDanocomsVlf;

    @Column(name = "m_DanoComs_HF_LF")
    private Integer mDanocomsHfLf;

    public Integer getIdElementoOrigem() {
        return idElementoOrigem;
    }

    public PlataformaSubmarina setIdElementoOrigem(Integer idElementoOrigem) {
        this.idElementoOrigem = idElementoOrigem;
        return this;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    public PlataformaSubmarina setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
        return this;
    }

    public Integer getIdSituacaoplataforma() {
        return idSituacaoplataforma;
    }

    public PlataformaSubmarina setIdSituacaoplataforma(Integer idSituacaoplataforma) {
        this.idSituacaoplataforma = idSituacaoplataforma;
        return this;
    }

    public Double getDeslocamentoSup() {
        return deslocamentoSup;
    }

    public PlataformaSubmarina setDeslocamentoSup(Double deslocamentoSup) {
        this.deslocamentoSup = deslocamentoSup;
        return this;
    }

    public Double getDeslocamentoImerso() {
        return deslocamentoImerso;
    }

    public PlataformaSubmarina setDeslocamentoImerso(Double deslocamentoImerso) {
        this.deslocamentoImerso = deslocamentoImerso;
        return this;
    }

    public Double getBoca() {
        return boca;
    }

    public PlataformaSubmarina setBoca(Double boca) {
        this.boca = boca;
        return this;
    }

    public Double getCalado() {
        return calado;
    }

    public PlataformaSubmarina setCalado(Double calado) {
        this.calado = calado;
        return this;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public PlataformaSubmarina setComprimento(Double comprimento) {
        this.comprimento = comprimento;
        return this;
    }

    public String getEsnorquel() {
        return esnorquel;
    }

    public PlataformaSubmarina setEsnorquel(String esnorquel) {
        this.esnorquel = esnorquel;
        return this;
    }

    public Double getCoeficienteSeguranca() {
        return coeficienteSeguranca;
    }

    public PlataformaSubmarina setCoeficienteSeguranca(Double coeficienteSeguranca) {
        this.coeficienteSeguranca = coeficienteSeguranca;
        return this;
    }

    public Double getAutonomia() {
        return autonomia;
    }

    public PlataformaSubmarina setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
        return this;
    }

    public Integer getManutencao() {
        return manutencao;
    }

    public PlataformaSubmarina setManutencao(Integer manutencao) {
        this.manutencao = manutencao;
        return this;
    }

    public Integer getNumTubos() {
        return numTubos;
    }

    public PlataformaSubmarina setNumTubos(Integer numTubos) {
        this.numTubos = numTubos;
        return this;
    }

    public Integer getVelocECSup() {
        return velocECSup;
    }

    public PlataformaSubmarina setVelocECSup(Integer velocECSup) {
        this.velocECSup = velocECSup;
        return this;
    }

    public Integer getVelocECImerso() {
        return velocECImerso;
    }

    public PlataformaSubmarina setVelocECImerso(Integer velocECImerso) {
        this.velocECImerso = velocECImerso;
        return this;
    }

    public Integer getVelocMAXImerso() {
        return velocMAXImerso;
    }

    public PlataformaSubmarina setVelocMAXImerso(Integer velocMAXImerso) {
        this.velocMAXImerso = velocMAXImerso;
        return this;
    }

    public Integer getVelocMMSuperficie() {
        return velocMMSuperficie;
    }

    public PlataformaSubmarina setVelocMMSuperficie(Integer velocMMSuperficie) {
        this.velocMMSuperficie = velocMMSuperficie;
        return this;
    }

    public Integer getVelocMMEsnorquel() {
        return velocMMEsnorquel;
    }

    public PlataformaSubmarina setVelocMMEsnorquel(Integer velocMMEsnorquel) {
        this.velocMMEsnorquel = velocMMEsnorquel;
        return this;
    }

    public Integer getVelocMMNuclear() {
        return velocMMNuclear;
    }

    public PlataformaSubmarina setVelocMMNuclear(Integer velocMMNuclear) {
        this.velocMMNuclear = velocMMNuclear;
        return this;
    }

    public Integer getRAVECSup() {
        return rAVECSup;
    }

    public PlataformaSubmarina setRAVECSup(Integer rAVECSup) {
        this.rAVECSup = rAVECSup;
        return this;
    }

    public Integer getRAVelocMAXImerso() {
        return rAVelocMAXImerso;
    }

    public PlataformaSubmarina setRAVelocMAXImerso(Integer rAVelocMAXImerso) {
        this.rAVelocMAXImerso = rAVelocMAXImerso;
        return this;
    }

    public Integer getRAVelocMMSup() {
        return rAVelocMMSup;
    }

    public PlataformaSubmarina setRAVelocMMSup(Integer rAVelocMMSup) {
        this.rAVelocMMSup = rAVelocMMSup;
        return this;
    }

    public Integer getRAVelocMMEsnorquel() {
        return rAVelocMMEsnorquel;
    }

    public PlataformaSubmarina setRAVelocMMEsnorquel(Integer rAVelocMMEsnorquel) {
        this.rAVelocMMEsnorquel = rAVelocMMEsnorquel;
        return this;
    }

    public Integer getRAVelocECImerso() {
        return rAVelocECImerso;
    }

    public PlataformaSubmarina setRAVelocECImerso(Integer rAVelocECImerso) {
        this.rAVelocECImerso = rAVelocECImerso;
        return this;
    }

    public Integer getRAVelocMMNuclear() {
        return rAVelocMMNuclear;
    }

    public PlataformaSubmarina setRAVelocMMNuclear(Integer rAVelocMMNuclear) {
        this.rAVelocMMNuclear = rAVelocMMNuclear;
        return this;
    }

    public Double getConsumoVelocECSup() {
        return consumoVelocECSup;
    }

    public PlataformaSubmarina setConsumoVelocECSup(Double consumoVelocECSup) {
        this.consumoVelocECSup = consumoVelocECSup;
        return this;
    }

    public Double getConsumoVelocECImerso() {
        return consumoVelocECImerso;
    }

    public PlataformaSubmarina setConsumoVelocECImerso(Double consumoVelocECImerso) {
        this.consumoVelocECImerso = consumoVelocECImerso;
        return this;
    }

    public Double getConsumoVelocMAXImerso() {
        return consumoVelocMAXImerso;
    }

    public PlataformaSubmarina setConsumoVelocMAXImerso(Double consumoVelocMAXImerso) {
        this.consumoVelocMAXImerso = consumoVelocMAXImerso;
        return this;
    }

    public Double getConsumoVelocMMSup() {
        return consumoVelocMMSup;
    }

    public PlataformaSubmarina setConsumoVelocMMSup(Double consumoVelocMMSup) {
        this.consumoVelocMMSup = consumoVelocMMSup;
        return this;
    }

    public Double getConsumoVelocMMEsnorquel() {
        return consumoVelocMMEsnorquel;
    }

    public PlataformaSubmarina setConsumoVelocMMEsnorquel(Double consumoVelocMMEsnorquel) {
        this.consumoVelocMMEsnorquel = consumoVelocMMEsnorquel;
        return this;
    }

    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public PlataformaSubmarina setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
        return this;
    }

    public Double getCargaAtual() {
        return cargaAtual;
    }

    public PlataformaSubmarina setCargaAtual(Double cargaAtual) {
        this.cargaAtual = cargaAtual;
        return this;
    }

    public Double getCteDescarga1() {
        return cteDescarga1;
    }

    public PlataformaSubmarina setCteDescarga1(Double cteDescarga1) {
        this.cteDescarga1 = cteDescarga1;
        return this;
    }

    public Double getCteDescarga2() {
        return cteDescarga2;
    }

    public PlataformaSubmarina setCteDescarga2(Double cteDescarga2) {
        this.cteDescarga2 = cteDescarga2;
        return this;
    }

    public Integer getProfundidade() {
        return profundidade;
    }

    public PlataformaSubmarina setProfundidade(Integer profundidade) {
        this.profundidade = profundidade;
        return this;
    }

    public String getPropulsao() {
        return propulsao;
    }

    public PlataformaSubmarina setPropulsao(String propulsao) {
        this.propulsao = propulsao;
        return this;
    }

    public Double getCteConsumo1() {
        return cteConsumo1;
    }

    public PlataformaSubmarina setCteConsumo1(Double cteConsumo1) {
        this.cteConsumo1 = cteConsumo1;
        return this;
    }

    public Double getCteConsumo2() {
        return cteConsumo2;
    }

    public PlataformaSubmarina setCteConsumo2(Double cteConsumo2) {
        this.cteConsumo2 = cteConsumo2;
        return this;
    }

    public Double getCtePatrulha() {
        return ctePatrulha;
    }

    public PlataformaSubmarina setCtePatrulha(Double ctePatrulha) {
        this.ctePatrulha = ctePatrulha;
        return this;
    }

    public Double getDanoVeloc() {
        return danoVeloc;
    }

    public PlataformaSubmarina setDanoVeloc(Double danoVeloc) {
        this.danoVeloc = danoVeloc;
        return this;
    }

    public Character getIff() {
        return iff;
    }

    public PlataformaSubmarina setIff(Character iff) {
        this.iff = iff;
        return this;
    }

    public Character getMage() {
        return mage;
    }

    public PlataformaSubmarina setMage(Character mage) {
        this.mage = mage;
        return this;
    }

    public String getBandaMAGE() {
        return bandaMAGE;
    }

    public PlataformaSubmarina setBandaMAGE(String bandaMAGE) {
        this.bandaMAGE = bandaMAGE;
        return this;
    }

    public String getDespist() {
        return despist;
    }

    public PlataformaSubmarina setDespist(String despist) {
        this.despist = despist;
        return this;
    }

    public String getVlf() {
        return vlf;
    }

    public PlataformaSubmarina setVlf(String vlf) {
        this.vlf = vlf;
        return this;
    }

    public String getHfLf() {
        return hfLf;
    }

    public PlataformaSubmarina setHfLf(String hfLf) {
        this.hfLf = hfLf;
        return this;
    }

    public String getVhf() {
        return vhf;
    }

    public PlataformaSubmarina setVhf(String vhf) {
        this.vhf = vhf;
        return this;
    }

    public String getUhf() {
        return uhf;
    }

    public PlataformaSubmarina setUhf(String uhf) {
        this.uhf = uhf;
        return this;
    }

    public Double getCotaMaxOperac() {
        return cotaMaxOperac;
    }

    public PlataformaSubmarina setCotaMaxOperac(Double cotaMaxOperac) {
        this.cotaMaxOperac = cotaMaxOperac;
        return this;
    }

    public Double getVelocLogistica() {
        return velocLogistica;
    }

    public PlataformaSubmarina setVelocLogistica(Double velocLogistica) {
        this.velocLogistica = velocLogistica;
        return this;
    }

    public Integer getIdPlantapropulsora() {
        return idPlantapropulsora;
    }

    public PlataformaSubmarina setIdPlantapropulsora(Integer idPlantapropulsora) {
        this.idPlantapropulsora = idPlantapropulsora;
        return this;
    }

    public Integer getIdTipopropulsao() {
        return idTipopropulsao;
    }

    public PlataformaSubmarina setIdTipopropulsao(Integer idTipopropulsao) {
        this.idTipopropulsao = idTipopropulsao;
        return this;
    }

    public Integer getIdRecursopropulsao() {
        return idRecursopropulsao;
    }

    public PlataformaSubmarina setIdRecursopropulsao(Integer idRecursopropulsao) {
        this.idRecursopropulsao = idRecursopropulsao;
        return this;
    }

    public Double getDanoSensor() {
        return danoSensor;
    }

    public PlataformaSubmarina setDanoSensor(Double danoSensor) {
        this.danoSensor = danoSensor;
        return this;
    }

    public String getSigla() {
        return sigla;
    }

    public PlataformaSubmarina setSigla(String sigla) {
        this.sigla = sigla;
        return this;
    }

    public Integer getMDanocomsHf() {
        return mDanocomsHf;
    }

    public PlataformaSubmarina setMDanocomsHf(Integer mDanocomsHf) {
        this.mDanocomsHf = mDanocomsHf;
        return this;
    }

    public Integer getMDanocomsVhf() {
        return mDanocomsVhf;
    }

    public PlataformaSubmarina setMDanocomsVhf(Integer mDanocomsVhf) {
        this.mDanocomsVhf = mDanocomsVhf;
        return this;
    }

    public Integer getMDanocomsVlf() {
        return mDanocomsVlf;
    }

    public PlataformaSubmarina setMDanocomsVlf(Integer mDanocomsVlf) {
        this.mDanocomsVlf = mDanocomsVlf;
        return this;
    }

    public Integer getMDanocomsHfLf() {
        return mDanocomsHfLf;
    }

    public PlataformaSubmarina setMDanocomsHfLf(Integer mDanocomsHfLf) {
        this.mDanocomsHfLf = mDanocomsHfLf;
        return this;
    }

}