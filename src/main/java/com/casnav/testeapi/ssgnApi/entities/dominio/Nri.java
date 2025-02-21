package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "Nri")
@Table(name = "NRI", schema = "Dominio")
public class Nri {
    @EmbeddedId
    private NriId id;

    @Column(name = "NRI", nullable = false)
    private Double nri;

    public NriId getId() {
        return id;
    }

    public Nri setId(NriId id) {
        this.id = id;
        return this;
    }

    public Double getNri() {
        return nri;
    }

    public Nri setNri(Double nri) {
        this.nri = nri;
        return this;
    }

}