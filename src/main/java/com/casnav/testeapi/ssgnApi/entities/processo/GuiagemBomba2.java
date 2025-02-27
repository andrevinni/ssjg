package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GuiagemBomba", schema = "Processo")
public class GuiagemBomba2 {
    @Id
    @Column(name = "Id_GuiagemBomba", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "Abrev", nullable = false, length = 10)
    private String abrev;

    public Integer getId() {
        return id;
    }

    public GuiagemBomba2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public GuiagemBomba2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getAbrev() {
        return abrev;
    }

    public GuiagemBomba2 setAbrev(String abrev) {
        this.abrev = abrev;
        return this;
    }

}