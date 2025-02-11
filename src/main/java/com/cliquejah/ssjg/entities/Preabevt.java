package com.cliquejah.ssjg.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the preabevt database table.
 * 
 */
@Entity
@Table(name="preabevt")
@NamedQuery(name="Preabevt.findAll", query="SELECT p FROM Preabevt p")
public class Preabevt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"PreabEvtId\"", unique=true, nullable=false)
	private Integer preabEvtId;

	@Column(name="\"ArmamentoId\"")
	private Integer armamentoId;

	@Column(name="\"ArmamentoNome\"", length=255)
	private String armamentoNome;

	@Column(name="\"CombMunic\"", length=255)
	private String combMunic;

	@Column(name="\"CombMunicId\"")
	private Integer combMunicId;

	@Column(name="\"fimMov\"", nullable=false)
	private Timestamp fimMov;

	@Column(name="\"FornecedorBasePlat\"", length=255)
	private String fornecedorBasePlat;

	@Column(name="\"FornecedorBasePlatId\"")
	private Integer fornecedorBasePlatId;

	@Column(name="\"inicioMov\"", nullable=false)
	private Timestamp inicioMov;

	@Column(name="\"PreabId\"", nullable=false)
	private Integer preabId;

	@Column(name="\"Quant\"", nullable=false)
	private double quant;

	@Column(name="\"RecebedorBasePlat\"", length=255)
	private String recebedorBasePlat;

	@Column(name="\"RecebedorBasePlatId\"")
	private Integer recebedorBasePlatId;

	@Column(name="\"RecursoLogistico\"", length=255)
	private String recursoLogistico;

	@Column(name="\"TipoFornecedor\"", length=255)
	private String tipoFornecedor;

	@Column(name="\"TipoRecebedor\"", length=255)
	private String tipoRecebedor;

	public Preabevt() {
	}

	public Integer getPreabEvtId() {
		return this.preabEvtId;
	}

	public void setPreabEvtId(Integer preabEvtId) {
		this.preabEvtId = preabEvtId;
	}

	public Integer getArmamentoId() {
		return this.armamentoId;
	}

	public void setArmamentoId(Integer armamentoId) {
		this.armamentoId = armamentoId;
	}

	public String getArmamentoNome() {
		return this.armamentoNome;
	}

	public void setArmamentoNome(String armamentoNome) {
		this.armamentoNome = armamentoNome;
	}

	public String getCombMunic() {
		return this.combMunic;
	}

	public void setCombMunic(String combMunic) {
		this.combMunic = combMunic;
	}

	public Integer getCombMunicId() {
		return this.combMunicId;
	}

	public void setCombMunicId(Integer combMunicId) {
		this.combMunicId = combMunicId;
	}

	public Timestamp getFimMov() {
		return this.fimMov;
	}

	public void setFimMov(Timestamp fimMov) {
		this.fimMov = fimMov;
	}

	public String getFornecedorBasePlat() {
		return this.fornecedorBasePlat;
	}

	public void setFornecedorBasePlat(String fornecedorBasePlat) {
		this.fornecedorBasePlat = fornecedorBasePlat;
	}

	public Integer getFornecedorBasePlatId() {
		return this.fornecedorBasePlatId;
	}

	public void setFornecedorBasePlatId(Integer fornecedorBasePlatId) {
		this.fornecedorBasePlatId = fornecedorBasePlatId;
	}

	public Timestamp getInicioMov() {
		return this.inicioMov;
	}

	public void setInicioMov(Timestamp inicioMov) {
		this.inicioMov = inicioMov;
	}

	public Integer getPreabId() {
		return this.preabId;
	}

	public void setPreabId(Integer preabId) {
		this.preabId = preabId;
	}

	public double getQuant() {
		return this.quant;
	}

	public void setQuant(double quant) {
		this.quant = quant;
	}

	public String getRecebedorBasePlat() {
		return this.recebedorBasePlat;
	}

	public void setRecebedorBasePlat(String recebedorBasePlat) {
		this.recebedorBasePlat = recebedorBasePlat;
	}

	public Integer getRecebedorBasePlatId() {
		return this.recebedorBasePlatId;
	}

	public void setRecebedorBasePlatId(Integer recebedorBasePlatId) {
		this.recebedorBasePlatId = recebedorBasePlatId;
	}

	public String getRecursoLogistico() {
		return this.recursoLogistico;
	}

	public void setRecursoLogistico(String recursoLogistico) {
		this.recursoLogistico = recursoLogistico;
	}

	public String getTipoFornecedor() {
		return this.tipoFornecedor;
	}

	public void setTipoFornecedor(String tipoFornecedor) {
		this.tipoFornecedor = tipoFornecedor;
	}

	public String getTipoRecebedor() {
		return this.tipoRecebedor;
	}

	public void setTipoRecebedor(String tipoRecebedor) {
		this.tipoRecebedor = tipoRecebedor;
	}

}