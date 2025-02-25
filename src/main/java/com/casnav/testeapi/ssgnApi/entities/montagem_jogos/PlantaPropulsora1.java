package com.casnav.testeapi.ssgnApi.entities.montagem_jogos;

import jakarta.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity(name = "PlantaPropulsora1")
@Table(name = "PlantaPropulsora1", schema = "montagem_jogos")
public class PlantaPropulsora1 {
    @Id
    @Column(name = "Id_PlantaPropulsora", nullable = false)
    private Integer id;

    @Column(name = "TipoPlanta", length = 5)
    private String tipoPlanta;

    @Column(name = "Descricao", length = 50)
    private String descricao;

    @Column(name = "DesignacaoPlanta", length = 15)
    private String designacaoPlanta;

    @OneToMany(mappedBy = "idPlantapropulsora")
    private Set<ClasseNavio> classeNavios = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public PlantaPropulsora1 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public PlantaPropulsora1 setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public PlantaPropulsora1 setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getDesignacaoPlanta() {
        return designacaoPlanta;
    }

    public PlantaPropulsora1 setDesignacaoPlanta(String designacaoPlanta) {
        this.designacaoPlanta = designacaoPlanta;
        return this;
    }

    public Set<ClasseNavio> getClasseNavios() {
        return classeNavios;
    }

    public PlantaPropulsora1 setClasseNavios(Set<ClasseNavio> classeNavios) {
        this.classeNavios = classeNavios;
        return this;
    }

}