package com.casnav.testeapi.ssgnApi.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the preab database table.
 * 
 */
@Entity
@Table(name="preab")
@NamedQuery(name="Preab.findAll", query="SELECT p FROM Preab p")
public class Preab implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"PreabId\"", unique=true, nullable=false)
	private Integer preabId;

	@Column(name="\"fimMov\"", nullable=false)
	private Timestamp fimMov;

	@Column(name="\"Forca\"", length=255)
	private String forca;

	@Column(name="\"inicioMov\"", nullable=false)
	private Timestamp inicioMov;

	@Column(name="\"PreabStatusId\"", nullable=false)
	private Integer preabStatusId;

	@Column(length=255)
	private String sala;

	public Preab() {
	}

	public Integer getPreabId() {
		return this.preabId;
	}

	public void setPreabId(Integer preabId) {
		this.preabId = preabId;
	}

	public Timestamp getFimMov() {
		return this.fimMov;
	}

	public void setFimMov(Timestamp fimMov) {
		this.fimMov = fimMov;
	}

	public String getForca() {
		return this.forca;
	}

	public void setForca(String forca) {
		this.forca = forca;
	}

	public Timestamp getInicioMov() {
		return this.inicioMov;
	}

	public void setInicioMov(Timestamp inicioMov) {
		this.inicioMov = inicioMov;
	}

	public Integer getPreabStatusId() {
		return this.preabStatusId;
	}

	public void setPreabStatusId(Integer preabStatusId) {
		this.preabStatusId = preabStatusId;
	}

	public String getSala() {
		return this.sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

}