package com.casnav.testeapi.ssgnApi.modelos.Processo_Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "EmpregoArmamento")
@Table(schema = "Processo_Montagem")
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