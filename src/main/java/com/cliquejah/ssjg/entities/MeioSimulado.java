package com.cliquejah.ssjg.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Set;


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

	private float latitude;

	@Column(name="\"Login\"", length=255)
	private String login;

	private float longitude;

	@Column(length=50)
	private String nome;

	@Column(length=255)
	private String observacao;

	@Column(name="plano_voltasrestantes")
	private Integer planoVoltasrestantes;

	private Integer proximoponto;

	private double rumo;

	@Column(length=50)
	private String tabelameiosimulado;

	@Column(name="trajeto_ultimoponto")
	private Integer trajetoUltimoponto;

	private double velocavanco;

	private double veloctrajeto;

	//bi-directional many-to-one association to Localizacao
	@OneToMany(mappedBy="meiosimuladoplataer")
	private Set<Localizacao> localizacaoplataer;

	//bi-directional many-to-one association to Localizacao
	@OneToMany(mappedBy="meiosimuladoplatsub")
	private Set<Localizacao> localizacaoplatsub;

	//bi-directional many-to-one association to Localizacao
	@OneToMany(mappedBy="meiosimuladoplatsup")
	private Set<Localizacao> localizacaoplatsup;

	//bi-directional many-to-one association to Localizacao
	@OneToMany(mappedBy="meiosimuladoplatterra")
	private Set<Localizacao> localizacaoplatterra;

	//bi-directional many-to-one association to Partido
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_partido")
	private Partido partido;

	public MeioSimulado() {
	}

	public Integer getIdMeiosimulado() {
		return this.idMeiosimulado;
	}

	public void setIdMeiosimulado(Integer idMeiosimulado) {
		this.idMeiosimulado = idMeiosimulado;
	}

	public String getAcaoms() {
		return this.acaoms;
	}

	public void setAcaoms(String acaoms) {
		this.acaoms = acaoms;
	}

	public String getDatahora() {
		return this.datahora;
	}

	public void setDatahora(String datahora) {
		this.datahora = datahora;
	}

	public Integer getIdMss() {
		return this.idMss;
	}

	public void setIdMss(Integer idMss) {
		this.idMss = idMss;
	}

	public Integer getIdPlano() {
		return this.idPlano;
	}

	public void setIdPlano(Integer idPlano) {
		this.idPlano = idPlano;
	}

	public Integer getIdTrajeto() {
		return this.idTrajeto;
	}

	public void setIdTrajeto(Integer idTrajeto) {
		this.idTrajeto = idTrajeto;
	}

	public Integer getIdUm() {
		return this.idUm;
	}

	public void setIdUm(Integer idUm) {
		this.idUm = idUm;
	}

	public float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Integer getPlanoVoltasrestantes() {
		return this.planoVoltasrestantes;
	}

	public void setPlanoVoltasrestantes(Integer planoVoltasrestantes) {
		this.planoVoltasrestantes = planoVoltasrestantes;
	}

	public Integer getProximoponto() {
		return this.proximoponto;
	}

	public void setProximoponto(Integer proximoponto) {
		this.proximoponto = proximoponto;
	}

	public double getRumo() {
		return this.rumo;
	}

	public void setRumo(double rumo) {
		this.rumo = rumo;
	}

	public String getTabelameiosimulado() {
		return this.tabelameiosimulado;
	}

	public void setTabelameiosimulado(String tabelameiosimulado) {
		this.tabelameiosimulado = tabelameiosimulado;
	}

	public Integer getTrajetoUltimoponto() {
		return this.trajetoUltimoponto;
	}

	public void setTrajetoUltimoponto(Integer trajetoUltimoponto) {
		this.trajetoUltimoponto = trajetoUltimoponto;
	}

	public double getVelocavanco() {
		return this.velocavanco;
	}

	public void setVelocavanco(double velocavanco) {
		this.velocavanco = velocavanco;
	}

	public double getVeloctrajeto() {
		return this.veloctrajeto;
	}

	public void setVeloctrajeto(double veloctrajeto) {
		this.veloctrajeto = veloctrajeto;
	}

	public Set<Localizacao> getLocalizacaoPlatAer() {
		return this.localizacaoplataer;
	}

	public void setLocalizacaoPlatAer(Set<Localizacao> localizacaoplataer) {
		this.localizacaoplataer = localizacaoplataer;
	}

	public Localizacao addLocalizacaoPlatAer(Localizacao localizacaoplataer) {
		getLocalizacaoPlatAer().add(localizacaoplataer);
		localizacaoplataer.setMeioSimuladorPlatAer(this);

		return localizacaoplataer;
	}

	public Localizacao removeLocalizacaoPlatAer(Localizacao localizacaoplataer) {
		getLocalizacaoPlatAer().remove(localizacaoplataer);
		localizacaoplataer.setMeioSimuladorPlatAer(null);

		return localizacaoplataer;
	}

	public Set<Localizacao> getLocalizacaoPlatSub() {
		return this.localizacaoplatsub;
	}

	public void setLocalizacaoPlatSub(Set<Localizacao> localizacaoplatsub) {
		this.localizacaoplatsub = localizacaoplatsub;
	}

	public Localizacao addLocalizacaoPlatSub(Localizacao localizacaoplatsub) {
		getLocalizacaoPlatSub().add(localizacaoplatsub);
		localizacaoplatsub.setMeioSimuladorPlatSub(this);

		return localizacaoplatsub;
	}

	public Localizacao removeLocalizacaoPlatSub(Localizacao localizacaoplatsub) {
		getLocalizacaoPlatSub().remove(localizacaoplatsub);
		localizacaoplatsub.setMeioSimuladorPlatSub(null);

		return localizacaoplatsub;
	}

	public Set<Localizacao> getLocalizacaoPlatSup() {
		return this.localizacaoplatsup;
	}

	public void setLocalizacaoPlatSup(Set<Localizacao> localizacaoplatsup) {
		this.localizacaoplatsup = localizacaoplatsup;
	}

	public Localizacao addLocalizacaoPlatSup(Localizacao localizacaoplatsup) {
		getLocalizacaoPlatSup().add(localizacaoplatsup);
		localizacaoplatsup.setMeioSimuladorPlatSup(this);

		return localizacaoplatsup;
	}

	public Localizacao removeLocalizacaoPlatSup(Localizacao localizacaoplatsup) {
		getLocalizacaoPlatSup().remove(localizacaoplatsup);
		localizacaoplatsup.setMeioSimuladorPlatSup(null);

		return localizacaoplatsup;
	}

	public Set<Localizacao> getLocalizacaoPlatTerra() {
		return this.localizacaoplatterra;
	}

	public void setLocalizacaoPlatTerra(Set<Localizacao> localizacaoplatterra) {
		this.localizacaoplatterra = localizacaoplatterra;
	}

	public Localizacao addLocalizacaoPlatTerra(Localizacao localizacaoplatterra) {
		getLocalizacaoPlatTerra().add(localizacaoplatterra);
		localizacaoplatterra.setMeioSimuladorPlatTerra(this);

		return localizacaoplatterra;
	}

	public Localizacao removeLocalizacaoPlatTerra(Localizacao localizacaoplatterra) {
		getLocalizacaoPlatTerra().remove(localizacaoplatterra);
		localizacaoplatterra.setMeioSimuladorPlatTerra(null);

		return localizacaoplatterra;
	}

	public Partido getPartido() {
		return this.partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

}