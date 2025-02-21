package com.casnav.testeapi.ssgnApi.entities.dominio;

import org.hibernate.annotations.Nationalized;

import jakarta.persistence.*;
import java.time.Instant;

@Entity(name = "BlocoComando")
@Table(schema = "Dominio")
public class BlocoComando {
    @Id
    @Column(name = "Id_Bloco", nullable = false)
    private Long id;

    @Nationalized
    @Lob
    @Column(name = "texto_origem")
    private String textoOrigem;

    @Nationalized
    @Lob
    @Column(name = "texto_json")
    private String textoJson;

    @Column(name = "Id_FormatoComando")
    private Integer idFormatocomando;

    @Column(name = "Id_Dominio_Simulacao")
    private Long idDominioSimulacao;

    @Nationalized
    @Column(name = "Login", length = 10)
    private String login;

    @Column(name = "DH_Traducao")
    private Instant dhTraducao;

    @Column(name = "BlocoFinalizadoDHReal")
    private Instant blocoFinalizadoDHReal;

    @Column(name = "BlocoFinalizadoDHSimulada")
    private Instant blocoFinalizadoDHSimulada;

    public Long getId() {
        return id;
    }

    public BlocoComando setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTextoOrigem() {
        return textoOrigem;
    }

    public BlocoComando setTextoOrigem(String textoOrigem) {
        this.textoOrigem = textoOrigem;
        return this;
    }

    public String getTextoJson() {
        return textoJson;
    }

    public BlocoComando setTextoJson(String textoJson) {
        this.textoJson = textoJson;
        return this;
    }

    public Integer getIdFormatocomando() {
        return idFormatocomando;
    }

    public BlocoComando setIdFormatocomando(Integer idFormatocomando) {
        this.idFormatocomando = idFormatocomando;
        return this;
    }

    public Long getIdDominioSimulacao() {
        return idDominioSimulacao;
    }

    public BlocoComando setIdDominioSimulacao(Long idDominioSimulacao) {
        this.idDominioSimulacao = idDominioSimulacao;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public BlocoComando setLogin(String login) {
        this.login = login;
        return this;
    }

    public Instant getDhTraducao() {
        return dhTraducao;
    }

    public BlocoComando setDhTraducao(Instant dhTraducao) {
        this.dhTraducao = dhTraducao;
        return this;
    }

    public Instant getBlocoFinalizadoDHReal() {
        return blocoFinalizadoDHReal;
    }

    public BlocoComando setBlocoFinalizadoDHReal(Instant blocoFinalizadoDHReal) {
        this.blocoFinalizadoDHReal = blocoFinalizadoDHReal;
        return this;
    }

    public Instant getBlocoFinalizadoDHSimulada() {
        return blocoFinalizadoDHSimulada;
    }

    public BlocoComando setBlocoFinalizadoDHSimulada(Instant blocoFinalizadoDHSimulada) {
        this.blocoFinalizadoDHSimulada = blocoFinalizadoDHSimulada;
        return this;
    }

}