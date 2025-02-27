package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"partidousuario\"", schema = "seguranca")
public class PartidoUsuario_ {
    @EmbeddedId
    private PartidoUsuarioId id;

    public PartidoUsuarioId getId() {
        return id;
    }

    public void setId(PartidoUsuarioId id) {
        this.id = id;
    }

}