package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Modulo", schema = "Processo")
public class Modulo {
    @Id
    @Column(name = "Id_Modulo", nullable = false)
    private Long id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Long getId() {
        return id;
    }

    public Modulo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Modulo setNome(String nome) {
        this.nome = nome;
        return this;
    }

}