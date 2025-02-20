package com.casnav.testeapi.ssgnApi.modelos.Montagem;

import javax.persistence.*;

@Entity(name = "ClasseNavio")
@Table(schema = "Montagem_Jogos")
public class ClasseNavio {
    @Id
    @Column(name = "ID_ClasseNavio", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ClasseNavio", nullable = false)
    private com.casnav.testeapi.ssgnApi.modelos.Montagem.ElementoMontagem elementoMontagem;

    @Column(name = "Id_TipoPlatSuperficie")
    private Integer idTipoplatsuperficie;

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

    @Column(name = "RaioAcaoVelocEC")
    private Integer raioAcaoVelocEC;

    @Column(name = "RaioAcaoVelocMM")
    private Integer raioAcaoVelocMM;

    @Column(name = "RaioAcaoVelocMAX")
    private Integer raioAcaoVelocMAX;

    @Column(name = "ConsumoVelocEC")
    private Double consumoVelocEC;

    @Column(name = "ConsumoVelocMM")
    private Double consumoVelocMM;

    @Column(name = "ConsumoVelocMAX")
    private Double consumoVelocMAX;

    @Column(name = "Id_Propulsao", nullable = false)
    private Integer idPropulsao;

    @Column(name = "CapacHangaragem", nullable = false)
    private Double capacHangaragem;

    @Column(name = "Id_Pista")
    private Integer idPista;

    @Column(name = "Janela")
    private Character janela;

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

    @Column(name = "VHF", length = 10)
    private String vhf;

    @Column(name = "UHF", length = 10)
    private String uhf;

    @Column(name = "HF", length = 10)
    private String hf;

    @Column(name = "Id_PlantaPropulsora")
    private Integer idPlantapropulsora;

    @Column(name = "Observacao", length = 100)
    private String observacao;

    @Column(name = "Sigla", length = 10)
    private String sigla;

    public Long getId() {
        return id;
    }

    public ClasseNavio setId(Long id) {
        this.id = id;
        return this;
    }

    public com.casnav.testeapi.ssgnApi.modelos.Montagem.ElementoMontagem getElementoMontagem() {
        return elementoMontagem;
    }

    public ClasseNavio setElementoMontagem(com.casnav.testeapi.ssgnApi.modelos.Montagem.ElementoMontagem elementoMontagem) {
        this.elementoMontagem = elementoMontagem;
        return this;
    }

    public Integer getIdTipoplatsuperficie() {
        return idTipoplatsuperficie;
    }

    public ClasseNavio setIdTipoplatsuperficie(Integer idTipoplatsuperficie) {
        this.idTipoplatsuperficie = idTipoplatsuperficie;
        return this;
    }

    public Double getDeslocamento() {
        return deslocamento;
    }

    public ClasseNavio setDeslocamento(Double deslocamento) {
        this.deslocamento = deslocamento;
        return this;
    }

    public Double getCalado() {
        return calado;
    }

    public ClasseNavio setCalado(Double calado) {
        this.calado = calado;
        return this;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public ClasseNavio setComprimento(Double comprimento) {
        this.comprimento = comprimento;
        return this;
    }

    public Double getBoca() {
        return boca;
    }

    public ClasseNavio setBoca(Double boca) {
        this.boca = boca;
        return this;
    }

    public Integer getVelocEC() {
        return velocEC;
    }

    public ClasseNavio setVelocEC(Integer velocEC) {
        this.velocEC = velocEC;
        return this;
    }

    public Integer getVelocMM() {
        return velocMM;
    }

    public ClasseNavio setVelocMM(Integer velocMM) {
        this.velocMM = velocMM;
        return this;
    }

    public Integer getVelocMAX() {
        return velocMAX;
    }

    public ClasseNavio setVelocMAX(Integer velocMAX) {
        this.velocMAX = velocMAX;
        return this;
    }

    public Integer getRaioAcaoVelocEC() {
        return raioAcaoVelocEC;
    }

    public ClasseNavio setRaioAcaoVelocEC(Integer raioAcaoVelocEC) {
        this.raioAcaoVelocEC = raioAcaoVelocEC;
        return this;
    }

    public Integer getRaioAcaoVelocMM() {
        return raioAcaoVelocMM;
    }

    public ClasseNavio setRaioAcaoVelocMM(Integer raioAcaoVelocMM) {
        this.raioAcaoVelocMM = raioAcaoVelocMM;
        return this;
    }

    public Integer getRaioAcaoVelocMAX() {
        return raioAcaoVelocMAX;
    }

    public ClasseNavio setRaioAcaoVelocMAX(Integer raioAcaoVelocMAX) {
        this.raioAcaoVelocMAX = raioAcaoVelocMAX;
        return this;
    }

    public Double getConsumoVelocEC() {
        return consumoVelocEC;
    }

    public ClasseNavio setConsumoVelocEC(Double consumoVelocEC) {
        this.consumoVelocEC = consumoVelocEC;
        return this;
    }

    public Double getConsumoVelocMM() {
        return consumoVelocMM;
    }

    public ClasseNavio setConsumoVelocMM(Double consumoVelocMM) {
        this.consumoVelocMM = consumoVelocMM;
        return this;
    }

    public Double getConsumoVelocMAX() {
        return consumoVelocMAX;
    }

    public ClasseNavio setConsumoVelocMAX(Double consumoVelocMAX) {
        this.consumoVelocMAX = consumoVelocMAX;
        return this;
    }

    public Integer getIdPropulsao() {
        return idPropulsao;
    }

    public ClasseNavio setIdPropulsao(Integer idPropulsao) {
        this.idPropulsao = idPropulsao;
        return this;
    }

    public Double getCapacHangaragem() {
        return capacHangaragem;
    }

    public ClasseNavio setCapacHangaragem(Double capacHangaragem) {
        this.capacHangaragem = capacHangaragem;
        return this;
    }

    public Integer getIdPista() {
        return idPista;
    }

    public ClasseNavio setIdPista(Integer idPista) {
        this.idPista = idPista;
        return this;
    }

    public Character getJanela() {
        return janela;
    }

    public ClasseNavio setJanela(Character janela) {
        this.janela = janela;
        return this;
    }

    public Character getCme() {
        return cme;
    }

    public ClasseNavio setCme(Character cme) {
        this.cme = cme;
        return this;
    }

    public String getBandaCME() {
        return bandaCME;
    }

    public ClasseNavio setBandaCME(String bandaCME) {
        this.bandaCME = bandaCME;
        return this;
    }

    public Character getIff() {
        return iff;
    }

    public ClasseNavio setIff(Character iff) {
        this.iff = iff;
        return this;
    }

    public Character getMage() {
        return mage;
    }

    public ClasseNavio setMage(Character mage) {
        this.mage = mage;
        return this;
    }

    public String getBandaMAGE() {
        return bandaMAGE;
    }

    public ClasseNavio setBandaMAGE(String bandaMAGE) {
        this.bandaMAGE = bandaMAGE;
        return this;
    }

    public String getVhf() {
        return vhf;
    }

    public ClasseNavio setVhf(String vhf) {
        this.vhf = vhf;
        return this;
    }

    public String getUhf() {
        return uhf;
    }

    public ClasseNavio setUhf(String uhf) {
        this.uhf = uhf;
        return this;
    }

    public String getHf() {
        return hf;
    }

    public ClasseNavio setHf(String hf) {
        this.hf = hf;
        return this;
    }

    public Integer getIdPlantapropulsora() {
        return idPlantapropulsora;
    }

    public ClasseNavio setIdPlantapropulsora(Integer idPlantapropulsora) {
        this.idPlantapropulsora = idPlantapropulsora;
        return this;
    }

    public String getObservacao() {
        return observacao;
    }

    public ClasseNavio setObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    public String getSigla() {
        return sigla;
    }

    public ClasseNavio setSigla(String sigla) {
        this.sigla = sigla;
        return this;
    }

}