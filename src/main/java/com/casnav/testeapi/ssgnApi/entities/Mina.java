package com.casnav.testeapi.ssgnApi.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the mina database table.
 * 
 */
@Entity
@Table(name="mina")
@NamedQuery(name="Mina.findAll", query="SELECT m FROM Mina m")
public class Mina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_armamento", unique=true, nullable=false)
	private Integer idArmamento;

	@Column(name="\"AgenteLancadorAbrev\"", length=10)
	private String agenteLancadorAbrev;

	@Column(name="\"AtuacaoArmamentoAbrev\"", length=50)
	private String atuacaoArmamentoAbrev;

	@Column(name="\"Peso\"", nullable=false)
	private double peso;

	@Column(name="\"Profundidade\"", length=50)
	private String profundidade;

	@Column(name="\"TipoAlvo\"", length=50)
	private String tipoAlvo;

	@Column(name="\"TipoMina\"", length=50)
	private String tipoMina;

	//bi-directional one-to-one association to Armamento
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_armamento", nullable=false, insertable=false, updatable=false)
	private Armamento armamento;

	public Mina() {
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

	public String getAtuacaoArmamentoAbrev() {
		return this.atuacaoArmamentoAbrev;
	}

	public void setAtuacaoArmamentoAbrev(String atuacaoArmamentoAbrev) {
		this.atuacaoArmamentoAbrev = atuacaoArmamentoAbrev;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getProfundidade() {
		return this.profundidade;
	}

	public void setProfundidade(String profundidade) {
		this.profundidade = profundidade;
	}

	public String getTipoAlvo() {
		return this.tipoAlvo;
	}

	public void setTipoAlvo(String tipoAlvo) {
		this.tipoAlvo = tipoAlvo;
	}

	public String getTipoMina() {
		return this.tipoMina;
	}

	public void setTipoMina(String tipoMina) {
		this.tipoMina = tipoMina;
	}

	public Armamento getArmamento() {
		return this.armamento;
	}

	public void setArmamento(Armamento armamento) {
		this.armamento = armamento;
	}

}