package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "ElementosAcaoComando")
@Table(schema = "Dominio")
public class ElementosAcaoComando {
    @EmbeddedId
    private ElementosAcaoComandoId id;

    @MapsId("idElemento")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Elemento", nullable = false)
    private Elemento idElemento;

    public ElementosAcaoComandoId getId() {
        return id;
    }

    public ElementosAcaoComando setId(ElementosAcaoComandoId id) {
        this.id = id;
        return this;
    }

    public Elemento getIdElemento() {
        return idElemento;
    }

    public ElementosAcaoComando setIdElemento(Elemento idElemento) {
        this.idElemento = idElemento;
        return this;
    }

}