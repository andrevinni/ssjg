package com.cliquejah.ssjg.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the armamento database table.
 * 
 */
@Entity
@Table(name="armamento")
@NamedQuery(name="Armamento.findAll", query="SELECT a FROM Armamento a")
public class Armamento implements Serializable {
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
	private Bomba bomba;

	//bi-directional one-to-one association to Canhao
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Canhao canhao;

	//bi-directional one-to-one association to Foguete
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Foguete foguete;

	//bi-directional one-to-one association to Mina
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Mina mina;

	//bi-directional one-to-one association to Missil
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Missil missil;

	//bi-directional one-to-one association to Torpedo
	@OneToOne(mappedBy="armamento", fetch=FetchType.LAZY)
	private Torpedo torpedo;

	public Armamento() {
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

	public Bomba getBomba() {
		return this.bomba;
	}

	public void setBomba(Bomba bomba) {
		this.bomba = bomba;
	}

	public Canhao getCanhao() {
		return this.canhao;
	}

	public void setCanhao(Canhao canhao) {
		this.canhao = canhao;
	}

	public Foguete getFoguete() {
		return this.foguete;
	}

	public void setFoguete(Foguete foguete) {
		this.foguete = foguete;
	}

	public Mina getMina() {
		return this.mina;
	}

	public void setMina(Mina mina) {
		this.mina = mina;
	}

	public Missil getMissil() {
		return this.missil;
	}

	public void setMissil(Missil missil) {
		this.missil = missil;
	}

	public Torpedo getTorpedo() {
		return this.torpedo;
	}

	public void setTorpedo(Torpedo torpedo) {
		this.torpedo = torpedo;
	}

}