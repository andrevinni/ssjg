package com.casnav.testeapi.ssgnApi.entities.dominio;

import org.hibernate.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PartidoUsuarioId implements Serializable {
    private static final long serialVersionUID = -5933241666754663298L;
    @Column(name = "Id_Partido", nullable = false)
    private Integer idPartido;

    @Column(name = "Id_Usuario", nullable = false)
    private Integer idUsuario;

    public Integer getIdPartido() {
        return idPartido;
    }

    public PartidoUsuarioId setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
        return this;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public PartidoUsuarioId setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PartidoUsuarioId entity = (PartidoUsuarioId) o;
        return Objects.equals(this.idUsuario, entity.idUsuario) &&
                Objects.equals(this.idPartido, entity.idPartido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idPartido);
    }

}