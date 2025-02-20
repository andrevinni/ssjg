package com.casnav.testeapi.ssgnApi.modelos.Processo_Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "ItemConfiguracao")
@Table(schema = "Processo_Montagem")
public class ItemConfiguracao {
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

    public ItemConfiguracao setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public ItemConfiguracao setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public byte[] getListaCabides() {
        return listaCabides;
    }

    public ItemConfiguracao setListaCabides(byte[] listaCabides) {
        this.listaCabides = listaCabides;
        return this;
    }

    public Long getIdEspecificacaorecurso() {
        return idEspecificacaorecurso;
    }

    public ItemConfiguracao setIdEspecificacaorecurso(Long idEspecificacaorecurso) {
        this.idEspecificacaorecurso = idEspecificacaorecurso;
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