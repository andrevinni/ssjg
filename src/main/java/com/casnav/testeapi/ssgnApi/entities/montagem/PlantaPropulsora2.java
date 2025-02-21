package com.casnav.testeapi.ssgnApi.entities.montagem;

import jakarta.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity(name = "PlantaPropulsora2")
@Table(name = "PlantaPropulsora2", schema = "Montagem_Jogos")
public class PlantaPropulsora2 {
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

    public PlantaPropulsora2 setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public PlantaPropulsora2 setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public PlantaPropulsora2 setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getDesignacaoPlanta() {
        return designacaoPlanta;
    }

    public PlantaPropulsora2 setDesignacaoPlanta(String designacaoPlanta) {
        this.designacaoPlanta = designacaoPlanta;
        return this;
    }

    public Set<ClasseNavio> getClasseNavios() {
        return classeNavios;
    }

    public PlantaPropulsora2 setClasseNavios(Set<ClasseNavio> classeNavios) {
        this.classeNavios = classeNavios;
        return this;
    }

}