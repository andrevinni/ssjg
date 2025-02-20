package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AtaqueAeronave", schema = "Processo")
public class AtaqueAeronave {
    @Id
    @Column(name = "Id_AtaqueAeronave", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public AtaqueAeronave setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public AtaqueAeronave setNome(String nome) {
        this.nome = nome;
        return this;
    }

}