package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BuscaArmamento", schema = "Processo")
public class BuscaArmamento {
    @Id
    @Column(name = "Id_BuscaArmamento", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public BuscaArmamento setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public BuscaArmamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

}