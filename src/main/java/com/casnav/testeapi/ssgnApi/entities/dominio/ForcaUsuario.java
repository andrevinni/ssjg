package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "ForcaUsuario")
@Table(schema = "Dominio")
public class ForcaUsuario {
    @EmbeddedId
    private ForcaUsuarioId id;

    @MapsId("idForca")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Forca", nullable = false)
    private Forca idForca;

    public ForcaUsuarioId getId() {
        return id;
    }

    public ForcaUsuario setId(ForcaUsuarioId id) {
        this.id = id;
        return this;
    }

    public Forca getIdForca() {
        return idForca;
    }

    public ForcaUsuario setIdForca(Forca idForca) {
        this.idForca = idForca;
        return this;
    }

}