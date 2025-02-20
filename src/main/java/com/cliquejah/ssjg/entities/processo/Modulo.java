package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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