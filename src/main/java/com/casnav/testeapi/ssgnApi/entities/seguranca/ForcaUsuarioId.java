package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class ForcaUsuarioId implements java.io.Serializable {
    private static final long serialVersionUID = 8351104996048656379L;
    @Column(name = "\"id_usuario\"", nullable = false)
    private Integer idUsuario;

    @Column(name = "\"id_forca\"", nullable = false)
    private Integer idForca;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdForca() {
        return idForca;
    }

    public void setIdForca(Integer idForca) {
        this.idForca = idForca;
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