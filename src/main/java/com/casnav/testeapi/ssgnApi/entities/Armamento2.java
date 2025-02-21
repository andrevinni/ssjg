package com.casnav.testeapi.ssgnApi.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the armamento database table.
 * 
 */
@Entity
@Table(name="armamento")
@NamedQuery(name="Armamento.findAll", query="SELECT a FROM Armamento a")
public class Armamento2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_armamento", unique=true, nullable=false)
	private Integer idArmamento;

	@Column(name="\"CargaExplosiva\"")
	private double cargaExplosiva;

	@Column(name="\"EmpregoArmamento\"", length=255)
	private String empregoArmamento;

	@Column(name="\"Nome\"", length=50)
	private String nome;

	@Column(name="\"Observacao\"", length=255)
	private String observacao;

	@Column(name="\"TabelaArmamento\"", length=50)
	private String tabelaArmamento;

	//bi-directional one-to-one association to Armasa
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Armasas armasa;

	//bi-directional one-to-one association to Bomba
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Bomba2 bomba;

	//bi-directional one-to-one association to Canhao
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Canhao2 canhao;

	//bi-directional one-to-one association to Foguete
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Foguete2 foguete;

	//bi-directional one-to-one association to Mina
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Mina2 mina;

	//bi-directional one-to-one association to Missil
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Missil2 missil;

	//bi-directional one-to-one association to Torpedo
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Torpedo2 torpedo;

	public Armamento2() {
	}

	public Integer getIdArmamento() {
		return this.idArmamento;
	}

	public void setIdArmamento(Integer idArmamento) {
		this.idArmamento = idArmamento;
	}

	public double getCargaExplosiva() {
		return this.cargaExplosiva;
	}

	public void setCargaExplosiva(double cargaExplosiva) {
		this.cargaExplosiva = cargaExplosiva;
	}

	public String getEmpregoArmamento() {
		return this.empregoArmamento;
	}

	public void setEmpregoArmamento(String empregoArmamento) {
		this.empregoArmamento = empregoArmamento;
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

	public String getTabelaArmamento() {
		return this.tabelaArmamento;
	}

	public void setTabelaArmamento(String tabelaArmamento) {
		this.tabelaArmamento = tabelaArmamento;
	}

	public Armasas getArmasa() {
		return this.armasa;
	}

	public void setArmasa(Armasas armasa) {
		this.armasa = armasa;
	}

	public Bomba2 getBomba() {
		return this.bomba;
	}

	public void setBomba(Bomba2 bomba) {
		this.bomba = bomba;
	}

	public Canhao2 getCanhao() {
		return this.canhao;
	}

	public void setCanhao(Canhao2 canhao) {
		this.canhao = canhao;
	}

	public Foguete2 getFoguete() {
		return this.foguete;
	}

	public void setFoguete(Foguete2 foguete) {
		this.foguete = foguete;
	}

	public Mina2 getMina() {
		return this.mina;
	}

	public void setMina(Mina2 mina) {
		this.mina = mina;
	}

	public Missil2 getMissil() {
		return this.missil;
	}

	public void setMissil(Missil2 missil) {
		this.missil = missil;
	}

	public Torpedo2 getTorpedo() {
		return this.torpedo;
	}

	public void setTorpedo(Torpedo2 torpedo) {
		this.torpedo = torpedo;
	}

}