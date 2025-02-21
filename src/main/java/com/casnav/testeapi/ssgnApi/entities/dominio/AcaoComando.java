package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "AcaoComando")
@Table(schema = "Dominio")
public class AcaoComando {
    @Id
    @Column(name = "Id_Comando", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Comando", nullable = false)
    private com.casnav.testeapi.ssgnApi.entities.dominio.ComandosBloco comandosBloco;

    @Column(name = "AcaoMS", length = 100)
    private String acaoMS;

    @Column(name = "DataHora", length = 14)
    private String dataHora;

    @Column(name = "Id_trajeto")
    private Integer idTrajeto;

    @Column(name = "VelocTrajeto")
    private Double velocTrajeto;

    @Column(name = "ProximoPonto")
    private Integer proximoPonto;

    @Column(name = "Trajeto_UltimoPonto")
    private Integer trajetoUltimoponto;

    @Column(name = "Plano_VoltasRestantes")
    private Integer planoVoltasrestantes;

    @Column(name = "Id_Plano")
    private Long idPlano;

    @Column(name = "Login", length = 50)
    private String login;

    @Column(name = "Id_AreaPatrulha")
    private Long idAreapatrulha;

    public Long getId() {
        return id;
    }

    public AcaoComando setId(Long id) {
        this.id = id;
        return this;
    }

    public com.casnav.testeapi.ssgnApi.entities.dominio.ComandosBloco getComandosBloco() {
        return comandosBloco;
    }

    public AcaoComando setComandosBloco(com.casnav.testeapi.ssgnApi.entities.dominio.ComandosBloco comandosBloco) {
        this.comandosBloco = comandosBloco;
        return this;
    }

    public String getAcaoMS() {
        return acaoMS;
    }

    public AcaoComando setAcaoMS(String acaoMS) {
        this.acaoMS = acaoMS;
        return this;
    }

    public String getDataHora() {
        return dataHora;
    }

    public AcaoComando setDataHora(String dataHora) {
        this.dataHora = dataHora;
        return this;
    }

    public Integer getIdTrajeto() {
        return idTrajeto;
    }

    public AcaoComando setIdTrajeto(Integer idTrajeto) {
        this.idTrajeto = idTrajeto;
        return this;
    }

    public Double getVelocTrajeto() {
        return velocTrajeto;
    }

    public AcaoComando setVelocTrajeto(Double velocTrajeto) {
        this.velocTrajeto = velocTrajeto;
        return this;
    }

    public Integer getProximoPonto() {
        return proximoPonto;
    }

    public AcaoComando setProximoPonto(Integer proximoPonto) {
        this.proximoPonto = proximoPonto;
        return this;
    }

    public Integer getTrajetoUltimoponto() {
        return trajetoUltimoponto;
    }

    public AcaoComando setTrajetoUltimoponto(Integer trajetoUltimoponto) {
        this.trajetoUltimoponto = trajetoUltimoponto;
        return this;
    }

    public Integer getPlanoVoltasrestantes() {
        return planoVoltasrestantes;
    }

    public AcaoComando setPlanoVoltasrestantes(Integer planoVoltasrestantes) {
        this.planoVoltasrestantes = planoVoltasrestantes;
        return this;
    }

    public Long getIdPlano() {
        return idPlano;
    }

    public AcaoComando setIdPlano(Long idPlano) {
        this.idPlano = idPlano;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public AcaoComando setLogin(String login) {
        this.login = login;
        return this;
    }

    public Long getIdAreapatrulha() {
        return idAreapatrulha;
    }

    public AcaoComando setIdAreapatrulha(Long idAreapatrulha) {
        this.idAreapatrulha = idAreapatrulha;
        return this;
    }

}