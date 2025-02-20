package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CategoriaDefinicao", schema = "Processo")
public class CategoriaDefinicao {
    @Id
    @Column(name = "Id_Categoria", nullable = false)
    private Integer id;

    @Column(name = "NomeDescricao", length = 50)
    private String nomeDescricao;

    public Integer getId() {
        return id;
    }

    public CategoriaDefinicao setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNomeDescricao() {
        return nomeDescricao;
    }

    public CategoriaDefinicao setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
        return this;
    }

}