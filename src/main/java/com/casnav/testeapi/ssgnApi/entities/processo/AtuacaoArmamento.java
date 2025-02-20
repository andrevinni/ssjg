package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AtuacaoArmamento", schema = "Processo")
public class AtuacaoArmamento {
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

    public AtuacaoArmamento setIdAtuacaoarmamento(String idAtuacaoarmamento) {
        this.idAtuacaoarmamento = idAtuacaoarmamento;
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