package com.casnav.testeapi.ssgnApi.modelos.Processo_Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "AgenteLancador")
@Table(schema = "Processo_Montagem")
public class AgenteLancador {
    @Id
    @Column(name = "id_AgenteLancador", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "Abrev", nullable = false, length = 10)
    private String abrev;

    public Integer getId() {
        return id;
    }

    public AgenteLancador setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public AgenteLancador setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getAbrev() {
        return abrev;
    }

    public AgenteLancador setAbrev(String abrev) {
        this.abrev = abrev;
        return this;
    }

}