package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.*;

@Entity
@Table(name = "Constantes", schema = "Processo")
public class Constante {
    @EmbeddedId
    private ConstanteId id;

    @MapsId("idModulo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Modulo", nullable = false)
    private com.casnav.testeapi.ssgnApi.entities.processo.Modulo idModulo;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "Valor", length = 500)
    private String valor;

    public ConstanteId getId() {
        return id;
    }

    public Constante setId(ConstanteId id) {
        this.id = id;
        return this;
    }

    public com.casnav.testeapi.ssgnApi.entities.processo.Modulo getIdModulo() {
        return idModulo;
    }

    public Constante setIdModulo(com.casnav.testeapi.ssgnApi.entities.processo.Modulo idModulo) {
        this.idModulo = idModulo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Constante setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getValor() {
        return valor;
    }

    public Constante setValor(String valor) {
        this.valor = valor;
        return this;
    }

}