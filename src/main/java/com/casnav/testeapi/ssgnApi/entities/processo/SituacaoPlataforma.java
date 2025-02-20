package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SituacaoPlataforma", schema = "Processo")
public class SituacaoPlataforma {
    @Id
    @Column(name = "Id_SituacaoPlataforma", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "TipoPlataforma", nullable = false, length = 25)
    private String tipoPlataforma;

    @Column(name = "Constante")
    private Integer constante;

    public Integer getId() {
        return id;
    }

    public SituacaoPlataforma setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public SituacaoPlataforma setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getTipoPlataforma() {
        return tipoPlataforma;
    }

    public SituacaoPlataforma setTipoPlataforma(String tipoPlataforma) {
        this.tipoPlataforma = tipoPlataforma;
        return this;
    }

    public Integer getConstante() {
        return constante;
    }

    public SituacaoPlataforma setConstante(Integer constante) {
        this.constante = constante;
        return this;
    }

}