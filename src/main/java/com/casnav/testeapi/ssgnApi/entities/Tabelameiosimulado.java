package com.casnav.testeapi.ssgnApi.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;


/**
 * The persistent class for the tabelameiosimulado database table.
 * 
 */
@Entity
@Table(name="Tabelameiosimulado")
@NamedQuery(name="Tabelameiosimulado.findAll", query="SELECT t FROM Tabelameiosimulado t")
public class Tabelameiosimulado implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tabela_meio_simulado", unique=true, nullable=false)
	private Integer idTabelaMeioSimulado;
	
	@Column(name="\"TabelaMeioSimulado\"", unique=true, nullable=false, length=50)
	private String tabelaMeioSimulado;

	public Tabelameiosimulado() {
	}
	
	public Tabelameiosimulado(Integer idTabelaMeioSimulado, String tabelaMeioSimulado) {
		super();
		this.idTabelaMeioSimulado = idTabelaMeioSimulado;
		this.tabelaMeioSimulado = tabelaMeioSimulado;
	}

	public Integer getIdTabelaMeioSimulado() {
		return idTabelaMeioSimulado;
	}

	public void setIdTabelaMeioSimulado(Integer idTabelaMeioSimulado) {
		this.idTabelaMeioSimulado = idTabelaMeioSimulado;
	}

	public String getTabelaMeioSimulado() {
		return this.tabelaMeioSimulado;
	}

	public void setTabelaMeioSimulado(String tabelaMeioSimulado) {
		this.tabelaMeioSimulado = tabelaMeioSimulado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTabelaMeioSimulado, tabelaMeioSimulado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tabelameiosimulado other = (Tabelameiosimulado) obj;
		return Objects.equals(idTabelaMeioSimulado, other.idTabelaMeioSimulado)
				&& Objects.equals(tabelaMeioSimulado, other.tabelaMeioSimulado);
	}

}