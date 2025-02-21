package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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