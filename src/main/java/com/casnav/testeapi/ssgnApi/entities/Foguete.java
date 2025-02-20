package com.casnav.testeapi.ssgnApi.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the foguete database table.
 * 
 */
@Entity
@Table(name="foguete")
@NamedQuery(name="Foguete.findAll", query="SELECT f FROM Foguete f")
public class Foguete implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_armamento", unique=true, nullable=false)
	private Integer idArmamento;

	@Column(name="\"AgenteLancadorAbrev\"", length=50)
	private String agenteLancadorAbrev;

	@Column(name="\"AlcanceEficaz\"")
	private double alcanceEficaz;

	@Column(name="\"PAI\"", nullable=false)
	private double pai;

	@Column(name="\"Trigrama\"", length=3)
	private String trigrama;

	//bi-directional one-to-one association to Armamento
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_armamento", nullable=false, insertable=false, updatable=false)
	private Armamento armamento;

	public Foguete() {
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

	public double getPai() {
		return this.pai;
	}

	public void setPai(double pai) {
		this.pai = pai;
	}

	public String getTrigrama() {
		return this.trigrama;
	}

	public void setTrigrama(String trigrama) {
		this.trigrama = trigrama;
	}

	public Armamento getArmamento() {
		return this.armamento;
	}

	public void setArmamento(Armamento armamento) {
		this.armamento = armamento;
	}

}