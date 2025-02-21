package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CaracteristicaConfiguracao2", schema = "Processo")
public class CaracteristicaConfiguracao2 {
    @Id
    @Column(name = "id_CaracteristicaConfiguracao", nullable = false)
    private Integer id;

    @Column(name = "Nome", length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public CaracteristicaConfiguracao2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public CaracteristicaConfiguracao2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

}