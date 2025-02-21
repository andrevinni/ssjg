package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "Bomba")
@Table(schema = "Dominio")
public class Bomba {
    @Id
    @Column(name = "ID_Armamento", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Armamento", nullable = false)
    private Armamento armamento;

    @Column(name = "Id_TipoBomba")
    private Integer idTipobomba;

    @Column(name = "Id_AgenteLancador", nullable = false)
    private Integer idAgentelancador;

    @Column(name = "PAI", nullable = false)
    private Double pai;

    @Column(name = "Trigrama", length = 3)
    private String trigrama;

    @Column(name = "Id_GuiagemBomba")
    private Integer idGuiagembomba;

    @Column(name = "AlcanceEficaz")
    private Double alcanceEficaz;

    public Long getId() {
        return id;
    }

    public Bomba setId(Long id) {
        this.id = id;
        return this;
    }

    public Armamento getArmamento() {
        return armamento;
    }

    public Bomba setArmamento(Armamento armamento) {
        this.armamento = armamento;
        return this;
    }

    public Integer getIdTipobomba() {
        return idTipobomba;
    }

    public Bomba setIdTipobomba(Integer idTipobomba) {
        this.idTipobomba = idTipobomba;
        return this;
    }

    public Integer getIdAgentelancador() {
        return idAgentelancador;
    }

    public Bomba setIdAgentelancador(Integer idAgentelancador) {
        this.idAgentelancador = idAgentelancador;
        return this;
    }

    public Double getPai() {
        return pai;
    }

    public Bomba setPai(Double pai) {
        this.pai = pai;
        return this;
    }

    public String getTrigrama() {
        return trigrama;
    }

    public Bomba setTrigrama(String trigrama) {
        this.trigrama = trigrama;
        return this;
    }

    public Integer getIdGuiagembomba() {
        return idGuiagembomba;
    }

    public Bomba setIdGuiagembomba(Integer idGuiagembomba) {
        this.idGuiagembomba = idGuiagembomba;
        return this;
    }

    public Double getAlcanceEficaz() {
        return alcanceEficaz;
    }

    public Bomba setAlcanceEficaz(Double alcanceEficaz) {
        this.alcanceEficaz = alcanceEficaz;
        return this;
    }

}