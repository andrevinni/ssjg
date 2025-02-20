package com.casnav.testeapi.ssgnApi.modelos.Processo_Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Pavimento")
@Table(schema = "Processo_Montagem")
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