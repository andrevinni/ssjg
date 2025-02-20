package com.casnav.testeapi.ssgnApi.modelos.Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "ElementoMontagem")
@Table(name = "Elemento_Montagem", schema = "Montagem_Jogos")
public class ElementoMontagem {
    @Id
    @Column(name = "Id_Elemento_Montagem", nullable = false)
    private Long id;

    @Column(name = "Nome", length = 50)
    private String nome;

    public Long getId() {
        return id;
    }

    public ElementoMontagem setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public ElementoMontagem setNome(String nome) {
        this.nome = nome;
        return this;
    }

}