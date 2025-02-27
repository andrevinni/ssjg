package com.casnav.testeapi.ssgnApi.entities.seguranca;

import com.casnav.testeapi.ssgnApi.entities.processo.Modulo;
import jakarta.persistence.*;

@Entity
@Table(name = "constantes_", schema = "seguranca")
public class Constante_ {
    @Id
    @Column(name = "id_constante", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_modulo", nullable = false)
    private Modulo idModulo;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "valor", length = 500)
    private String valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Modulo getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Modulo idModulo) {
        this.idModulo = idModulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}