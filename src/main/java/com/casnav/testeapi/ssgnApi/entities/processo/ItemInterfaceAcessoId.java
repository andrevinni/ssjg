package com.casnav.testeapi.ssgnApi.entities.processo;

import org.hibernate.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ItemInterfaceAcessoId implements Serializable {
    private static final long serialVersionUID = -5432493927187135497L;
    @Column(name = "Id_Funcao", nullable = false)
    private Integer idFuncao;

    @Column(name = "Id_Recurso", nullable = false)
    private Long idRecurso;

    @Column(name = "Id_Fase", nullable = false)
    private Integer idFase;

    @Column(name = "Id_ChaveItemIntf", nullable = false, length = 50)
    private String idChaveitemintf;

    public Integer getIdFuncao() {
        return idFuncao;
    }

    public ItemInterfaceAcessoId setIdFuncao(Integer idFuncao) {
        this.idFuncao = idFuncao;
        return this;
    }

    public Long getIdRecurso() {
        return idRecurso;
    }

    public ItemInterfaceAcessoId setIdRecurso(Long idRecurso) {
        this.idRecurso = idRecurso;
        return this;
    }

    public Integer getIdFase() {
        return idFase;
    }

    public ItemInterfaceAcessoId setIdFase(Integer idFase) {
        this.idFase = idFase;
        return this;
    }

    public String getIdChaveitemintf() {
        return idChaveitemintf;
    }

    public ItemInterfaceAcessoId setIdChaveitemintf(String idChaveitemintf) {
        this.idChaveitemintf = idChaveitemintf;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ItemInterfaceAcessoId entity = (ItemInterfaceAcessoId) o;
        return Objects.equals(this.idRecurso, entity.idRecurso) &&
                Objects.equals(this.idFase, entity.idFase) &&
                Objects.equals(this.idChaveitemintf, entity.idChaveitemintf) &&
                Objects.equals(this.idFuncao, entity.idFuncao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRecurso, idFase, idChaveitemintf, idFuncao);
    }

}