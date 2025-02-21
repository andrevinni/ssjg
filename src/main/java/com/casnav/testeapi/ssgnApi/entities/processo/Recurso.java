package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Recurso", schema = "Processo")
public class Recurso {
    @Id
    @Column(name = "Id_Recurso", nullable = false)
    private Long id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "Id_Modulo", nullable = false)
    private Long idModulo;

    @Column(name = "Descricao", nullable = false, length = 100)
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