package com.casnav.testeapi.ssgnApi.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import jakarta.persistence.*;


/**
 * The persistent class for the recursoslogisticos database table.
 * 
 */
@Entity
@Table(name="recursoslogisticos")
@NamedQuery(name="Recursoslogistico.findAll", query="SELECT r FROM Recursoslogistico r")
public class Recursoslogistico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"Id_RecursoLogistico\"", unique=true, nullable=false)
	private Integer id_RecursoLogistico;

	@Column(name="\"CapacArmazenamento\"")
	private double capacArmazenamento;

	@Column(name="\"CapacMaxTanque\"")
	private Integer capacMaxTanque;

	@Column(name="\"Categoria\"", length=255)
	private String categoria;

	@Column(name="\"Id_Armamento\"")
	private Integer id_Armamento;

	//@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	//@JsonUnwrapped
	@JoinColumn(name="id_localizacao", nullable=false)
	private Localizacao Localizacao;

	@Column(name="\"Id_Sensor\"")
	private Integer id_Sensor;

	@Column(name="\"Nome\"", length=255)
	private String nome;

	@Column(name="\"NomeRecLog_Num\"")
	private Integer nomeRecLog_Num;

	@Column(name="\"NumeroTanques\"")
	private Integer numeroTanques;

	@Column(name="\"NumeroTomadas\"")
	private Integer numeroTomadas;

	@Column(name="\"QtdeCONSFNC\"")
	private double qtdeCONSFNC;

	@Column(name="\"QtdeRCB\"")
	private double qtdeRCB;

	@Column(name="\"Tipo\"", length=255)
	private String tipo;

	@Column(name="\"TipoRecLog_Num\"")
	private Integer tipoRecLog_Num;

	@Column(name="\"VazaoFNC\"")
	private Integer vazaoFNC;

	@Column(name="\"VazaoRCB\"")
	private Integer vazaoRCB;
	
	public Recursoslogistico() {
	}

	public Integer getId_RecursoLogistico() {
		return this.id_RecursoLogistico;
	}

	public void setId_RecursoLogistico(Integer id_RecursoLogistico) {
		this.id_RecursoLogistico = id_RecursoLogistico;
	}

	public double getCapacArmazenamento() {
		return this.capacArmazenamento;
	}

	public void setCapacArmazenamento(double capacArmazenamento) {
		this.capacArmazenamento = capacArmazenamento;
	}

	public Integer getCapacMaxTanque() {
		return this.capacMaxTanque;
	}

	public void setCapacMaxTanque(Integer capacMaxTanque) {
		this.capacMaxTanque = capacMaxTanque;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getId_Armamento() {
		return this.id_Armamento;
	}

	public void setId_Armamento(Integer id_Armamento) {
		this.id_Armamento = id_Armamento;
	}

	public Integer getId_Sensor() {
		return this.id_Sensor;
	}

	public void setId_Sensor(Integer id_Sensor) {
		this.id_Sensor = id_Sensor;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNomeRecLog_Num() {
		return this.nomeRecLog_Num;
	}

	public void setNomeRecLog_Num(Integer nomeRecLog_Num) {
		this.nomeRecLog_Num = nomeRecLog_Num;
	}

	public Integer getNumeroTanques() {
		return this.numeroTanques;
	}

	public void setNumeroTanques(Integer numeroTanques) {
		this.numeroTanques = numeroTanques;
	}

	public Integer getNumeroTomadas() {
		return this.numeroTomadas;
	}

	public void setNumeroTomadas(Integer numeroTomadas) {
		this.numeroTomadas = numeroTomadas;
	}

	public double getQtdeCONSFNC() {
		return this.qtdeCONSFNC;
	}

	public void setQtdeCONSFNC(double qtdeCONSFNC) {
		this.qtdeCONSFNC = qtdeCONSFNC;
	}

	public double getQtdeRCB() {
		return this.qtdeRCB;
	}

	public void setQtdeRCB(double qtdeRCB) {
		this.qtdeRCB = qtdeRCB;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getTipoRecLog_Num() {
		return this.tipoRecLog_Num;
	}

	public void setTipoRecLog_Num(Integer tipoRecLog_Num) {
		this.tipoRecLog_Num = tipoRecLog_Num;
	}

	public Integer getVazaoFNC() {
		return this.vazaoFNC;
	}

	public void setVazaoFNC(Integer vazaoFNC) {
		this.vazaoFNC = vazaoFNC;
	}

	public Integer getVazaoRCB() {
		return this.vazaoRCB;
	}

	public void setVazaoRCB(Integer vazaoRCB) {
		this.vazaoRCB = vazaoRCB;
	}

	public Localizacao getLocalizacao() {
		return Localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.Localizacao = localizacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}