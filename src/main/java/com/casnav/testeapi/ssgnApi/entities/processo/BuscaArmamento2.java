package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BuscaArmamento2", schema = "Processo")
public class BuscaArmamento2 {
    @Id
    @Column(name = "Id_BuscaArmamento", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public BuscaArmamento2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public BuscaArmamento2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

}