package com.casnav.testeapi.ssgnApi.modelos.Processo;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ItemInterfaceRecursoId implements Serializable {
    private static final long serialVersionUID = -8224815668090470701L;
    @Column(name = "Id_Recurso", nullable = false)
    private Long idRecurso;

    @Column(name = "Id_ChaveItemIntf", nullable = false, length = 50)
    private String idChaveitemintf;

    public Long getIdRecurso() {
        return idRecurso;
    }

    public ItemInterfaceRecursoId setIdRecurso(Long idRecurso) {
        this.idRecurso = idRecurso;
        return this;
    }

    public String getIdChaveitemintf() {
        return idChaveitemintf;
    }

    public ItemInterfaceRecursoId setIdChaveitemintf(String idChaveitemintf) {
        this.idChaveitemintf = idChaveitemintf;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ItemInterfaceRecursoId entity = (ItemInterfaceRecursoId) o;
        return Objects.equals(this.idRecurso, entity.idRecurso) &&
                Objects.equals(this.idChaveitemintf, entity.idChaveitemintf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRecurso, idChaveitemintf);
    }

}