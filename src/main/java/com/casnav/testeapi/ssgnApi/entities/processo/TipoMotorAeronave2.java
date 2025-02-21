package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TipoMotorAeronave2", schema = "Processo")
public class TipoMotorAeronave2 {
    @Id
    @Column(name = "Id_TipoMotorAeronave", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 30)
    private String nome;

    public Integer getId() {
        return id;
    }

    public TipoMotorAeronave2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoMotorAeronave2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

}