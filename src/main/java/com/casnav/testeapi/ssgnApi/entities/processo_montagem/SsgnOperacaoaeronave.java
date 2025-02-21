package com.casnav.testeapi.ssgnApi.entities.processo_montagem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "SsgnOperacaoaeronave")
@Table(name = "SSGN_OperacaoAeronave", schema = "processo_montagem")
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