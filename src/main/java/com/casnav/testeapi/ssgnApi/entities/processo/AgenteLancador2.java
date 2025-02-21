package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AgenteLancador2", schema = "Processo")
public class AgenteLancador2 {
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

    public AgenteLancador2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public AgenteLancador2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getAbrev() {
        return abrev;
    }

    public AgenteLancador2 setAbrev(String abrev) {
        this.abrev = abrev;
        return this;
    }

}