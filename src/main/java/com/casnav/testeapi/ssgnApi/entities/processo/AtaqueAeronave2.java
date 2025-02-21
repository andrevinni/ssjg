package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AtaqueAeronave2", schema = "Processo")
public class AtaqueAeronave2 {
    @Id
    @Column(name = "Id_AtaqueAeronave", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public AtaqueAeronave2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public AtaqueAeronave2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

}