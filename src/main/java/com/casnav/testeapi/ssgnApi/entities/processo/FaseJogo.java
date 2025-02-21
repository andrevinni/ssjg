package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FaseJogo", schema = "Processo")
public class FaseJogo {
    @Id
    @Column(name = "Id_FaseJogo", nullable = false)
    private Integer id;

    @Column(name = "Nome", length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public FaseJogo setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public FaseJogo setNome(String nome) {
        this.nome = nome;
        return this;
    }

}