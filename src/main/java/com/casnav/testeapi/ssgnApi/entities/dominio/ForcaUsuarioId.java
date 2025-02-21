package com.casnav.testeapi.ssgnApi.entities.dominio;

import org.hibernate.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ForcaUsuarioId implements Serializable {
    private static final long serialVersionUID = -7257841372366849796L;
    @Column(name = "Id_Usuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "Id_Forca", nullable = false)
    private Integer idForca;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public ForcaUsuarioId setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public Integer getIdForca() {
        return idForca;
    }

    public ForcaUsuarioId setIdForca(Integer idForca) {
        this.idForca = idForca;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ForcaUsuarioId entity = (ForcaUsuarioId) o;
        return Objects.equals(this.idUsuario, entity.idUsuario) &&
                Objects.equals(this.idForca, entity.idForca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idForca);
    }

}