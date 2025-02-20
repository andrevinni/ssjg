package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Partido")
@Table(schema = "Dominio")
public class Partido {
    @Id
    @Column(name = "Id_Partido", nullable = false)
    private Integer id;

    @Column(name = "Nome", length = 150)
    private String nome;

    @Column(name = "Cor", length = 15)
    private String cor;

    @Column(name = "Id_Dominio_Simulacao")
    private Long idDominioSimulacao;

    @Column(name = "NomeCor", length = 100)
    private String nomeCor;

    @Column(name = "Id_Partido_Origem")
    private Integer idPartidoOrigem;

    @Column(name = "Neutro")
    private Boolean neutro;

    public Integer getId() {
        return id;
    }

    public Partido setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Partido setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCor() {
        return cor;
    }

    public Partido setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public Long getIdDominioSimulacao() {
        return idDominioSimulacao;
    }

    public Partido setIdDominioSimulacao(Long idDominioSimulacao) {
        this.idDominioSimulacao = idDominioSimulacao;
        return this;
    }

    public String getNomeCor() {
        return nomeCor;
    }

    public Partido setNomeCor(String nomeCor) {
        this.nomeCor = nomeCor;
        return this;
    }

    public Integer getIdPartidoOrigem() {
        return idPartidoOrigem;
    }

    public Partido setIdPartidoOrigem(Integer idPartidoOrigem) {
        this.idPartidoOrigem = idPartidoOrigem;
        return this;
    }

    public Boolean getNeutro() {
        return neutro;
    }

    public Partido setNeutro(Boolean neutro) {
        this.neutro = neutro;
        return this;
    }

}