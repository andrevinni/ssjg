package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InterceptacaoAeronave", schema = "Processo")
public class InterceptacaoAeronave {
    @Id
    @Column(name = "Id_InterceptacaoAeronave", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public InterceptacaoAeronave setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public InterceptacaoAeronave setNome(String nome) {
        this.nome = nome;
        return this;
    }

}