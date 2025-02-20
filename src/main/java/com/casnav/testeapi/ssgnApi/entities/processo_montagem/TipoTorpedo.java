package com.casnav.testeapi.ssgnApi.modelos.Processo_Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "TipoTorpedo")
@Table(schema = "Processo_Montagem")
public class TipoTorpedo {
    @Id
    @Column(name = "Id_TipoTorpedo", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public TipoTorpedo setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoTorpedo setNome(String nome) {
        this.nome = nome;
        return this;
    }

}