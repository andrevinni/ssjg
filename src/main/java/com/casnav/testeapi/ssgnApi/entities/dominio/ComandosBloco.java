package com.casnav.testeapi.ssgnApi.entities.dominio;

import org.hibernate.annotations.Nationalized;

import jakarta.persistence.*;
import java.time.Instant;

@Entity(name = "ComandosBloco")
@Table(schema = "Dominio")
public class ComandosBloco {
    @Id
    @Column(name = "Id_Comando", nullable = false)
    private Long id;

    @Column(name = "Id_BlocoComando", nullable = false)
    private Long idBlococomando;

    @Column(name = "Indice")
    private Integer indice;

    @Column(name = "DataHoraExec")
    private Instant dataHoraExec;

    @Column(name = "Login", length = 50)
    private String login;

    @Column(name = "FeedBack")
    private Integer feedBack;

    @Column(name = "DataHoraFimExec")
    private Instant dataHoraFimExec;

    @Nationalized
    @Lob
    @Column(name = "TextoComando")
    private String textoComando;

    @Column(name = "Codigo_FAB", length = 100)
    private String codigoFab;

    @Column(name = "Id_SituacaoComando")
    private Integer idSituacaocomando;

    public Long getId() {
        return id;
    }

    public ComandosBloco setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getIdBlococomando() {
        return idBlococomando;
    }

    public ComandosBloco setIdBlococomando(Long idBlococomando) {
        this.idBlococomando = idBlococomando;
        return this;
    }

    public Integer getIndice() {
        return indice;
    }

    public ComandosBloco setIndice(Integer indice) {
        this.indice = indice;
        return this;
    }

    public Instant getDataHoraExec() {
        return dataHoraExec;
    }

    public ComandosBloco setDataHoraExec(Instant dataHoraExec) {
        this.dataHoraExec = dataHoraExec;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public ComandosBloco setLogin(String login) {
        this.login = login;
        return this;
    }

    public Integer getFeedBack() {
        return feedBack;
    }

    public ComandosBloco setFeedBack(Integer feedBack) {
        this.feedBack = feedBack;
        return this;
    }

    public Instant getDataHoraFimExec() {
        return dataHoraFimExec;
    }

    public ComandosBloco setDataHoraFimExec(Instant dataHoraFimExec) {
        this.dataHoraFimExec = dataHoraFimExec;
        return this;
    }

    public String getTextoComando() {
        return textoComando;
    }

    public ComandosBloco setTextoComando(String textoComando) {
        this.textoComando = textoComando;
        return this;
    }

    public String getCodigoFab() {
        return codigoFab;
    }

    public ComandosBloco setCodigoFab(String codigoFab) {
        this.codigoFab = codigoFab;
        return this;
    }

    public Integer getIdSituacaocomando() {
        return idSituacaocomando;
    }

    public ComandosBloco setIdSituacaocomando(Integer idSituacaocomando) {
        this.idSituacaocomando = idSituacaocomando;
        return this;
    }

}