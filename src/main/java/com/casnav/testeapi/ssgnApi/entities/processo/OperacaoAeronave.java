package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OperacaoAeronave", schema = "Processo")
public class OperacaoAeronave {
    @Id
    @Column(name = "Id_OperacaoAeronave", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public OperacaoAeronave setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public OperacaoAeronave setNome(String nome) {
        this.nome = nome;
        return this;
    }

}