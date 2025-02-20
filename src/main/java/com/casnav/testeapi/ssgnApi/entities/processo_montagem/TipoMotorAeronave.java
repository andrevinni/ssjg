package com.casnav.testeapi.ssgnApi.modelos.Processo_Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "TipoMotorAeronave")
@Table(schema = "Processo_Montagem")
public class TipoMotorAeronave {
    @Id
    @Column(name = "Id_TipoMotorAeronave", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 30)
    private String nome;

    public Integer getId() {
        return id;
    }

    public TipoMotorAeronave setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoMotorAeronave setNome(String nome) {
        this.nome = nome;
        return this;
    }

}