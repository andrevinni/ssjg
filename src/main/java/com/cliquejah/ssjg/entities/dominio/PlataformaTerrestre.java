package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "PlataformaTerrestre")
@Table(schema = "Dominio")
public class PlataformaTerrestre extends Elemento {
    @Column(name = "Id_TipoPlatTerrestre")
    private Integer idTipoplatterrestre;

    @Column(name = "Id_SituacaoPlataforma")
    private Integer idSituacaoplataforma;

    @Column(name = "DanoVeloc")
    private Double danoVeloc;

    @Column(name = "DanoSensor")
    private Double danoSensor;

    @Column(name = "VelocMax")
    private Double velocMax;

    @Column(name = "RAVelocMax")
    private Double rAVelocMax;

    @Column(name = "ConsumoVelocMax")
    private Double consumoVelocMax;

    @Column(name = "Id_TipoPropulsao")
    private Integer idTipopropulsao;

    @Column(name = "Id_RecursoPropulsao")
    private Integer idRecursopropulsao;

    @Column(name = "Sigla", length = 10)
    private String sigla;

    @Column(name = "Id_Elemento_Embarcado")
    private Long idElementoEmbarcado;

    public Integer getIdTipoplatterrestre() {
        return idTipoplatterrestre;
    }

    public PlataformaTerrestre setIdTipoplatterrestre(Integer idTipoplatterrestre) {
        this.idTipoplatterrestre = idTipoplatterrestre;
        return this;
    }

    public Integer getIdSituacaoplataforma() {
        return idSituacaoplataforma;
    }

    public PlataformaTerrestre setIdSituacaoplataforma(Integer idSituacaoplataforma) {
        this.idSituacaoplataforma = idSituacaoplataforma;
        return this;
    }

    public Double getDanoVeloc() {
        return danoVeloc;
    }

    public PlataformaTerrestre setDanoVeloc(Double danoVeloc) {
        this.danoVeloc = danoVeloc;
        return this;
    }

    public Double getDanoSensor() {
        return danoSensor;
    }

    public PlataformaTerrestre setDanoSensor(Double danoSensor) {
        this.danoSensor = danoSensor;
        return this;
    }

    public Double getVelocMax() {
        return velocMax;
    }

    public PlataformaTerrestre setVelocMax(Double velocMax) {
        this.velocMax = velocMax;
        return this;
    }

    public Double getRAVelocMax() {
        return rAVelocMax;
    }

    public PlataformaTerrestre setRAVelocMax(Double rAVelocMax) {
        this.rAVelocMax = rAVelocMax;
        return this;
    }

    public Double getConsumoVelocMax() {
        return consumoVelocMax;
    }

    public PlataformaTerrestre setConsumoVelocMax(Double consumoVelocMax) {
        this.consumoVelocMax = consumoVelocMax;
        return this;
    }

    public Integer getIdTipopropulsao() {
        return idTipopropulsao;
    }

    public PlataformaTerrestre setIdTipopropulsao(Integer idTipopropulsao) {
        this.idTipopropulsao = idTipopropulsao;
        return this;
    }

    public Integer getIdRecursopropulsao() {
        return idRecursopropulsao;
    }

    public PlataformaTerrestre setIdRecursopropulsao(Integer idRecursopropulsao) {
        this.idRecursopropulsao = idRecursopropulsao;
        return this;
    }

    public String getSigla() {
        return sigla;
    }

    public PlataformaTerrestre setSigla(String sigla) {
        this.sigla = sigla;
        return this;
    }

    public Long getIdElementoEmbarcado() {
        return idElementoEmbarcado;
    }

    public PlataformaTerrestre setIdElementoEmbarcado(Long idElementoEmbarcado) {
        this.idElementoEmbarcado = idElementoEmbarcado;
        return this;
    }

}