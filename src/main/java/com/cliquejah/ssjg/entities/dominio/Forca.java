package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Forca")
@Table(schema = "Dominio")
public class Forca {
    @Id
    @Column(name = "Id_Forca", nullable = false)
    private Integer id;

    @Column(name = "Nome", length = 100)
    private String nome;

    @Column(name = "Prefixo", length = 50)
    private String prefixo;

    @Column(name = "IdClasse")
    private Integer idClasse;

    @Column(name = "Id_Dominio_Simulacao")
    private Long idDominioSimulacao;

    @Column(name = "Id_Forca_Origem")
    private Integer idForcaOrigem;

    public Integer getId() {
        return id;
    }

    public Forca setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Forca setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public Forca setPrefixo(String prefixo) {
        this.prefixo = prefixo;
        return this;
    }

    public Integer getIdClasse() {
        return idClasse;
    }

    public Forca setIdClasse(Integer idClasse) {
        this.idClasse = idClasse;
        return this;
    }

    public Long getIdDominioSimulacao() {
        return idDominioSimulacao;
    }

    public Forca setIdDominioSimulacao(Long idDominioSimulacao) {
        this.idDominioSimulacao = idDominioSimulacao;
        return this;
    }

    public Integer getIdForcaOrigem() {
        return idForcaOrigem;
    }

    public Forca setIdForcaOrigem(Integer idForcaOrigem) {
        this.idForcaOrigem = idForcaOrigem;
        return this;
    }

}