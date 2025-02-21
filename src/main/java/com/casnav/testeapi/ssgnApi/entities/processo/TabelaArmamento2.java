package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TabelaArmamento2", schema = "Processo")
public class TabelaArmamento2 {
    @Id
    @Column(name = "Id_TabelaArmamento", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public TabelaArmamento2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TabelaArmamento2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

}