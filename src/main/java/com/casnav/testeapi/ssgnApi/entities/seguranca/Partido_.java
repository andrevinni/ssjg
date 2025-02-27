package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.*;

@Entity
@Table(name = "partido_", schema = "seguranca")
public class Partido_ {
    @Id
    @Column(name = "id_partido", nullable = false)
    private Integer id;

    @Column(name = "nome", length = 150)
    private String nome;

    @Column(name = "cor", length = 15)
    private String cor;

    @Column(name = "nome_cor", length = 100)
    private String nomeCor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_partido_origem")
    private Partido_ idPartidoOrigem;

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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNomeCor() {
        return nomeCor;
    }

    public void setNomeCor(String nomeCor) {
        this.nomeCor = nomeCor;
    }

    public Partido_ getIdPartidoOrigem() {
        return idPartidoOrigem;
    }

    public void setIdPartidoOrigem(Partido_ idPartidoOrigem) {
        this.idPartidoOrigem = idPartidoOrigem;
    }

/*
 TODO [Reverse Engineering] create field to map the 'neutro' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "neutro", columnDefinition = "bit")
    private Object neutro;
*/
}