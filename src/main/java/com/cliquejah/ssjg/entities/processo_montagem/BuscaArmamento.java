package com.casnav.testeapi.ssgnApi.modelos.Processo_Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "BuscaArmamento")
@Table(schema = "Processo_Montagem")
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