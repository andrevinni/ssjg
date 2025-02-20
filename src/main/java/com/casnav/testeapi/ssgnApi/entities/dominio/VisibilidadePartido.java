package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "VisibilidadePartido")
@Table(schema = "Dominio")
public class VisibilidadePartido {
    @EmbeddedId
    private VisibilidadePartidoId id;

    @MapsId("idPartido")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Partido", nullable = false)
    private Partido idPartido;

    @MapsId("idPartidoVisivel")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Partido_Visivel", nullable = false)
    private Partido idPartidoVisivel;

    public VisibilidadePartidoId getId() {
        return id;
    }

    public VisibilidadePartido setId(VisibilidadePartidoId id) {
        this.id = id;
        return this;
    }

    public Partido getIdPartido() {
        return idPartido;
    }

    public VisibilidadePartido setIdPartido(Partido idPartido) {
        this.idPartido = idPartido;
        return this;
    }

    public Partido getIdPartidoVisivel() {
        return idPartidoVisivel;
    }

    public VisibilidadePartido setIdPartidoVisivel(Partido idPartidoVisivel) {
        this.idPartidoVisivel = idPartidoVisivel;
        return this;
    }

}