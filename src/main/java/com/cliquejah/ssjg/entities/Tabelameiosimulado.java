package com.cliquejah.ssjg.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the tabelameiosimulado database table.
 * 
 */
@Entity
@Table(name="tabelameiosimulado")
@NamedQuery(name="Tabelameiosimulado.findAll", query="SELECT t FROM Tabelameiosimulado t")
public class Tabelameiosimulado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"TabelaMeioSimulado\"", unique=true, nullable=false, length=50)
	private String tabelaMeioSimulado;

	public Tabelameiosimulado() {
	}

	public String getTabelaMeioSimulado() {
		return this.tabelaMeioSimulado;
	}

	public void setTabelaMeioSimulado(String tabelaMeioSimulado) {
		this.tabelaMeioSimulado = tabelaMeioSimulado;
	}

}