package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.*;

@Entity
@Table(name = "\"tipochaveitem\"", schema = "seguranca")
public class TipoChaveItem_ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"id_tipo_chave_item\"", nullable = false)
    private Integer idTipochaveitem;

    @Column(name = "\"descricao\"", length = 50)
    private String descricao;

    public Integer getIdTipochaveitem() {
        return idTipochaveitem;
    }

    public void setIdTipochaveitem(Integer idTipochaveitem) {
        this.idTipochaveitem = idTipochaveitem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}