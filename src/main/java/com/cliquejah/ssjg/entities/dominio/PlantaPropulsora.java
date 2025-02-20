package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "PlantaPropulsora")
@Table(schema = "Dominio")
public class PlantaPropulsora {
    @Id
    @Column(name = "Id_PlantaPropulsora", nullable = false)
    private Integer id;

    @Column(name = "TipoPlanta", length = 5)
    private String tipoPlanta;

    @Column(name = "Descricao", length = 50)
    private String descricao;

    @Column(name = "DesignacaoPlanta", length = 15)
    private String designacaoPlanta;

    public Integer getId() {
        return id;
    }

    public PlantaPropulsora setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public PlantaPropulsora setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public PlantaPropulsora setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getDesignacaoPlanta() {
        return designacaoPlanta;
    }

    public PlantaPropulsora setDesignacaoPlanta(String designacaoPlanta) {
        this.designacaoPlanta = designacaoPlanta;
        return this;
    }

}