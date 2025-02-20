package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "ArmasA")
@Table(name = "Armas_AS", schema = "Dominio")
public class ArmasA {
    @Id
    @Column(name = "ID_Armamento", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Armamento", nullable = false)
    private Armamento armamento;

    @Column(name = "NumeroProjetisSalva", nullable = false)
    private Integer numeroProjetisSalva;

    @Column(name = "id_AgenteLancador")
    private Integer idAgentelancador;

    @Column(name = "AlcanceMaximo")
    private Double alcanceMaximo;

    @Column(name = "Id_TipoArmas_AS")
    private Integer idTipoarmasAs;

    public Long getId() {
        return id;
    }

    public ArmasA setId(Long id) {
        this.id = id;
        return this;
    }

    public Armamento getArmamento() {
        return armamento;
    }

    public ArmasA setArmamento(Armamento armamento) {
        this.armamento = armamento;
        return this;
    }

    public Integer getNumeroProjetisSalva() {
        return numeroProjetisSalva;
    }

    public ArmasA setNumeroProjetisSalva(Integer numeroProjetisSalva) {
        this.numeroProjetisSalva = numeroProjetisSalva;
        return this;
    }

    public Integer getIdAgentelancador() {
        return idAgentelancador;
    }

    public ArmasA setIdAgentelancador(Integer idAgentelancador) {
        this.idAgentelancador = idAgentelancador;
        return this;
    }

    public Double getAlcanceMaximo() {
        return alcanceMaximo;
    }

    public ArmasA setAlcanceMaximo(Double alcanceMaximo) {
        this.alcanceMaximo = alcanceMaximo;
        return this;
    }

    public Integer getIdTipoarmasAs() {
        return idTipoarmasAs;
    }

    public ArmasA setIdTipoarmasAs(Integer idTipoarmasAs) {
        this.idTipoarmasAs = idTipoarmasAs;
        return this;
    }

}