package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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