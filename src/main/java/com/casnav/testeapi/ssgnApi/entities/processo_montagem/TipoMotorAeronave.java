package com.casnav.testeapi.ssgnApi.entities.processo_montagem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "TipoMotorAeronave")
@Table(schema = "processo_montagem")
public class TipoMotorAeronave {
    @Id
    @Column(name = "Id_TipoMotorAeronave", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 30)
    private String nome;

    public Integer getId() {
        return id;
    }

    public TipoMotorAeronave setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoMotorAeronave setNome(String nome) {
        this.nome = nome;
        return this;
    }

}