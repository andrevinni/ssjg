package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"iteminterfacerecurso\"", schema = "seguranca")
public class ItemInterfaceRecurso_ {
    @EmbeddedId
    private ItemInterfaceRecursoId id;

    @Column(name = "\"id_tipo_chave_item\"")
    private Integer idTipochaveitem;

    @Column(name = "\"nome\"", length = 50)
    private String nome;

    @Column(name = "\"id_chave_pai\"", length = 50)
    private String idChavepai;

    @Column(name = "\"nivel\"", nullable = false)
    private Integer nivel;

    public ItemInterfaceRecursoId getId() {
        return id;
    }

    public void setId(ItemInterfaceRecursoId id) {
        this.id = id;
    }

    public Integer getIdTipochaveitem() {
        return idTipochaveitem;
    }

    public void setIdTipochaveitem(Integer idTipochaveitem) {
        this.idTipochaveitem = idTipochaveitem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdChavepai() {
        return idChavepai;
    }

    public void setIdChavepai(String idChavepai) {
        this.idChavepai = idChavepai;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

}