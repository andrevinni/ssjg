package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SituacaoComando", schema = "Processo")
public class SituacaoComando {
    @Id
    @Column(name = "Id_SituacaoComando", nullable = false)
    private Integer id;

    @Column(name = "NomeDescricao", length = 50)
    private String nomeDescricao;

    @Column(name = "Codigo", length = 4)
    private String codigo;

    public Integer getId() {
        return id;
    }

    public SituacaoComando setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNomeDescricao() {
        return nomeDescricao;
    }

    public SituacaoComando setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public SituacaoComando setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

}