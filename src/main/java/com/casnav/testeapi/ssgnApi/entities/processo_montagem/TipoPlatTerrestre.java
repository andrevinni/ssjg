package com.casnav.testeapi.ssgnApi.entities.processo_montagem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "TipoPlatTerrestre")
@Table(schema = "processo_montagem")
public class TipoPlatTerrestre {
    @Id
    @Column(name = "Id_TipoPlatTerrestre", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public TipoPlatTerrestre setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoPlatTerrestre setNome(String nome) {
        this.nome = nome;
        return this;
    }

}