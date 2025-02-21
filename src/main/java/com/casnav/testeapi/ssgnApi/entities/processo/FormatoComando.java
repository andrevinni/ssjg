package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FormatoComando", schema = "Processo")
public class FormatoComando {
    @Id
    @Column(name = "Id_FormatoComando", nullable = false)
    private Integer id;

    @Column(name = "Nome_Exibicao", length = 100)
    private String nomeExibicao;

    @Column(name = "Codigo", length = 15)
    private String codigo;

    public Integer getId() {
        return id;
    }

    public FormatoComando setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNomeExibicao() {
        return nomeExibicao;
    }

    public FormatoComando setNomeExibicao(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public FormatoComando setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

}