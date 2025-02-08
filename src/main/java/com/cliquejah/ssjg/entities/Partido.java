package com.cliquejah.ssjg.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Set;


/**
 * The persistent class for the partido database table.
 * 
 */
@Entity
@Table(name="partido")
@NamedQuery(name="Partido.findAll", query="SELECT p FROM Partido p")
public class Partido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_partido", unique=true, nullable=false)
	private Integer idPartido;

	@Column(nullable=false)
	private Integer codigocor;

	@Column(length=1)
	private String neutro;

	@Column(length=255)
	private String nome;

	@Column(length=255)
	private String nomecor;

	//bi-directional many-to-one association to Base
	@OneToMany(mappedBy="partido")
	private Set<Base> bases;

	//bi-directional many-to-one association to MeioSimulado
	@OneToMany(mappedBy="partido")
	private Set<MeioSimulado> meiosimulados;

	public Partido() {
	}

	public Integer getIdPartido() {
		return this.idPartido;
	}

	public void setIdPartido(Integer idPartido) {
		this.idPartido = idPartido;
	}

	public Integer getCodigocor() {
		return this.codigocor;
	}

	public void setCodigocor(Integer codigocor) {
		this.codigocor = codigocor;
	}

	public String getNeutro() {
		return this.neutro;
	}

	public void setNeutro(String neutro) {
		this.neutro = neutro;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomecor() {
		return this.nomecor;
	}

	public void setNomecor(String nomecor) {
		this.nomecor = nomecor;
	}

	public Set<Base> getBases() {
		return this.bases;
	}

	public void setBases(Set<Base> bases) {
		this.bases = bases;
	}

	public Base addBas(Base bas) {
		getBases().add(bas);
		bas.setPartido(this);

		return bas;
	}

	public Base removeBas(Base bas) {
		getBases().remove(bas);
		bas.setPartido(null);

		return bas;
	}

	public Set<MeioSimulado> getMeiosimulados() {
		return this.meiosimulados;
	}

	public void setMeiosimulados(Set<MeioSimulado> meiosimulados) {
		this.meiosimulados = meiosimulados;
	}

	public MeioSimulado addMeiosimulado(MeioSimulado meiosimulado) {
		getMeiosimulados().add(meiosimulado);
		meiosimulado.setPartido(this);

		return meiosimulado;
	}

	public MeioSimulado removeMeiosimulado(MeioSimulado meiosimulado) {
		getMeiosimulados().remove(meiosimulado);
		meiosimulado.setPartido(null);

		return meiosimulado;
	}

}