package com.casnav.testeapi.ssgnApi.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;
import java.time.Instant;

@MappedSuperclass
//@Entity(name = "Elemento")
//@Table(name="Elemento", schema = "Dominio")
//@Inheritance(strategy = InheritanceType.JOINED)
public class Elemento {
    @Id
    @Column(name = "Id_Elemento", nullable = false)
    private Long id;

    @Column(name = "Id_Dominio", nullable = false)
    private Long idDominio;

    @Column(name = "Id_Tipo_Elemento", nullable = false)
    private Long idTipoElemento;

    @Column(name = "Nome", length = 100)
    private String nome;

    @Column(name = "id_partido")
    private Integer idPartido;

    @Column(name = "Rumo")
    private Double rumo;

    @Column(name = "VelocAvanco")
    private Double velocAvanco;

    @Column(name = "Observacao", length = 100)
    private String observacao;

    @Column(name = "Id_UM")
    private Integer idUm;

    @Column(name = "DH_Simulada_Remocao")
    private Instant dhSimuladaRemocao;
    @Column(name = "DH_Real_Remocao")
    private Instant dhRealRemocao;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "Id_Elemento", nullable = false)
    private PontoNotavel pontoNotavel;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "Id_Elemento", nullable = false)
    private PontoNotavel pontoNotavel1;

    public PontoNotavel getPontoNotavel1() {
        return pontoNotavel1;
    }

    public Elemento setPontoNotavel1(PontoNotavel pontoNotavel1) {
        this.pontoNotavel1 = pontoNotavel1;
        return this;
    }

    public PontoNotavel getPontoNotavel() {
        return pontoNotavel;
    }

    public Elemento setPontoNotavel(PontoNotavel pontoNotavel) {
        this.pontoNotavel = pontoNotavel;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Elemento setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getIdDominio() {
        return idDominio;
    }

    public Elemento setIdDominio(Long idDominio) {
        this.idDominio = idDominio;
        return this;
    }

    public Long getIdTipoElemento() {
        return idTipoElemento;
    }

    public Elemento setIdTipoElemento(Long idTipoElemento) {
        this.idTipoElemento = idTipoElemento;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Elemento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getIdPartido() {
        return idPartido;
    }

    public Elemento setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
        return this;
    }

    public Double getRumo() {
        return rumo;
    }

    public Elemento setRumo(Double rumo) {
        this.rumo = rumo;
        return this;
    }

    public Double getVelocAvanco() {
        return velocAvanco;
    }

    public Elemento setVelocAvanco(Double velocAvanco) {
        this.velocAvanco = velocAvanco;
        return this;
    }

    public String getObservacao() {
        return observacao;
    }

    public Elemento setObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    public Integer getIdUm() {
        return idUm;
    }

    public Elemento setIdUm(Integer idUm) {
        this.idUm = idUm;
        return this;
    }

    public Instant getDhSimuladaRemocao() {
        return dhSimuladaRemocao;
    }

    public Elemento setDhSimuladaRemocao(Instant dhSimuladaRemocao) {
        this.dhSimuladaRemocao = dhSimuladaRemocao;
        return this;
    }

    public Instant getDhRealRemocao() {
        return dhRealRemocao;
    }

    public Elemento setDhRealRemocao(Instant dhRealRemocao) {
        this.dhRealRemocao = dhRealRemocao;
        return this;
    }

/*
 TODO [Reverse Engineering] create field to map the 'posicao' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "posicao", columnDefinition = "geography not null")
    private Object posicao;
*/
}