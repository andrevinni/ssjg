package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "ItemConfiguracao")
@Table(schema = "Dominio")
public class ItemConfiguracao {
    @Id
    @Column(name = "Id_ItemConfiguracao", nullable = false)
    private Integer id;

    @Column(name = "Id_EspecificacaoRecurso")
    private Long idEspecificacaorecurso;

    @Column(name = "ListaCabides", length = 50)
    private String listaCabides;

    @Column(name = "Quantidade")
    private Integer quantidade;

    @Column(name = "Id_Configuracao", nullable = false)
    private Integer idConfiguracao;

    public Integer getId() {
        return id;
    }

    public ItemConfiguracao setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getIdEspecificacaorecurso() {
        return idEspecificacaorecurso;
    }

    public ItemConfiguracao setIdEspecificacaorecurso(Long idEspecificacaorecurso) {
        this.idEspecificacaorecurso = idEspecificacaorecurso;
        return this;
    }

    public String getListaCabides() {
        return listaCabides;
    }

    public ItemConfiguracao setListaCabides(String listaCabides) {
        this.listaCabides = listaCabides;
        return this;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public ItemConfiguracao setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public Integer getIdConfiguracao() {
        return idConfiguracao;
    }

    public ItemConfiguracao setIdConfiguracao(Integer idConfiguracao) {
        this.idConfiguracao = idConfiguracao;
        return this;
    }

}