package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TipoTorpedo2", schema = "Processo")
public class TipoTorpedo2 {
    @Id
    @Column(name = "Id_TipoTorpedo", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public TipoTorpedo2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoTorpedo2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

}