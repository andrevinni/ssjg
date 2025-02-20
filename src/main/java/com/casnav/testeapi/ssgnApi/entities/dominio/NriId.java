package com.cliquejah.ssjg.entities.dominio;

import org.hibernate.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class NriId implements Serializable {
    private static final long serialVersionUID = 4586348914378619900L;
    @Column(name = "Id_ClasseSubmarino", nullable = false)
    private Integer idClassesubmarino;

    @Column(name = "VelocAvanco", nullable = false)
    private Integer velocAvanco;

    public Integer getIdClassesubmarino() {
        return idClassesubmarino;
    }

    public NriId setIdClassesubmarino(Integer idClassesubmarino) {
        this.idClassesubmarino = idClassesubmarino;
        return this;
    }

    public Integer getVelocAvanco() {
        return velocAvanco;
    }

    public NriId setVelocAvanco(Integer velocAvanco) {
        this.velocAvanco = velocAvanco;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        NriId entity = (NriId) o;
        return Objects.equals(this.idClassesubmarino, entity.idClassesubmarino) &&
                Objects.equals(this.velocAvanco, entity.velocAvanco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClassesubmarino, velocAvanco);
    }

}