package com.casnav.testeapi.ssgnApi.entities.processo_montagem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "EmpregoArmamento")
@Table(schema = "processo_montagem")
public class EmpregoArmamento {
    @Id
    @Column(name = "Id_EmpregoArmamento", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "Id_TabelaArmamento", nullable = false)
    private Integer idTabelaarmamento;

    public Integer getId() {
        return id;
    }

    public EmpregoArmamento setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public EmpregoArmamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getIdTabelaarmamento() {
        return idTabelaarmamento;
    }

    public EmpregoArmamento setIdTabelaarmamento(Integer idTabelaarmamento) {
        this.idTabelaarmamento = idTabelaarmamento;
        return this;
    }

}