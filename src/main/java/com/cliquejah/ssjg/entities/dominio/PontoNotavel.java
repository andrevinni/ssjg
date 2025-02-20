package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name = "PontoNotavel")
@Table(schema = "Dominio")
public class PontoNotavel extends Elemento {
    @Column(name = "Id_Finalidade")
    private Long idFinalidade;

    @OneToOne(mappedBy = "pontoNotavel")
    private Elemento elemento;

    public Long getIdFinalidade() {
        return idFinalidade;
    }

    public PontoNotavel setIdFinalidade(Long idFinalidade) {
        this.idFinalidade = idFinalidade;
        return this;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public PontoNotavel setElemento(Elemento elemento) {
        this.elemento = elemento;
        return this;
    }

}