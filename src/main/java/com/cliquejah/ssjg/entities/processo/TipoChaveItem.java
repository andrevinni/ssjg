package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoChaveItem", schema = "Processo")
public class TipoChaveItem {
    @Id
    @Column(name = "Id_TipoChaveItem", nullable = false)
    private Integer id;

    @Column(name = "Descricao", nullable = false, length = 50)
    private String descricao;

    public Integer getId() {
        return id;
    }

    public TipoChaveItem setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoChaveItem setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

}