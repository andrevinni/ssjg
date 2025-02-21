package com.casnav.testeapi.ssgnApi.entities.processo_montagem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Pavimento")
@Table(schema = "processo_montagem")
public class Pavimento {
    @Id
    @Column(name = "Id_Pavimento", nullable = false)
    private Integer id;

    @Column(name = "Nome", length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public Pavimento setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pavimento setNome(String nome) {
        this.nome = nome;
        return this;
    }

}