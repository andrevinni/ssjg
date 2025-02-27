package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class PartidoUsuarioId implements java.io.Serializable {
    private static final long serialVersionUID = 3089932993359116728L;
    @Column(name = "\"id_partido\"", nullable = false)
    private Integer idPartido;

    @Column(name = "\"id_usuario\"", nullable = false)
    private Integer idUsuario;

    public Integer getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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