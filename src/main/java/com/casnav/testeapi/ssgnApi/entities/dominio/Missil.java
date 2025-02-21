package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "Missil")
@Table(schema = "Dominio")
public class Missil {
    @Id
    @Column(name = "ID_Armamento", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Armamento", nullable = false)
    private Armamento armamento;

    @Column(name = "Trigrama", length = 10)
    private String trigrama;

    @Column(name = "Veloc")
    private Double veloc;

    @Column(name = "PAM")
    private Double pam;

    @Column(name = "PAI")
    private Double pai;

    @Column(name = "id_AgenteLancador")
    private Integer idAgentelancador;

    @Column(name = "PAA")
    private Double paa;

    @Column(name = "AlcanceEficaz")
    private Double alcanceEficaz;

    @Column(name = "Id_TipoMissil")
    private Integer idTipomissil;

    @Column(name = "NomeGuiagemAbrev", nullable = false, length = 50)
    private String nomeGuiagemAbrev;

    public Long getId() {
        return id;
    }

    public Missil setId(Long id) {
        this.id = id;
        return this;
    }

    public Armamento getArmamento() {
        return armamento;
    }

    public Missil setArmamento(Armamento armamento) {
        this.armamento = armamento;
        return this;
    }

    public String getTrigrama() {
        return trigrama;
    }

    public Missil setTrigrama(String trigrama) {
        this.trigrama = trigrama;
        return this;
    }

    public Double getVeloc() {
        return veloc;
    }

    public Missil setVeloc(Double veloc) {
        this.veloc = veloc;
        return this;
    }

    public Double getPam() {
        return pam;
    }

    public Missil setPam(Double pam) {
        this.pam = pam;
        return this;
    }

    public Double getPai() {
        return pai;
    }

    public Missil setPai(Double pai) {
        this.pai = pai;
        return this;
    }

    public Integer getIdAgentelancador() {
        return idAgentelancador;
    }

    public Missil setIdAgentelancador(Integer idAgentelancador) {
        this.idAgentelancador = idAgentelancador;
        return this;
    }

    public Double getPaa() {
        return paa;
    }

    public Missil setPaa(Double paa) {
        this.paa = paa;
        return this;
    }

    public Double getAlcanceEficaz() {
        return alcanceEficaz;
    }

    public Missil setAlcanceEficaz(Double alcanceEficaz) {
        this.alcanceEficaz = alcanceEficaz;
        return this;
    }

    public Integer getIdTipomissil() {
        return idTipomissil;
    }

    public Missil setIdTipomissil(Integer idTipomissil) {
        this.idTipomissil = idTipomissil;
        return this;
    }

    public String getNomeGuiagemAbrev() {
        return nomeGuiagemAbrev;
    }

    public Missil setNomeGuiagemAbrev(String nomeGuiagemAbrev) {
        this.nomeGuiagemAbrev = nomeGuiagemAbrev;
        return this;
    }

}