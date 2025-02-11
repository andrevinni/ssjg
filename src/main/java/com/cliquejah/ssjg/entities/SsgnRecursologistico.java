package com.cliquejah.ssjg.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the ssgn_recursologistico database table.
 * 
 */
@Entity
@Table(name="ssgn_recursologistico")
@NamedQuery(name="SsgnRecursologistico.findAll", query="SELECT s FROM SsgnRecursologistico s")
public class SsgnRecursologistico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"Id_RecursoLogistico\"", nullable=false)
	private Integer id_RecursoLogistico;

	@Column(name="\"Categoria\"", length=10)
	private String categoria;

	@Column(name="\"Nome\"", length=255)
	private String nome;

	public SsgnRecursologistico() {
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getId_RecursoLogistico() {
		return this.id_RecursoLogistico;
	}

	public void setId_RecursoLogistico(Integer id_RecursoLogistico) {
		this.id_RecursoLogistico = id_RecursoLogistico;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}