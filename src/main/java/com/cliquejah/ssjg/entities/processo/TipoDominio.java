package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tipo_Dominio", schema = "Processo")
public class TipoDominio {
    @Id
    @Column(name = "\"Id_Tipo_Domínio\"", nullable = false)
    private Long id;

    @Column(name = "Nome_Descricao", nullable = false, length = 100)
    private String nomeDescricao;

    public Long getId() {
        return id;
    }

    public TipoDominio setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNomeDescricao() {
        return nomeDescricao;
    }

    public TipoDominio setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
        return this;
    }

}