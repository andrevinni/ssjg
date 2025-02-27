package com.casnav.testeapi.ssgnApi.entities.seguranca;

import com.casnav.testeapi.ssgnApi.entities.processo.Modulo;
import jakarta.persistence.*;

@Entity
@Table(name = "recurso_", schema = "seguranca")
public class Recurso_ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recurso", nullable = false)
    private Long id;

    @Column(name = "nome", length = 50)
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_modulo", nullable = false)
    private Modulo idModulo;

    @Column(name = "descricao", length = 100)
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modulo getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Modulo idModulo) {
        this.idModulo = idModulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}