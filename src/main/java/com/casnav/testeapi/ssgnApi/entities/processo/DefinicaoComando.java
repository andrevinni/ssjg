package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.*;

@Entity
@Table(name = "DefinicaoComando", schema = "Processo")
public class DefinicaoComando {
    @Id
    @Column(name = "Id_DefinicaoComando", nullable = false)
    private Integer id;

    @Column(name = "NomeComando", length = 50)
    private String nomeComando;

    @Column(name = "Sigla", length = 15)
    private String sigla;

    @Lob
    @Column(name = "SchemaDefinicao")
    private String schemaDefinicao;

    @Column(name = "Id_Categoria")
    private Integer idCategoria;

    @Column(name = "Id_FormatoComando")
    private Integer idFormatocomando;

    public Integer getId() {
        return id;
    }

    public DefinicaoComando setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNomeComando() {
        return nomeComando;
    }

    public DefinicaoComando setNomeComando(String nomeComando) {
        this.nomeComando = nomeComando;
        return this;
    }

    public String getSigla() {
        return sigla;
    }

    public DefinicaoComando setSigla(String sigla) {
        this.sigla = sigla;
        return this;
    }

    public String getSchemaDefinicao() {
        return schemaDefinicao;
    }

    public DefinicaoComando setSchemaDefinicao(String schemaDefinicao) {
        this.schemaDefinicao = schemaDefinicao;
        return this;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public DefinicaoComando setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
        return this;
    }

    public Integer getIdFormatocomando() {
        return idFormatocomando;
    }

    public DefinicaoComando setIdFormatocomando(Integer idFormatocomando) {
        this.idFormatocomando = idFormatocomando;
        return this;
    }

}