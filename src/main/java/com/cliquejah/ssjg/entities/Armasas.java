package com.cliquejah.ssjg.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the armasas database table.
 * 
 */
@Entity
@Table(name="armasas")
@NamedQuery(name="Armasas.findAll", query="SELECT a FROM Armasas a")
public class Armasas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_armamento", unique=true, nullable=false)
	private Integer idArmamento;

	@Column(name="\"AgenteLancadorAbrev\"", length=10)
	private String agenteLancadorAbrev;

	@Column(name="\"AlcanceMaximo\"")
	private double alcanceMaximo;

	@Column(name="\"NumProjSalva\"", nullable=false)
	private Integer numProjSalva;

	@Column(name="\"Tipo_ArmasAS\"", length=50)
	private String tipo_ArmasAS;

	//bi-directional one-to-one association to Armamento
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_armamento", nullable=false, insertable=false, updatable=false)
	private Armamento armamento;

	public Armasas() {
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

	public Integer getNumProjSalva() {
		return this.numProjSalva;
	}

	public void setNumProjSalva(Integer numProjSalva) {
		this.numProjSalva = numProjSalva;
	}

	public String getTipo_ArmasAS() {
		return this.tipo_ArmasAS;
	}

	public void setTipo_ArmasAS(String tipo_ArmasAS) {
		this.tipo_ArmasAS = tipo_ArmasAS;
	}

	public Armamento getArmamento() {
		return this.armamento;
	}

	public void setArmamento(Armamento armamento) {
		this.armamento = armamento;
	}

}