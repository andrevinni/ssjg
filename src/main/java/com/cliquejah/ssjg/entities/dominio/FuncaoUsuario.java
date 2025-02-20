package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "FuncaoUsuario")
@Table(schema = "Dominio")
public class FuncaoUsuario {
    @EmbeddedId
    private FuncaoUsuarioId id;

    public FuncaoUsuarioId getId() {
        return id;
    }

    public FuncaoUsuario setId(FuncaoUsuarioId id) {
        this.id = id;
        return this;
    }

    //TODO [Reverse Engineering] generate columns from DB
}