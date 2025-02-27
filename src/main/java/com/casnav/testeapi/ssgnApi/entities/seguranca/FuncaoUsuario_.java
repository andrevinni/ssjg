package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"funcaousuario\"", schema = "seguranca")
public class FuncaoUsuario_ {
    @EmbeddedId
    private FuncaoUsuarioId id;

    public FuncaoUsuarioId getId() {
        return id;
    }

    public void setId(FuncaoUsuarioId id) {
        this.id = id;
    }

}