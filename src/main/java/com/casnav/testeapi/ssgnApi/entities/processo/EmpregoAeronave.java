package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmpregoAeronave", schema = "Processo")
public class EmpregoAeronave {
    @Id
    @Column(name = "Id_EmpregoAeronave", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public EmpregoAeronave setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public EmpregoAeronave setNome(String nome) {
        this.nome = nome;
        return this;
    }

}