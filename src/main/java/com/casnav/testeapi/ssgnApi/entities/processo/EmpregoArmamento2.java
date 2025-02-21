package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmpregoArmamento2", schema = "Processo")
public class EmpregoArmamento2 {
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

    public EmpregoArmamento2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public EmpregoArmamento2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getIdTabelaarmamento() {
        return idTabelaarmamento;
    }

    public EmpregoArmamento2 setIdTabelaarmamento(Integer idTabelaarmamento) {
        this.idTabelaarmamento = idTabelaarmamento;
        return this;
    }

}