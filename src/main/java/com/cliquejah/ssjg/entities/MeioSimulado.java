package com.cliquejah.ssjg.entities;

import java.io.Serializable;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonUnwrapped;


/**
 * The persistent class for the meiosimulado database table.
 * 
 */
@Entity
@Table(name="meiosimulado")
@NamedQuery(name="MeioSimulado.findAll", query="SELECT m FROM MeioSimulado m")
public class MeioSimulado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_meiosimulado", unique=true, nullable=false)
	private Integer idMeiosimulado;

	@Column(length=255)
	private String acaoms;

	@Column(length=14)
	private String datahora;

	@Column(name="id_mss")
	private Integer idMss;

	@Column(name="id_plano")
	private Integer idPlano;

	@Column(name="id_trajeto")
	private Integer idTrajeto;

	@Column(name="id_um")
	private Integer idUm;

	private Float latitude;

	@Column(name="\"Login\"", length=255)
	private String login;

	private Float longitude;

	@Column(length=50)
	private String nome;

	@Column(length=255)
	private String observacao;

	@Column(name="plano_voltasrestantes")
	private Integer planoVoltasrestantes;

	private Integer proximoponto;

	private Double rumo;

	@Column(length=50)
	private String tabelameiosimulado;

	@Column(name="trajeto_ultimoponto")
	private Integer trajetoUltimoponto;

	private Double velocavanco;

	private Double veloctrajeto;

	//bi-directional many-to-one association to Localizacao
	//@JsonManagedReference
	//@OneToOne(mappedBy="meiosimuladoplataer")
	//@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //@JoinColumn(name = "id_meiosimulado_platsub", referencedColumnName = "id_localizacao") 	
	//private Localizacao localizacaoplataer;

	//bi-directional many-to-one association to Localizacao
	//@JsonManagedReference
	//@OneToOne(mappedBy="meiosimuladoplatsub")
    //@JoinColumn(name = "id_meiosimulado_platsub", referencedColumnName = "id_localizacao") 	
	//private Localizacao localizacaoplatsub;

	//bi-directional many-to-one association to Localizacao
	//@JsonManagedReference
	//@OneToOne(mappedBy="meiosimuladoplatsup")
    //@JoinColumn(name = "id_meiosimulado_platsub", referencedColumnName = "id_localizacao") 	
	//private Localizacao localizacaoplatsup;

	//bi-directional many-to-one association to Localizacao
	//@OneToOne(mappedBy="meiosimuladoplatterra")
    //@JoinColumn(name = "id_meiosimulado_platsub", referencedColumnName = "id_localizacao") 	
	//private Localizacao localizacaoplatterra;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_partido", nullable=false)
	@JsonBackReference
	//@JsonUnwrapped
	private Partido partido;

	public MeioSimulado() {
	}

	public Integer getIdMeiosimulado() {
		return idMeiosimulado;
	}

	public void setIdMeiosimulado(Integer idMeiosimulado) {
		this.idMeiosimulado = idMeiosimulado;
	}

	public String getAcaoms() {
		return acaoms;
	}

	public void setAcaoms(String acaoms) {
		this.acaoms = acaoms;
	}

	public String getDatahora() {
		return datahora;
	}

	public void setDatahora(String datahora) {
		this.datahora = datahora;
	}

	public Integer getIdMss() {
		return idMss;
	}

	public void setIdMss(Integer idMss) {
		this.idMss = idMss;
	}

	public Integer getIdPlano() {
		return idPlano;
	}

	public void setIdPlano(Integer idPlano) {
		this.idPlano = idPlano;
	}

	public Integer getIdTrajeto() {
		return idTrajeto;
	}

	public void setIdTrajeto(Integer idTrajeto) {
		this.idTrajeto = idTrajeto;
	}

	public Integer getIdUm() {
		return idUm;
	}

	public void setIdUm(Integer idUm) {
		this.idUm = idUm;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Integer getPlanoVoltasrestantes() {
		return planoVoltasrestantes;
	}

	public void setPlanoVoltasrestantes(Integer planoVoltasrestantes) {
		this.planoVoltasrestantes = planoVoltasrestantes;
	}

	public Integer getProximoponto() {
		return proximoponto;
	}

	public void setProximoponto(Integer proximoponto) {
		this.proximoponto = proximoponto;
	}

	public Double getRumo() {
		return rumo;
	}

	public void setRumo(Double rumo) {
		this.rumo = rumo;
	}

	public String getTabelameiosimulado() {
		return tabelameiosimulado;
	}

	public void setTabelameiosimulado(String tabelameiosimulado) {
		this.tabelameiosimulado = tabelameiosimulado;
	}

	public Integer getTrajetoUltimoponto() {
		return trajetoUltimoponto;
	}

	public void setTrajetoUltimoponto(Integer trajetoUltimoponto) {
		this.trajetoUltimoponto = trajetoUltimoponto;
	}

	public Double getVelocavanco() {
		return velocavanco;
	}

	public void setVelocavanco(Double velocavanco) {
		this.velocavanco = velocavanco;
	}

	public Double getVeloctrajeto() {
		return veloctrajeto;
	}

	public void setVeloctrajeto(Double veloctrajeto) {
		this.veloctrajeto = veloctrajeto;
	}

//	public Localizacao getLocalizacaoplataer() {
//		return localizacaoplataer;
//	}

//	public void setLocalizacaoplataer(Localizacao localizacaoplataer) {
//		this.localizacaoplataer = localizacaoplataer;
//	}

//	public Localizacao getLocalizacaoplatsub() {
//		return localizacaoplatsub;
//	}

//	public void setLocalizacaoplatsub(Localizacao localizacaoplatsub) {
//		this.localizacaoplatsub = localizacaoplatsub;
//	}

//	public Localizacao getLocalizacaoplatsup() {
//		return localizacaoplatsup;
//	}

//	public void setLocalizacaoplatsup(Localizacao localizacaoplatsup) {
//		this.localizacaoplatsup = localizacaoplatsup;
//	}

//	public Localizacao getLocalizacaoplatterra() {
//		return localizacaoplatterra;
//	}

//	public void setLocalizacaoplatterra(Localizacao localizacaoplatterra) {
//		this.localizacaoplatterra = localizacaoplatterra;
//	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}