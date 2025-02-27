package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recurso", schema = "processo")
public class Recurso {
    @Id
    @Column(name = "id_recurso", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "id_modulo", nullable = false)
    private Long idModulo;

    @Column(name = "descricao", nullable = false, length = 100)
    private String descricao;

    public Long getId() {
        return id;
    }

    public Recurso setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Recurso setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public Recurso setIdModulo(Long idModulo) {
        this.idModulo = idModulo;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Recurso setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

}