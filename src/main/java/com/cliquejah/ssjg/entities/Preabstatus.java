package com.cliquejah.ssjg.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the preabstatus database table.
 * 
 */
@Entity
@Table(name="preabstatus")
@NamedQuery(name="Preabstatus.findAll", query="SELECT p FROM Preabstatus p")
public class Preabstatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"PreabStatusId\"", unique=true, nullable=false)
	private Integer preabStatusId;

	@Column(name="\"PreabStatus\"", length=255)
	private String preabStatus;

	public Preabstatus() {
	}

	public Integer getPreabStatusId() {
		return this.preabStatusId;
	}

	public void setPreabStatusId(Integer preabStatusId) {
		this.preabStatusId = preabStatusId;
	}

	public String getPreabStatus() {
		return this.preabStatus;
	}

	public void setPreabStatus(String preabStatus) {
		this.preabStatus = preabStatus;
	}

}