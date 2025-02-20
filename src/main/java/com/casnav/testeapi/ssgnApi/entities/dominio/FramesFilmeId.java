package com.cliquejah.ssjg.entities.dominio;

import org.hibernate.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FramesFilmeId implements Serializable {
    private static final long serialVersionUID = 6964650496000424973L;
    @Column(name = "id_frame", nullable = false)
    private Long idFrame;

    @Column(name = "id_dominio", nullable = false)
    private Long idDominio;

    public Long getIdFrame() {
        return idFrame;
    }

    public FramesFilmeId setIdFrame(Long idFrame) {
        this.idFrame = idFrame;
        return this;
    }

    public Long getIdDominio() {
        return idDominio;
    }

    public FramesFilmeId setIdDominio(Long idDominio) {
        this.idDominio = idDominio;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FramesFilmeId entity = (FramesFilmeId) o;
        return Objects.equals(this.idFrame, entity.idFrame) &&
                Objects.equals(this.idDominio, entity.idDominio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFrame, idDominio);
    }

}