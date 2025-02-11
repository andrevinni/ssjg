package com.cliquejah.ssjg.entities;

import java.io.Serializable;
//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
import java.util.Objects;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "Partido")
public class Partido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPartido", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false)
    private String nome;

    @Column(name = "CodigoCor", nullable = false)
    private Integer codigoCor;

    @Column(name = "NomeCor")
    private String nomeCor;

    @Column(name = "Neutro")
    private Character neutro;
    
    public Partido() {
	}

	public Partido(Integer id, String nome, Integer codigoCor, String nomeCor, Character neutro) {
		this.id = id;
		this.nome = nome;
		this.codigoCor = codigoCor;
		this.nomeCor = nomeCor;
		this.neutro = neutro;
	}
	
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCor() {
        return codigoCor;
    }

    public void setCodigoCor(Integer codigoCor) {
        this.codigoCor = codigoCor;
    }

    public String getNomeCor() {
        return nomeCor;
    }

    public void setNomeCor(String nomeCor) {
        this.nomeCor = nomeCor;
    }

    public Character getNeutro() {
        return neutro;
    }

    public void setNeutro(Character neutro) {
        this.neutro = neutro;
    }

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return Objects.equals(id, other.id);
	}
}