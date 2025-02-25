package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TipoPlatSuperficie2", schema = "Processo")
public class TipoPlatSuperficie2 {
    @Id
    @Column(name = "Id_TipoPlatSuperficie", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public TipoPlatSuperficie2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoPlatSuperficie2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

}