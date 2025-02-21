package com.casnav.testeapi.ssgnApi.entities.montagem;

import jakarta.persistence.*;

@Entity(name = "ClasseSubmarino")
@Table(schema = "Montagem_Jogos")
public class ClasseSubmarino {
    @Id
    @Column(name = "Id_ClasseSubmarino", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_ClasseSubmarino", nullable = false)
    private com.casnav.testeapi.ssgnApi.entities.montagem.ElementoMontagem elementoMontagem;

    @Column(name = "DeslocamentoSup", nullable = false)
    private Double deslocamentoSup;

    @Column(name = "DeslocamentoImerso", nullable = false)
    private Double deslocamentoImerso;

    @Column(name = "Calado", nullable = false)
    private Double calado;

    @Column(name = "Comprimento", nullable = false)
    private Double comprimento;

    @Column(name = "Boca", nullable = false)
    private Double boca;

    @Column(name = "Id_Propulsao", nullable = false)
    private Integer idPropulsao;

    @Column(name = "CoeficienteSeguranca", nullable = false)
    private Double coeficienteSeguranca;

    @Column(name = "Autonomia", nullable = false)
    private Integer autonomia;

    @Column(name = "Manutencao", nullable = false)
    private Integer manutencao;

    @Column(name = "VelocECSup", nullable = false)
    private Integer velocECSup;

    @Column(name = "VelocECImerso", nullable = false)
    private Integer velocECImerso;

    @Column(name = "VelocMaxImerso", nullable = false)
    private Integer velocMaxImerso;

    @Column(name = "VelocMMSuperficie", nullable = false)
    private Integer velocMMSuperficie;

    @Column(name = "VelocMMEsnorquel", nullable = false)
    private Integer velocMMEsnorquel;

    @Column(name = "VelocMMNuclear", nullable = false)
    private Integer velocMMNuclear;

    @Column(name = "RaioAcaoVelocSup", nullable = false)
    private Integer raioAcaoVelocSup;

    @Column(name = "RaioAcaoVelocMaxImerso", nullable = false)
    private Integer raioAcaoVelocMaxImerso;

    @Column(name = "RaioAcaoVelocMMSup", nullable = false)
    private Integer raioAcaoVelocMMSup;

    @Column(name = "RaioAcaoVelocECIm", nullable = false)
    private Integer raioAcaoVelocECIm;

    @Column(name = "RaioAcaoVelocMMNuclear", nullable = false)
    private Integer raioAcaoVelocMMNuclear;

    @Column(name = "RaioAcaoVelocMMEsnorquel", nullable = false)
    private Integer raioAcaoVelocMMEsnorquel;

    @Column(name = "ConsumoVelocECSup", nullable = false)
    private Double consumoVelocECSup;

    @Column(name = "ConsumoVelocMMSup", nullable = false)
    private Double consumoVelocMMSup;

    @Column(name = "ConsumoVelocMMEsnorquel", nullable = false)
    private Double consumoVelocMMEsnorquel;

    @Column(name = "ConsumoVelocECImerso", nullable = false)
    private Double consumoVelocECImerso;

    @Column(name = "ConsumoVelocMaxImerso", nullable = false)
    private Double consumoVelocMaxImerso;

    @Column(name = "NumTubos", nullable = false)
    private Integer numTubos;

    @Column(name = "CargaMaxima")
    private Double cargaMaxima;

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

    @Column(name = "\"HF/LF\"", length = 10)
    private String hfLf;

    @Column(name = "VHF", length = 10)
    private String vhf;

    @Column(name = "UHF", length = 10)
    private String uhf;

    @Column(name = "Observacao", length = 50)
    private String observacao;

    @Column(name = "CotaMaxOperac")
    private Double cotaMaxOperac;

    @Column(name = "Sigla", length = 10)
    private String sigla;

    public Long getId() {
        return id;
    }

    public ClasseSubmarino setId(Long id) {
        this.id = id;
        return this;
    }

    public com.casnav.testeapi.ssgnApi.entities.montagem.ElementoMontagem getElementoMontagem() {
        return elementoMontagem;
    }

    public ClasseSubmarino setElementoMontagem(com.casnav.testeapi.ssgnApi.entities.montagem.ElementoMontagem elementoMontagem) {
        this.elementoMontagem = elementoMontagem;
        return this;
    }

    public Double getDeslocamentoSup() {
        return deslocamentoSup;
    }

    public ClasseSubmarino setDeslocamentoSup(Double deslocamentoSup) {
        this.deslocamentoSup = deslocamentoSup;
        return this;
    }

    public Double getDeslocamentoImerso() {
        return deslocamentoImerso;
    }

    public ClasseSubmarino setDeslocamentoImerso(Double deslocamentoImerso) {
        this.deslocamentoImerso = deslocamentoImerso;
        return this;
    }

    public Double getCalado() {
        return calado;
    }

    public ClasseSubmarino setCalado(Double calado) {
        this.calado = calado;
        return this;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public ClasseSubmarino setComprimento(Double comprimento) {
        this.comprimento = comprimento;
        return this;
    }

    public Double getBoca() {
        return boca;
    }

    public ClasseSubmarino setBoca(Double boca) {
        this.boca = boca;
        return this;
    }

    public Integer getIdPropulsao() {
        return idPropulsao;
    }

    public ClasseSubmarino setIdPropulsao(Integer idPropulsao) {
        this.idPropulsao = idPropulsao;
        return this;
    }

    public Double getCoeficienteSeguranca() {
        return coeficienteSeguranca;
    }

    public ClasseSubmarino setCoeficienteSeguranca(Double coeficienteSeguranca) {
        this.coeficienteSeguranca = coeficienteSeguranca;
        return this;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public ClasseSubmarino setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
        return this;
    }

    public Integer getManutencao() {
        return manutencao;
    }

    public ClasseSubmarino setManutencao(Integer manutencao) {
        this.manutencao = manutencao;
        return this;
    }

    public Integer getVelocECSup() {
        return velocECSup;
    }

    public ClasseSubmarino setVelocECSup(Integer velocECSup) {
        this.velocECSup = velocECSup;
        return this;
    }

    public Integer getVelocECImerso() {
        return velocECImerso;
    }

    public ClasseSubmarino setVelocECImerso(Integer velocECImerso) {
        this.velocECImerso = velocECImerso;
        return this;
    }

    public Integer getVelocMaxImerso() {
        return velocMaxImerso;
    }

    public ClasseSubmarino setVelocMaxImerso(Integer velocMaxImerso) {
        this.velocMaxImerso = velocMaxImerso;
        return this;
    }

    public Integer getVelocMMSuperficie() {
        return velocMMSuperficie;
    }

    public ClasseSubmarino setVelocMMSuperficie(Integer velocMMSuperficie) {
        this.velocMMSuperficie = velocMMSuperficie;
        return this;
    }

    public Integer getVelocMMEsnorquel() {
        return velocMMEsnorquel;
    }

    public ClasseSubmarino setVelocMMEsnorquel(Integer velocMMEsnorquel) {
        this.velocMMEsnorquel = velocMMEsnorquel;
        return this;
    }

    public Integer getVelocMMNuclear() {
        return velocMMNuclear;
    }

    public ClasseSubmarino setVelocMMNuclear(Integer velocMMNuclear) {
        this.velocMMNuclear = velocMMNuclear;
        return this;
    }

    public Integer getRaioAcaoVelocSup() {
        return raioAcaoVelocSup;
    }

    public ClasseSubmarino setRaioAcaoVelocSup(Integer raioAcaoVelocSup) {
        this.raioAcaoVelocSup = raioAcaoVelocSup;
        return this;
    }

    public Integer getRaioAcaoVelocMaxImerso() {
        return raioAcaoVelocMaxImerso;
    }

    public ClasseSubmarino setRaioAcaoVelocMaxImerso(Integer raioAcaoVelocMaxImerso) {
        this.raioAcaoVelocMaxImerso = raioAcaoVelocMaxImerso;
        return this;
    }

    public Integer getRaioAcaoVelocMMSup() {
        return raioAcaoVelocMMSup;
    }

    public ClasseSubmarino setRaioAcaoVelocMMSup(Integer raioAcaoVelocMMSup) {
        this.raioAcaoVelocMMSup = raioAcaoVelocMMSup;
        return this;
    }

    public Integer getRaioAcaoVelocECIm() {
        return raioAcaoVelocECIm;
    }

    public ClasseSubmarino setRaioAcaoVelocECIm(Integer raioAcaoVelocECIm) {
        this.raioAcaoVelocECIm = raioAcaoVelocECIm;
        return this;
    }

    public Integer getRaioAcaoVelocMMNuclear() {
        return raioAcaoVelocMMNuclear;
    }

    public ClasseSubmarino setRaioAcaoVelocMMNuclear(Integer raioAcaoVelocMMNuclear) {
        this.raioAcaoVelocMMNuclear = raioAcaoVelocMMNuclear;
        return this;
    }

    public Integer getRaioAcaoVelocMMEsnorquel() {
        return raioAcaoVelocMMEsnorquel;
    }

    public ClasseSubmarino setRaioAcaoVelocMMEsnorquel(Integer raioAcaoVelocMMEsnorquel) {
        this.raioAcaoVelocMMEsnorquel = raioAcaoVelocMMEsnorquel;
        return this;
    }

    public Double getConsumoVelocECSup() {
        return consumoVelocECSup;
    }

    public ClasseSubmarino setConsumoVelocECSup(Double consumoVelocECSup) {
        this.consumoVelocECSup = consumoVelocECSup;
        return this;
    }

    public Double getConsumoVelocMMSup() {
        return consumoVelocMMSup;
    }

    public ClasseSubmarino setConsumoVelocMMSup(Double consumoVelocMMSup) {
        this.consumoVelocMMSup = consumoVelocMMSup;
        return this;
    }

    public Double getConsumoVelocMMEsnorquel() {
        return consumoVelocMMEsnorquel;
    }

    public ClasseSubmarino setConsumoVelocMMEsnorquel(Double consumoVelocMMEsnorquel) {
        this.consumoVelocMMEsnorquel = consumoVelocMMEsnorquel;
        return this;
    }

    public Double getConsumoVelocECImerso() {
        return consumoVelocECImerso;
    }

    public ClasseSubmarino setConsumoVelocECImerso(Double consumoVelocECImerso) {
        this.consumoVelocECImerso = consumoVelocECImerso;
        return this;
    }

    public Double getConsumoVelocMaxImerso() {
        return consumoVelocMaxImerso;
    }

    public ClasseSubmarino setConsumoVelocMaxImerso(Double consumoVelocMaxImerso) {
        this.consumoVelocMaxImerso = consumoVelocMaxImerso;
        return this;
    }

    public Integer getNumTubos() {
        return numTubos;
    }

    public ClasseSubmarino setNumTubos(Integer numTubos) {
        this.numTubos = numTubos;
        return this;
    }

    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public ClasseSubmarino setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
        return this;
    }

    public Character getIff() {
        return iff;
    }

    public ClasseSubmarino setIff(Character iff) {
        this.iff = iff;
        return this;
    }

    public Character getMage() {
        return mage;
    }

    public ClasseSubmarino setMage(Character mage) {
        this.mage = mage;
        return this;
    }

    public String getBandaMAGE() {
        return bandaMAGE;
    }

    public ClasseSubmarino setBandaMAGE(String bandaMAGE) {
        this.bandaMAGE = bandaMAGE;
        return this;
    }

    public String getDespist() {
        return despist;
    }

    public ClasseSubmarino setDespist(String despist) {
        this.despist = despist;
        return this;
    }

    public String getVlf() {
        return vlf;
    }

    public ClasseSubmarino setVlf(String vlf) {
        this.vlf = vlf;
        return this;
    }

    public String getHfLf() {
        return hfLf;
    }

    public ClasseSubmarino setHfLf(String hfLf) {
        this.hfLf = hfLf;
        return this;
    }

    public String getVhf() {
        return vhf;
    }

    public ClasseSubmarino setVhf(String vhf) {
        this.vhf = vhf;
        return this;
    }

    public String getUhf() {
        return uhf;
    }

    public ClasseSubmarino setUhf(String uhf) {
        this.uhf = uhf;
        return this;
    }

    public String getObservacao() {
        return observacao;
    }

    public ClasseSubmarino setObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    public Double getCotaMaxOperac() {
        return cotaMaxOperac;
    }

    public ClasseSubmarino setCotaMaxOperac(Double cotaMaxOperac) {
        this.cotaMaxOperac = cotaMaxOperac;
        return this;
    }

    public String getSigla() {
        return sigla;
    }

    public ClasseSubmarino setSigla(String sigla) {
        this.sigla = sigla;
        return this;
    }

}