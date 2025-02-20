package com.casnav.testeapi.ssgnApi.modelos.Processo_Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "SsgnOperacaoaeronave")
@Table(name = "SSGN_OperacaoAeronave", schema = "Processo_Montagem")
public class SsgnOperacaoaeronave {
    @Id
    @Column(name = "Id_OperacaoAeronave", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public SsgnOperacaoaeronave setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public SsgnOperacaoaeronave setNome(String nome) {
        this.nome = nome;
        return this;
    }

}