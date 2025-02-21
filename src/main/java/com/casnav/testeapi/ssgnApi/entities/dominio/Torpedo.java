package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "Torpedo")
@Table(schema = "Dominio")
public class Torpedo {
    @Id
    @Column(name = "ID_Armamento", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Armamento", nullable = false)
    private Armamento armamento;

    @Column(name = "Id_BuscaArmamento", nullable = false)
    private Integer idBuscaarmamento;

    @Column(name = "VelocCorrida", nullable = false)
    private Integer velocCorrida;

    @Column(name = "PAI")
    private Double pai;

    @Column(name = "PaiAS")
    private Double paiAS;

    @Column(name = "PaiASUP")
    private Double paiASUP;

    @Column(name = "ProfundidadeMax")
    private Integer profundidadeMax;

    @Column(name = "AlcanceMaximo", nullable = false)
    private Double alcanceMaximo;

    @Column(name = "Id_TipoTorpedo")
    private Integer idTipotorpedo;

    @Column(name = "AgenteLancadorAbrev", nullable = false, length = 50)
    private String agenteLancadorAbrev;

    public Long getId() {
        return id;
    }

    public Torpedo setId(Long id) {
        this.id = id;
        return this;
    }

    public Armamento getArmamento() {
        return armamento;
    }

    public Torpedo setArmamento(Armamento armamento) {
        this.armamento = armamento;
        return this;
    }

    public Integer getIdBuscaarmamento() {
        return idBuscaarmamento;
    }

    public Torpedo setIdBuscaarmamento(Integer idBuscaarmamento) {
        this.idBuscaarmamento = idBuscaarmamento;
        return this;
    }

    public Integer getVelocCorrida() {
        return velocCorrida;
    }

    public Torpedo setVelocCorrida(Integer velocCorrida) {
        this.velocCorrida = velocCorrida;
        return this;
    }

    public Double getPai() {
        return pai;
    }

    public Torpedo setPai(Double pai) {
        this.pai = pai;
        return this;
    }

    public Double getPaiAS() {
        return paiAS;
    }

    public Torpedo setPaiAS(Double paiAS) {
        this.paiAS = paiAS;
        return this;
    }

    public Double getPaiASUP() {
        return paiASUP;
    }

    public Torpedo setPaiASUP(Double paiASUP) {
        this.paiASUP = paiASUP;
        return this;
    }

    public Integer getProfundidadeMax() {
        return profundidadeMax;
    }

    public Torpedo setProfundidadeMax(Integer profundidadeMax) {
        this.profundidadeMax = profundidadeMax;
        return this;
    }

    public Double getAlcanceMaximo() {
        return alcanceMaximo;
    }

    public Torpedo setAlcanceMaximo(Double alcanceMaximo) {
        this.alcanceMaximo = alcanceMaximo;
        return this;
    }

    public Integer getIdTipotorpedo() {
        return idTipotorpedo;
    }

    public Torpedo setIdTipotorpedo(Integer idTipotorpedo) {
        this.idTipotorpedo = idTipotorpedo;
        return this;
    }

    public String getAgenteLancadorAbrev() {
        return agenteLancadorAbrev;
    }

    public Torpedo setAgenteLancadorAbrev(String agenteLancadorAbrev) {
        this.agenteLancadorAbrev = agenteLancadorAbrev;
        return this;
    }

}