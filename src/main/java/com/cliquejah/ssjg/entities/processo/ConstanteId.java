package com.casnav.testeapi.ssgnApi.modelos.Processo;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ConstanteId implements Serializable {
    private static final long serialVersionUID = -524082241971658532L;
    @Column(name = "Id_Constante", nullable = false)
    private Integer idConstante;

    @Column(name = "Id_Modulo", nullable = false)
    private Long idModulo;

    public Integer getIdConstante() {
        return idConstante;
    }

    public ConstanteId setIdConstante(Integer idConstante) {
        this.idConstante = idConstante;
        return this;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public ConstanteId setIdModulo(Long idModulo) {
        this.idModulo = idModulo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ConstanteId entity = (ConstanteId) o;
        return Objects.equals(this.idConstante, entity.idConstante) &&
                Objects.equals(this.idModulo, entity.idModulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConstante, idModulo);
    }

}