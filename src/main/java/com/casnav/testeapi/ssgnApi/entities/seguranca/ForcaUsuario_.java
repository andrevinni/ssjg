package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"forcausuario\"", schema = "seguranca")
public class ForcaUsuario_ {
    @EmbeddedId
    private ForcaUsuarioId id;

    public ForcaUsuarioId getId() {
        return id;
    }

    public void setId(ForcaUsuarioId id) {
        this.id = id;
    }

}