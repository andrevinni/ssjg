package com.casnav.testeapi.ssgnApi.entities.montagem;

import org.hibernate.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TransporteAeronaveId implements Serializable {
    private static final long serialVersionUID = -8705577438690426405L;
    @Column(name = "Id_ClasseNavio", nullable = false)
    private Long idClassenavio;

    @Column(name = "Id_TipoAeronave", nullable = false)
    private Long idTipoaeronave;

    public Long getIdClassenavio() {
        return idClassenavio;
    }

    public TransporteAeronaveId setIdClassenavio(Long idClassenavio) {
        this.idClassenavio = idClassenavio;
        return this;
    }

    public Long getIdTipoaeronave() {
        return idTipoaeronave;
    }

    public TransporteAeronaveId setIdTipoaeronave(Long idTipoaeronave) {
        this.idTipoaeronave = idTipoaeronave;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TransporteAeronaveId entity = (TransporteAeronaveId) o;
        return Objects.equals(this.idClassenavio, entity.idClassenavio) &&
                Objects.equals(this.idTipoaeronave, entity.idTipoaeronave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClassenavio, idTipoaeronave);
    }

}