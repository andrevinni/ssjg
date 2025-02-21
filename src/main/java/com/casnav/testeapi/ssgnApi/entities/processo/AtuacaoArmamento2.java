package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AtuacaoArmamento2", schema = "Processo")
public class AtuacaoArmamento2 {
    @Id
    @Column(name = "id_AtuacaoArmamento", nullable = false, length = 50)
    private String idAtuacaoarmamento;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "Abrev", nullable = false, length = 10)
    private String abrev;

    public String getIdAtuacaoarmamento() {
        return idAtuacaoarmamento;
    }

    public AtuacaoArmamento2 setIdAtuacaoarmamento(String idAtuacaoarmamento) {
        this.idAtuacaoarmamento = idAtuacaoarmamento;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public AtuacaoArmamento2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getAbrev() {
        return abrev;
    }

    public AtuacaoArmamento2 setAbrev(String abrev) {
        this.abrev = abrev;
        return this;
    }

}