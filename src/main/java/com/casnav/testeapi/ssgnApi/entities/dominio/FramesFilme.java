package com.casnav.testeapi.ssgnApi.entities.dominio;

import com.casnav.testeapi.ssgnApi.entities.processo.DominioSimulacao;

import jakarta.persistence.*;
import java.time.Instant;

@Entity(name = "FramesFilme")
@Table(name = "Frames_Filme", schema = "Dominio")
public class FramesFilme {
    @EmbeddedId
    private FramesFilmeId id;

    @MapsId("idDominio")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_dominio", nullable = false)
    private DominioSimulacao idDominio;

    @Column(name = "dh_simulado")
    private Instant dhSimulado;

    @Column(name = "dh_real")
    private Instant dhReal;

    @Column(name = "conteudo_frame")
    private byte[] conteudoFrame;

    @Column(name = "nome_arquivo", length = 100)
    private String nomeArquivo;

    public FramesFilmeId getId() {
        return id;
    }

    public FramesFilme setId(FramesFilmeId id) {
        this.id = id;
        return this;
    }

    public DominioSimulacao getIdDominio() {
        return idDominio;
    }

    public FramesFilme setIdDominio(DominioSimulacao idDominio) {
        this.idDominio = idDominio;
        return this;
    }

    public Instant getDhSimulado() {
        return dhSimulado;
    }

    public FramesFilme setDhSimulado(Instant dhSimulado) {
        this.dhSimulado = dhSimulado;
        return this;
    }

    public Instant getDhReal() {
        return dhReal;
    }

    public FramesFilme setDhReal(Instant dhReal) {
        this.dhReal = dhReal;
        return this;
    }

    public byte[] getConteudoFrame() {
        return conteudoFrame;
    }

    public FramesFilme setConteudoFrame(byte[] conteudoFrame) {
        this.conteudoFrame = conteudoFrame;
        return this;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public FramesFilme setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        return this;
    }

}