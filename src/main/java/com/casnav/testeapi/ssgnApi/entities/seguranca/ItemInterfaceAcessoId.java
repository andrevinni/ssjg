package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class ItemInterfaceAcessoId implements java.io.Serializable {
    private static final long serialVersionUID = 7842007813503886154L;
    @Column(name = "\"id_funcao\"", nullable = false)
    private Integer idFuncao;

    @Column(name = "\"id_recurso\"", nullable = false)
    private Long idRecurso;

    @Column(name = "\"id_fase\"", nullable = false)
    private Integer idFase;

    @Column(name = "\"id_chave_item_intf\"", length = 50)
    private String idChaveitemintf;

    public Integer getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(Integer idFuncao) {
        this.idFuncao = idFuncao;
    }

    public Long getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(Long idRecurso) {
        this.idRecurso = idRecurso;
    }

    public Integer getIdFase() {
        return idFase;
    }

    public void setIdFase(Integer idFase) {
        this.idFase = idFase;
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