package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class VisibilidadePartidoId implements java.io.Serializable {
    private static final long serialVersionUID = -7053869178122545925L;
    @Column(name = "\"id_partido\"", nullable = false)
    private Integer idPartido;

    @Column(name = "\"id_partido_visivel\"", nullable = false)
    private Integer idPartidoVisivel;

    public Integer getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }

    public Integer getIdPartidoVisivel() {
        return idPartidoVisivel;
    }

    public void setIdPartidoVisivel(Integer idPartidoVisivel) {
        this.idPartidoVisivel = idPartidoVisivel;
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