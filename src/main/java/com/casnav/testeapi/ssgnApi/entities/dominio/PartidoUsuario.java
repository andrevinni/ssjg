package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "PartidoUsuario")
@Table(schema = "Dominio")
public class PartidoUsuario {
    @EmbeddedId
    private PartidoUsuarioId id;

    @MapsId("idPartido")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Partido", nullable = false)
    private Partido idPartido;

    public PartidoUsuarioId getId() {
        return id;
    }

    public PartidoUsuario setId(PartidoUsuarioId id) {
        this.id = id;
        return this;
    }

    public Partido getIdPartido() {
        return idPartido;
    }

    public PartidoUsuario setIdPartido(Partido idPartido) {
        this.idPartido = idPartido;
        return this;
    }

}