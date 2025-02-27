package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"visibilidadepartido\"", schema = "seguranca")
public class VisibilidadePartido_ {
    @EmbeddedId
    private VisibilidadePartidoId id;

    public VisibilidadePartidoId getId() {
        return id;
    }

    public void setId(VisibilidadePartidoId id) {
        this.id = id;
    }

}