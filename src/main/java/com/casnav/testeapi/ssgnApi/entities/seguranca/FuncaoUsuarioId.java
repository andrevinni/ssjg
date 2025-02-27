package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class FuncaoUsuarioId implements java.io.Serializable {
    private static final long serialVersionUID = 2152283746184759381L;
    @Column(name = "\"id_funcao\"", nullable = false)
    private Integer idFuncao;

    @Column(name = "\"id_usuario\"", nullable = false)
    private Integer idUsuario;

    public Integer getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(Integer idFuncao) {
        this.idFuncao = idFuncao;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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