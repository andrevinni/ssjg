package com.casnav.testeapi.ssgnApi.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the torpedo database table.
 * 
 */
@Entity
@Table(name="torpedo")
@NamedQuery(name="Torpedo.findAll", query="SELECT t FROM Torpedo t")
public class Torpedo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_armamento", unique=true, nullable=false)
	private Integer idArmamento;

	@Column(name="\"AgenteLancadorAbrev\"", length=50)
	private String agenteLancadorAbrev;

	@Column(name="\"AlcanceMaximo\"")
	private double alcanceMaximo;

	@Column(name="\"NomeBusca\"", length=50)
	private String nomeBusca;

	@Column(name="\"PAI\"")
	private double pai;

	@Column(name="\"PaiAS\"")
	private double paiAS;

	@Column(name="\"PaiASUP\"")
	private double paiASUP;

	@Column(name="\"ProfundidadeMax\"")
	private Integer profundidadeMax;

	@Column(name="\"TipoTorpedo\"", length=50)
	private String tipoTorpedo;

	@Column(name="\"VelocCorrida\"")
	private Integer velocCorrida;

	//bi-directional one-to-one association to Armamento
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_armamento", nullable=false, insertable=false, updatable=false)
	private Armamento armamento;

	public Torpedo() {
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

	public double getAlcanceMaximo() {
		return this.alcanceMaximo;
	}

	public void setAlcanceMaximo(double alcanceMaximo) {
		this.alcanceMaximo = alcanceMaximo;
	}

	public String getNomeBusca() {
		return this.nomeBusca;
	}

	public void setNomeBusca(String nomeBusca) {
		this.nomeBusca = nomeBusca;
	}

	public double getPai() {
		return this.pai;
	}

	public void setPai(double pai) {
		this.pai = pai;
	}

	public double getPaiAS() {
		return this.paiAS;
	}

	public void setPaiAS(double paiAS) {
		this.paiAS = paiAS;
	}

	public double getPaiASUP() {
		return this.paiASUP;
	}

	public void setPaiASUP(double paiASUP) {
		this.paiASUP = paiASUP;
	}

	public Integer getProfundidadeMax() {
		return this.profundidadeMax;
	}

	public void setProfundidadeMax(Integer profundidadeMax) {
		this.profundidadeMax = profundidadeMax;
	}

	public String getTipoTorpedo() {
		return this.tipoTorpedo;
	}

	public void setTipoTorpedo(String tipoTorpedo) {
		this.tipoTorpedo = tipoTorpedo;
	}

	public Integer getVelocCorrida() {
		return this.velocCorrida;
	}

	public void setVelocCorrida(Integer velocCorrida) {
		this.velocCorrida = velocCorrida;
	}

	public Armamento getArmamento() {
		return this.armamento;
	}

	public void setArmamento(Armamento armamento) {
		this.armamento = armamento;
	}

}