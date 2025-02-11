package com.cliquejah.ssjg.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

public class MeioSimulado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "AcaoMS")
    private String acaoMS;

    //@OneToOne(mappedBy = "meiosimulado", cascade = CascadeType.ALL)
    @JoinColumn(name = "id_partido")
    private Partido partido;
    
	@OneToMany(mappedBy = "id.product")
	private Set<OrderItem> items = new HashSet<>();

    @Column(name = "Rumo")
    private Double rumo;

    @Column(name = "VelocAvanco")
    private Double velocAvanco;

    @Column(name = "Latitude")
    private Float latitude;

    @Column(name = "Longitude")
    private Float longitude;

    @Column(name = "Id_MSS")
    private Integer idMss;

    @Column(name = "DataHora", length = 14)
    private String dataHora;
   
    @Column(name = "TabelaMeioSimulado")
    private String tabelaMeioSimulado;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Id_trajeto")
//    private Trajeto idTrajeto;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Id_UM")
//    private Um idUm;

    @Column(name = "VelocTrajeto")
    private Double velocTrajeto;

    @Column(name = "ProximoPonto")
    private Integer proximoPonto;

    @Column(name = "Trajeto_UltimoPonto")
    private Integer trajetoUltimoponto;

    @Column(name = "Plano_VoltasRestantes")
    private Integer planoVoltasrestantes;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Id_Plano")
//    private Plano idPlano;

    
    @Column(name = "Login")
    private String login;

    
    @Column(name = "Observacao")
    private String observacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAcaoMS() {
        return acaoMS;
    }

    public void setAcaoMS(String acaoMS) {
        this.acaoMS = acaoMS;
    }

    public Partido getIdPartido() {
        return partido;
    }

    public void setIdPartido(Partido idPartido) {
        this.partido = idPartido;
    }

    public Double getRumo() {
        return rumo;
    }

    public void setRumo(Double rumo) {
        this.rumo = rumo;
    }

    public Double getVelocAvanco() {
        return velocAvanco;
    }

    public void setVelocAvanco(Double velocAvanco) {
        this.velocAvanco = velocAvanco;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Integer getIdMss() {
        return idMss;
    }

    public void setIdMss(Integer idMss) {
        this.idMss = idMss;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getTabelaMeioSimulado() {
        return tabelaMeioSimulado;
    }

    public void setTabelaMeioSimulado(String tabelaMeioSimulado) {
        this.tabelaMeioSimulado = tabelaMeioSimulado;
    }

//    public Trajeto getIdTrajeto() {
//        return idTrajeto;
//    }

//    public void setIdTrajeto(Trajeto idTrajeto) {
//        this.idTrajeto = idTrajeto;
//    }

//    public Um getIdUm() {
//        return idUm;
//    }

//    public void setIdUm(Um idUm) {
//        this.idUm = idUm;
//    }

    public Double getVelocTrajeto() {
        return velocTrajeto;
    }

    public void setVelocTrajeto(Double velocTrajeto) {
        this.velocTrajeto = velocTrajeto;
    }

    public Integer getProximoPonto() {
        return proximoPonto;
    }

    public void setProximoPonto(Integer proximoPonto) {
        this.proximoPonto = proximoPonto;
    }

    public Integer getTrajetoUltimoponto() {
        return trajetoUltimoponto;
    }

    public void setTrajetoUltimoponto(Integer trajetoUltimoponto) {
        this.trajetoUltimoponto = trajetoUltimoponto;
    }

    public Integer getPlanoVoltasrestantes() {
        return planoVoltasrestantes;
    }

    public void setPlanoVoltasrestantes(Integer planoVoltasrestantes) {
        this.planoVoltasrestantes = planoVoltasrestantes;
    }

//    public Plano getIdPlano() {
//        return idPlano;
//    }

//    public void setIdPlano(Plano idPlano) {
//        this.idPlano = idPlano;
//    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}