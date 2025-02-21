package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "Foguete")
@Table(schema = "Dominio")
public class Foguete {
    @Id
    @Column(name = "ID_Armamento", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Armamento", nullable = false)
    private Armamento armamento;

    @Column(name = "PAI", nullable = false)
    private Double pai;

    @Column(name = "id_AgenteLancador", nullable = false)
    private Integer idAgentelancador;

    @Column(name = "Trigrama", nullable = false, length = 3)
    private String trigrama;

    @Column(name = "AlcanceEficaz")
    private Double alcanceEficaz;

    public Long getId() {
        return id;
    }

    public Foguete setId(Long id) {
        this.id = id;
        return this;
    }

    public Armamento getArmamento() {
        return armamento;
    }

    public Foguete setArmamento(Armamento armamento) {
        this.armamento = armamento;
        return this;
    }

    public Double getPai() {
        return pai;
    }

    public Foguete setPai(Double pai) {
        this.pai = pai;
        return this;
    }

    public Integer getIdAgentelancador() {
        return idAgentelancador;
    }

    public Foguete setIdAgentelancador(Integer idAgentelancador) {
        this.idAgentelancador = idAgentelancador;
        return this;
    }

    public String getTrigrama() {
        return trigrama;
    }

    public Foguete setTrigrama(String trigrama) {
        this.trigrama = trigrama;
        return this;
    }

    public Double getAlcanceEficaz() {
        return alcanceEficaz;
    }

    public Foguete setAlcanceEficaz(Double alcanceEficaz) {
        this.alcanceEficaz = alcanceEficaz;
        return this;
    }

}