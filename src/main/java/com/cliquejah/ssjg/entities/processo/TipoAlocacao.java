package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tipo_Alocacao", schema = "Processo")
public class TipoAlocacao {
    @Id
    @Column(name = "Id_Tipo_Alocacao", nullable = false)
    private Long id;

    @Column(name = "NomeDescricao", length = 100)
    private String nomeDescricao;

    @Column(name = "Codigo", length = 20)
    private String codigo;

    public Long getId() {
        return id;
    }

    public TipoAlocacao setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNomeDescricao() {
        return nomeDescricao;
    }

    public TipoAlocacao setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public TipoAlocacao setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

}