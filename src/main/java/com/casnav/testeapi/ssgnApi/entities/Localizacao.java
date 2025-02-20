package com.casnav.testeapi.ssgnApi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;


/**
 * The persistent class for the localizacao database table.
 * 
 */
@Entity
@Table(name="localizacao")
@NamedQuery(name="Localizacao.findAll", query="SELECT l FROM Localizacao l")
public class Localizacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_localizacao", unique=true, nullable=false)
	private Integer idLocalizacao;

	//bi-directional many-to-one association to Base
	//@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="id_base", referencedColumnName = "id_base")
	private Base base;
	
	//bi-directional many-to-one association to MeioSimulado
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_meiosimulado_plataer")
	private MeioSimulado meiosimuladoplataer;

	//bi-directional many-to-one association to MeioSimulado
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_meiosimulado_platsub")
	private MeioSimulado meiosimuladoplatsub;

	//bi-directional many-to-one association to MeioSimulado
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_meiosimulado_platsup")
	private MeioSimulado meiosimuladoplatsup;

	//bi-directional many-to-one association to MeioSimulado
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_meiosimulado_platterra")
	private MeioSimulado meiosimuladoplatterra;
	
	//@JsonIgnore
	@OneToMany(/*mappedBy = "Localizacao",*/ fetch = FetchType.LAZY)
	@JsonManagedReference
	//private Set<Recursoslogistico> recursosLogisticos = new HashSet<>();
	private List<Recursoslogistico> recursosLogisticos = new ArrayList<Recursoslogistico>();
	

	public Localizacao() {
	}

	public Integer getIdLocalizacao() {
		return this.idLocalizacao;
	}

	public void setIdLocalizacao(Integer idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}

	public Base getBase() {
		return this.base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	public MeioSimulado getMeioSimuladoPlatAer() {
		return this.meiosimuladoplataer;
	}

	public void setMeioSimuladorPlatAer(MeioSimulado meiosimuladoplataer) {
		this.meiosimuladoplataer = meiosimuladoplataer;
	}

	public MeioSimulado getMeioSimuladorPlatSub() {
		return this.meiosimuladoplatsub;
	}

	public void setMeioSimuladorPlatSub(MeioSimulado meiosimuladoplatsub) {
		this.meiosimuladoplatsub = meiosimuladoplatsub;
	}

	public MeioSimulado getMeioSimuladorPlatSup() {
		return this.meiosimuladoplatsup;
	}

	public void setMeioSimuladorPlatSup(MeioSimulado meiosimuladoplatsup) {
		this.meiosimuladoplatsup = meiosimuladoplatsup;
	}

	public MeioSimulado getMeioSimuladorPlatTerra() {
		return this.meiosimuladoplatterra;
	}

	public void setMeioSimuladorPlatTerra(MeioSimulado meiosimuladoplatterra) {
		this.meiosimuladoplatterra = meiosimuladoplatterra;
	}

	public List<Recursoslogistico> getRecursosLogisticos() {
		return recursosLogisticos;
	}

	public void setRecursosLogisticos(List<Recursoslogistico> recursosLogisticos) {
		this.recursosLogisticos = recursosLogisticos;
	}

}