package com.casnav.testeapi.ssgnApi.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the bomba database table.
 * 
 */
@Entity
@Table(name="bomba")
@NamedQuery(name="Bomba.findAll", query="SELECT b FROM Bomba b")
public class Bomba2 implements Serializable {
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

	@Column(name="\"PAI\"")
	private double pai;

	@Column(name="\"TipoBomba\"", length=50)
	private String tipoBomba;

	@Column(name="\"Trigrama\"", length=3)
	private String trigrama;

	//bi-directional one-to-one association to Armamento
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_armamento", nullable=false, insertable=false, updatable=false)
	private Armamento2 armamento;

	public Bomba2() {
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

	public double getPai() {
		return this.pai;
	}

	public void setPai(double pai) {
		this.pai = pai;
	}

	public String getTipoBomba() {
		return this.tipoBomba;
	}

	public void setTipoBomba(String tipoBomba) {
		this.tipoBomba = tipoBomba;
	}

	public String getTrigrama() {
		return this.trigrama;
	}

	public void setTrigrama(String trigrama) {
		this.trigrama = trigrama;
	}

	public Armamento2 getArmamento() {
		return this.armamento;
	}

	public void setArmamento(Armamento2 armamento) {
		this.armamento = armamento;
	}

}