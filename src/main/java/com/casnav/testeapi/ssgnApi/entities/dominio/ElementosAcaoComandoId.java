package com.cliquejah.ssjg.entities.dominio;

import org.hibernate.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ElementosAcaoComandoId implements Serializable {
    private static final long serialVersionUID = 5133559330865530141L;
    @Column(name = "Id_Elemento", nullable = false)
    private Long idElemento;

    @Column(name = "Id_AcaoComando", nullable = false)
    private Long idAcaocomando;

    public Long getIdElemento() {
        return idElemento;
    }

    public ElementosAcaoComandoId setIdElemento(Long idElemento) {
        this.idElemento = idElemento;
        return this;
    }

    public Long getIdAcaocomando() {
        return idAcaocomando;
    }

    public ElementosAcaoComandoId setIdAcaocomando(Long idAcaocomando) {
        this.idAcaocomando = idAcaocomando;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ElementosAcaoComandoId entity = (ElementosAcaoComandoId) o;
        return Objects.equals(this.idAcaocomando, entity.idAcaocomando) &&
                Objects.equals(this.idElemento, entity.idElemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAcaocomando, idElemento);
    }

}