package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Sensor")
@Table(schema = "Dominio")
public class Sensor {
    @Id
    @Column(name = "Id_Sensor", nullable = false)
    private Long id;

    @Column(name = "TipoSensor", nullable = false, length = 50)
    private String tipoSensor;

    @Column(name = "Nome", length = 50)
    private String nome;

    @Column(name = "AlcanceMaximo")
    private Double alcanceMaximo;

    @Column(name = "Emprego", length = 50)
    private String emprego;

    @Column(name = "ModoOperacao", nullable = false, length = 50)
    private String modoOperacao;

    @Column(name = "Id_EmpregoSensor")
    private Integer idEmpregosensor;

    public Long getId() {
        return id;
    }

    public Sensor setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public Sensor setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Sensor setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Double getAlcanceMaximo() {
        return alcanceMaximo;
    }

    public Sensor setAlcanceMaximo(Double alcanceMaximo) {
        this.alcanceMaximo = alcanceMaximo;
        return this;
    }

    public String getEmprego() {
        return emprego;
    }

    public Sensor setEmprego(String emprego) {
        this.emprego = emprego;
        return this;
    }

    public String getModoOperacao() {
        return modoOperacao;
    }

    public Sensor setModoOperacao(String modoOperacao) {
        this.modoOperacao = modoOperacao;
        return this;
    }

    public Integer getIdEmpregosensor() {
        return idEmpregosensor;
    }

    public Sensor setIdEmpregosensor(Integer idEmpregosensor) {
        this.idEmpregosensor = idEmpregosensor;
        return this;
    }

}