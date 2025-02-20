package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "Canhao")
@Table(schema = "Dominio")
public class Canhao {
    @Id
    @Column(name = "ID_Armamento", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Armamento", nullable = false)
    private Armamento armamento;

    @Column(name = "CalibreTuboAlma", nullable = false, length = 50)
    private String calibreTuboAlma;

    @Column(name = "CadenciaMantidaTiro", nullable = false)
    private Integer cadenciaMantidaTiro;

    @Column(name = "CadenciaRapidaTiro", nullable = false)
    private Integer cadenciaRapidaTiro;

    @Column(name = "NumTuboAlma", nullable = false, length = 50)
    private String numTuboAlma;

    @Column(name = "AlcanceMaximo")
    private Double alcanceMaximo;

    @Column(name = "AlcanceEficaz")
    private Double alcanceEficaz;

    public Long getId() {
        return id;
    }

    public Canhao setId(Long id) {
        this.id = id;
        return this;
    }

    public Armamento getArmamento() {
        return armamento;
    }

    public Canhao setArmamento(Armamento armamento) {
        this.armamento = armamento;
        return this;
    }

    public String getCalibreTuboAlma() {
        return calibreTuboAlma;
    }

    public Canhao setCalibreTuboAlma(String calibreTuboAlma) {
        this.calibreTuboAlma = calibreTuboAlma;
        return this;
    }

    public Integer getCadenciaMantidaTiro() {
        return cadenciaMantidaTiro;
    }

    public Canhao setCadenciaMantidaTiro(Integer cadenciaMantidaTiro) {
        this.cadenciaMantidaTiro = cadenciaMantidaTiro;
        return this;
    }

    public Integer getCadenciaRapidaTiro() {
        return cadenciaRapidaTiro;
    }

    public Canhao setCadenciaRapidaTiro(Integer cadenciaRapidaTiro) {
        this.cadenciaRapidaTiro = cadenciaRapidaTiro;
        return this;
    }

    public String getNumTuboAlma() {
        return numTuboAlma;
    }

    public Canhao setNumTuboAlma(String numTuboAlma) {
        this.numTuboAlma = numTuboAlma;
        return this;
    }

    public Double getAlcanceMaximo() {
        return alcanceMaximo;
    }

    public Canhao setAlcanceMaximo(Double alcanceMaximo) {
        this.alcanceMaximo = alcanceMaximo;
        return this;
    }

    public Double getAlcanceEficaz() {
        return alcanceEficaz;
    }

    public Canhao setAlcanceEficaz(Double alcanceEficaz) {
        this.alcanceEficaz = alcanceEficaz;
        return this;
    }

}