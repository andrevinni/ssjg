package com.cliquejah.ssjg.entities.dominio;

import org.hibernate.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FuncaoUsuarioId implements Serializable {
    private static final long serialVersionUID = -4500039210006280913L;
    @Column(name = "Id_Funcao", nullable = false)
    private Integer idFuncao;

    @Column(name = "Id_Usuario", nullable = false)
    private Integer idUsuario;

    public Integer getIdFuncao() {
        return idFuncao;
    }

    public FuncaoUsuarioId setIdFuncao(Integer idFuncao) {
        this.idFuncao = idFuncao;
        return this;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public FuncaoUsuarioId setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FuncaoUsuarioId entity = (FuncaoUsuarioId) o;
        return Objects.equals(this.idUsuario, entity.idUsuario) &&
                Objects.equals(this.idFuncao, entity.idFuncao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idFuncao);
    }

}