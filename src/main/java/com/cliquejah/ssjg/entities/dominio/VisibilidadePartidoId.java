package com.cliquejah.ssjg.entities.dominio;

import org.hibernate.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class VisibilidadePartidoId implements Serializable {
    private static final long serialVersionUID = 2803555075751286603L;
    @Column(name = "Id_Partido", nullable = false)
    private Integer idPartido;

    @Column(name = "Id_Partido_Visivel", nullable = false)
    private Integer idPartidoVisivel;

    public Integer getIdPartido() {
        return idPartido;
    }

    public VisibilidadePartidoId setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
        return this;
    }

    public Integer getIdPartidoVisivel() {
        return idPartidoVisivel;
    }

    public VisibilidadePartidoId setIdPartidoVisivel(Integer idPartidoVisivel) {
        this.idPartidoVisivel = idPartidoVisivel;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        VisibilidadePartidoId entity = (VisibilidadePartidoId) o;
        return Objects.equals(this.idPartido, entity.idPartido) &&
                Objects.equals(this.idPartidoVisivel, entity.idPartidoVisivel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPartido, idPartidoVisivel);
    }

}