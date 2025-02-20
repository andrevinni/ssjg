package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FinalidadePontoNotavel", schema = "Processo")
public class FinalidadePontoNotavel {
    @Id
    @Column(name = "Id_FinalidadePontoNotavel", nullable = false)
    private Long id;

    @Column(name = "Nome", length = 100)
    private String nome;

    public Long getId() {
        return id;
    }

    public FinalidadePontoNotavel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public FinalidadePontoNotavel setNome(String nome) {
        this.nome = nome;
        return this;
    }

}