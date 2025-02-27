package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class ItemInterfaceRecursoId implements java.io.Serializable {
    private static final long serialVersionUID = -8601208677334316406L;
    @Column(name = "\"id_recurso\"", nullable = false)
    private Long idRecurso;

    @Column(name = "\"id_chave_item_intf\"", length = 50)
    private String idChaveitemintf;

    public Long getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(Long idRecurso) {
        this.idRecurso = idRecurso;
    }

    public String getIdChaveitemintf() {
        return idChaveitemintf;
    }

    public void setIdChaveitemintf(String idChaveitemintf) {
        this.idChaveitemintf = idChaveitemintf;
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