package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "DetalheAlocacaoLogistica")
@Table(name = "Detalhe_Alocacao_Logistica", schema = "Dominio")
public class DetalheAlocacaoLogistica {
    @Id
    @Column(name = "Id_Alocacao_Recurso", nullable = false)
    private Long id;

    @Column(name = "Categoria", length = 10)
    private String categoria;

    @Column(name = "CapacArmazenamento", nullable = false)
    private Double capacArmazenamento;

    @Column(name = "NumeroTomadas", nullable = false)
    private Integer numeroTomadas;

    @Column(name = "NumeroTanques", nullable = false)
    private Integer numeroTanques;

    @Column(name = "CapacMaxTanque")
    private Integer capacMaxTanque;

    @Column(name = "VazaoFNC", nullable = false)
    private Integer vazaoFNC;

    @Column(name = "VazaoRCB", nullable = false)
    private Integer vazaoRCB;

    @Column(name = "Reparo", length = 50)
    private String reparo;

    public Long getId() {
        return id;
    }

    public DetalheAlocacaoLogistica setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCategoria() {
        return categoria;
    }

    public DetalheAlocacaoLogistica setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public Double getCapacArmazenamento() {
        return capacArmazenamento;
    }

    public DetalheAlocacaoLogistica setCapacArmazenamento(Double capacArmazenamento) {
        this.capacArmazenamento = capacArmazenamento;
        return this;
    }

    public Integer getNumeroTomadas() {
        return numeroTomadas;
    }

    public DetalheAlocacaoLogistica setNumeroTomadas(Integer numeroTomadas) {
        this.numeroTomadas = numeroTomadas;
        return this;
    }

    public Integer getNumeroTanques() {
        return numeroTanques;
    }

    public DetalheAlocacaoLogistica setNumeroTanques(Integer numeroTanques) {
        this.numeroTanques = numeroTanques;
        return this;
    }

    public Integer getCapacMaxTanque() {
        return capacMaxTanque;
    }

    public DetalheAlocacaoLogistica setCapacMaxTanque(Integer capacMaxTanque) {
        this.capacMaxTanque = capacMaxTanque;
        return this;
    }

    public Integer getVazaoFNC() {
        return vazaoFNC;
    }

    public DetalheAlocacaoLogistica setVazaoFNC(Integer vazaoFNC) {
        this.vazaoFNC = vazaoFNC;
        return this;
    }

    public Integer getVazaoRCB() {
        return vazaoRCB;
    }

    public DetalheAlocacaoLogistica setVazaoRCB(Integer vazaoRCB) {
        this.vazaoRCB = vazaoRCB;
        return this;
    }

    public String getReparo() {
        return reparo;
    }

    public DetalheAlocacaoLogistica setReparo(String reparo) {
        this.reparo = reparo;
        return this;
    }

}