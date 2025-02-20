package com.casnav.testeapi.ssgnApi.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the missil database table.
 * 
 */
@Entity
@Table(name="missil")
@NamedQuery(name="Missil.findAll", query="SELECT m FROM Missil m")
public class Missil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_armamento", unique=true, nullable=false)
	private Integer idArmamento;

	@Column(name="\"AgenteLancadorAbrev\"", length=10)
	private String agenteLancadorAbrev;

	@Column(name="\"AlcanceEficaz\"")
	private double alcanceEficaz;

	@Column(name="\"NomeGuiagemAbrev\"", length=50)
	private String nomeGuiagemAbrev;

	@Column(name="\"PAA\"")
	private double paa;

	@Column(name="\"PAI\"")
	private double pai;

	@Column(name="\"PAM\"")
	private double pam;

	@Column(name="\"TipoMissil\"", length=50)
	private String tipoMissil;

	@Column(name="\"TipoMissilNum\"")
	private Integer tipoMissilNum;

	@Column(name="\"Trigrama\"", length=3)
	private String trigrama;

	@Column(name="\"Veloc\"")
	private double veloc;

	//bi-directional one-to-one association to Armamento
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_armamento", nullable=false, insertable=false, updatable=false)
	private Armamento armamento;

	public Missil() {
	}

	public Integer getIdArmamento() {
		return this.idArmamento;
	}

	public void setIdArmamento(Integer idArmamento) {
		this.idArmamento = idArmamento;
	}

	public String getAgenteLancadorAbrev() {
		return this.agenteLancadorAbrev;
	}

	public void setAgenteLancadorAbrev(String agenteLancadorAbrev) {
		this.agenteLancadorAbrev = agenteLancadorAbrev;
	}

	public double getAlcanceEficaz() {
		return this.alcanceEficaz;
	}

	public void setAlcanceEficaz(double alcanceEficaz) {
		this.alcanceEficaz = alcanceEficaz;
	}

	public String getNomeGuiagemAbrev() {
		return this.nomeGuiagemAbrev;
	}

	public void setNomeGuiagemAbrev(String nomeGuiagemAbrev) {
		this.nomeGuiagemAbrev = nomeGuiagemAbrev;
	}

	public double getPaa() {
		return this.paa;
	}

	public void setPaa(double paa) {
		this.paa = paa;
	}

	public double getPai() {
		return this.pai;
	}

	public void setPai(double pai) {
		this.pai = pai;
	}

	public double getPam() {
		return this.pam;
	}

	public void setPam(double pam) {
		this.pam = pam;
	}

	public String getTipoMissil() {
		return this.tipoMissil;
	}

	public void setTipoMissil(String tipoMissil) {
		this.tipoMissil = tipoMissil;
	}

	public Integer getTipoMissilNum() {
		return this.tipoMissilNum;
	}

	public void setTipoMissilNum(Integer tipoMissilNum) {
		this.tipoMissilNum = tipoMissilNum;
	}

	public String getTrigrama() {
		return this.trigrama;
	}

	public void setTrigrama(String trigrama) {
		this.trigrama = trigrama;
	}

	public double getVeloc() {
		return this.veloc;
	}

	public void setVeloc(double veloc) {
		this.veloc = veloc;
	}

	public Armamento getArmamento() {
		return this.armamento;
	}

	public void setArmamento(Armamento armamento) {
		this.armamento = armamento;
	}

}