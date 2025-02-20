package com.casnav.testeapi.ssgnApi.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the canhao database table.
 * 
 */
@Entity
@Table(name="canhao")
@NamedQuery(name="Canhao.findAll", query="SELECT c FROM Canhao c")
public class Canhao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_armamento", unique=true, nullable=false)
	private Integer idArmamento;

	@Column(name="\"AlcanceEficaz\"")
	private double alcanceEficaz;

	@Column(name="\"AlcanceMaximo\"")
	private double alcanceMaximo;

	@Column(name="\"CadenciaTiroMantida\"", nullable=false)
	private Integer cadenciaTiroMantida;

	@Column(name="\"CadenciaTiroRapida\"", nullable=false)
	private Integer cadenciaTiroRapida;

	@Column(name="\"CalibreTuboAlma\"", length=50)
	private String calibreTuboAlma;

	@Column(name="\"NumTuboAlma\"", length=50)
	private String numTuboAlma;

	//bi-directional one-to-one association to Armamento
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_armamento", nullable=false, insertable=false, updatable=false)
	private Armamento armamento;

	public Canhao() {
	}

	public Integer getIdArmamento() {
		return this.idArmamento;
	}

	public void setIdArmamento(Integer idArmamento) {
		this.idArmamento = idArmamento;
	}

	public double getAlcanceEficaz() {
		return this.alcanceEficaz;
	}

	public void setAlcanceEficaz(double alcanceEficaz) {
		this.alcanceEficaz = alcanceEficaz;
	}

	public double getAlcanceMaximo() {
		return this.alcanceMaximo;
	}

	public void setAlcanceMaximo(double alcanceMaximo) {
		this.alcanceMaximo = alcanceMaximo;
	}

	public Integer getCadenciaTiroMantida() {
		return this.cadenciaTiroMantida;
	}

	public void setCadenciaTiroMantida(Integer cadenciaTiroMantida) {
		this.cadenciaTiroMantida = cadenciaTiroMantida;
	}

	public Integer getCadenciaTiroRapida() {
		return this.cadenciaTiroRapida;
	}

	public void setCadenciaTiroRapida(Integer cadenciaTiroRapida) {
		this.cadenciaTiroRapida = cadenciaTiroRapida;
	}

	public String getCalibreTuboAlma() {
		return this.calibreTuboAlma;
	}

	public void setCalibreTuboAlma(String calibreTuboAlma) {
		this.calibreTuboAlma = calibreTuboAlma;
	}

	public String getNumTuboAlma() {
		return this.numTuboAlma;
	}

	public void setNumTuboAlma(String numTuboAlma) {
		this.numTuboAlma = numTuboAlma;
	}

	public Armamento getArmamento() {
		return this.armamento;
	}

	public void setArmamento(Armamento armamento) {
		this.armamento = armamento;
	}
}