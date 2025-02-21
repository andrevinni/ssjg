package com.casnav.testeapi.ssgnApi.entities.processo_montagem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "CaracteristicaConfiguracao")
@Table(schema = "processo_montagem")
public class CaracteristicaConfiguracao {
    @Id
    @Column(name = "id_CaracteristicaConfiguracao", nullable = false)
    private Integer id;

    @Column(name = "Nome", length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public CaracteristicaConfiguracao setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public CaracteristicaConfiguracao setNome(String nome) {
        this.nome = nome;
        return this;
    }

}