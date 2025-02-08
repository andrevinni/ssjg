package com.cliquejah.ssjg.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Set;


/**
 * The persistent class for the base database table.
 * 
 */
@Entity
@Table(name="base")
@NamedQuery(name="Base.findAll", query="SELECT b FROM Base b")
public class Base implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_base", unique=true, nullable=false)
	private Integer idBase;

	private double caladomaximo;

	private double capachangaragem;

	@Column(length=2147483647)
	private String classereparo;

	private double extensaocais;

	@Column(length=2147483647)
	private String facilidadereparo;

	private Integer fundeadcaladomax;

	private Integer fundeadnummaxnavio;

	@Column(nullable=false)
	private float latitude;

	@Column(name="\"Login\"", length=255)
	private String login;

	@Column(nullable=false)
	private float longitude;

	@Column(length=255)
	private String nome;

	@Column(length=255)
	private String observacao;

	@Column(length=255)
	private String tipobase;

	private Integer tipobasenum;

	//bi-directional many-to-one association to Partido
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_partido", nullable=false)
	private Partido partido;

	//bi-directional many-to-one association to Localizacao
	@OneToMany(mappedBy="base")
	private Set<Localizacao> localizacaos;

	public Base() {
	}

	public Integer getIdBase() {
		return this.idBase;
	}

	public void setIdBase(Integer idBase) {
		this.idBase = idBase;
	}

	public double getCaladomaximo() {
		return this.caladomaximo;
	}

	public void setCaladomaximo(double caladomaximo) {
		this.caladomaximo = caladomaximo;
	}

	public double getCapachangaragem() {
		return this.capachangaragem;
	}

	public void setCapachangaragem(double capachangaragem) {
		this.capachangaragem = capachangaragem;
	}

	public String getClassereparo() {
		return this.classereparo;
	}

	public void setClassereparo(String classereparo) {
		this.classereparo = classereparo;
	}

	public double getExtensaocais() {
		return this.extensaocais;
	}

	public void setExtensaocais(double extensaocais) {
		this.extensaocais = extensaocais;
	}

	public String getFacilidadereparo() {
		return this.facilidadereparo;
	}

	public void setFacilidadereparo(String facilidadereparo) {
		this.facilidadereparo = facilidadereparo;
	}

	public Integer getFundeadcaladomax() {
		return this.fundeadcaladomax;
	}

	public void setFundeadcaladomax(Integer fundeadcaladomax) {
		this.fundeadcaladomax = fundeadcaladomax;
	}

	public Integer getFundeadnummaxnavio() {
		return this.fundeadnummaxnavio;
	}

	public void setFundeadnummaxnavio(Integer fundeadnummaxnavio) {
		this.fundeadnummaxnavio = fundeadnummaxnavio;
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

	public String getTipobase() {
		return this.tipobase;
	}

	public void setTipobase(String tipobase) {
		this.tipobase = tipobase;
	}

	public Integer getTipobasenum() {
		return this.tipobasenum;
	}

	public void setTipobasenum(Integer tipobasenum) {
		this.tipobasenum = tipobasenum;
	}

	public Partido getPartido() {
		return this.partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Set<Localizacao> getLocalizacaos() {
		return this.localizacaos;
	}

	public void setLocalizacaos(Set<Localizacao> localizacaos) {
		this.localizacaos = localizacaos;
	}

	public Localizacao addLocalizacao(Localizacao localizacao) {
		getLocalizacaos().add(localizacao);
		localizacao.setBase(this);

		return localizacao;
	}

	public Localizacao removeLocalizacao(Localizacao localizacao) {
		getLocalizacaos().remove(localizacao);
		localizacao.setBase(null);

		return localizacao;
	}

}