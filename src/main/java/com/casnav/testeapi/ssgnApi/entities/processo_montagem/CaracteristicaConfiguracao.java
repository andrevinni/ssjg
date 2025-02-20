package com.casnav.testeapi.ssgnApi.modelos.Processo_Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "CaracteristicaConfiguracao")
@Table(schema = "Processo_Montagem")
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