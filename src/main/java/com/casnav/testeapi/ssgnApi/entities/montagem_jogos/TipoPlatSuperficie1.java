package com.casnav.testeapi.ssgnApi.entities.montagem_jogos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "TipoPlatSuperficie1")
@Table(schema = "montagem_jogos")
public class TipoPlatSuperficie1 {
    @Id
    @Column(name = "Id_TipoPlatSuperficie", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public TipoPlatSuperficie1 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoPlatSuperficie1 setNome(String nome) {
        this.nome = nome;
        return this;
    }

}