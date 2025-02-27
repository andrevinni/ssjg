package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.*;

@Entity
@Table(name = "\"fasejogo\"", schema = "seguranca")
public class FaseJogo_ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"id_fase_jogo\"", nullable = false)
    private Integer id;

    @Column(name = "\"nome\"", length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}