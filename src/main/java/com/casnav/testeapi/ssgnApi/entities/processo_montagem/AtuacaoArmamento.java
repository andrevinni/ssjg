package com.casnav.testeapi.ssgnApi.entities.processo_montagem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "AtuacaoArmamento")
@Table(schema = "processo_montagem")
public class AtuacaoArmamento {
    @Id
    @Column(name = "id_AtuacaoArmamento", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "Abrev", nullable = false, length = 10)
    private String abrev;

    public Integer getId() {
        return id;
    }

    public AtuacaoArmamento setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public AtuacaoArmamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getAbrev() {
        return abrev;
    }

    public AtuacaoArmamento setAbrev(String abrev) {
        this.abrev = abrev;
        return this;
    }

}