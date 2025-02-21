package com.casnav.testeapi.ssgnApi.entities.processo_montagem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "ItemConfiguracao2")
@Table(schema = "processo_montagem")
public class ItemConfiguracao2 {
    @Id
    @Column(name = "Id_ItemConfiguracao", nullable = false)
    private Integer id;

    @Column(name = "Quantidade")
    private Integer quantidade;

    @Column(name = "ListaCabides")
    private byte[] listaCabides;

    @Column(name = "Id_EspecificacaoRecurso")
    private Long idEspecificacaorecurso;

    @Column(name = "Id_Configuracao", nullable = false)
    private Integer idConfiguracao;

    public Integer getId() {
        return id;
    }

    public ItemConfiguracao2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public ItemConfiguracao2 setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public byte[] getListaCabides() {
        return listaCabides;
    }

    public ItemConfiguracao2 setListaCabides(byte[] listaCabides) {
        this.listaCabides = listaCabides;
        return this;
    }

    public Long getIdEspecificacaorecurso() {
        return idEspecificacaorecurso;
    }

    public ItemConfiguracao2 setIdEspecificacaorecurso(Long idEspecificacaorecurso) {
        this.idEspecificacaorecurso = idEspecificacaorecurso;
        return this;
    }

    public Integer getIdConfiguracao() {
        return idConfiguracao;
    }

    public ItemConfiguracao2 setIdConfiguracao(Integer idConfiguracao) {
        this.idConfiguracao = idConfiguracao;
        return this;
    }

}