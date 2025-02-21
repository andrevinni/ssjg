package com.casnav.testeapi.ssgnApi.entities.montagem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "TipoPlatSuperficie2")
@Table(schema = "Montagem_Jogos")
public class TipoPlatSuperficie {
    @Id
    @Column(name = "Id_TipoPlatSuperficie", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public TipoPlatSuperficie setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoPlatSuperficie setNome(String nome) {
        this.nome = nome;
        return this;
    }

}