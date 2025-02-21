package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Dominio_Simulacao", schema = "Dominio")
public class DominioSimulacao {
    @Id
    @Column(name = "Id_Dominio_Simulacao", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public DominioSimulacao setId(Long id) {
        this.id = id;
        return this;
    }

    //TODO [Reverse Engineering] generate columns from DB
}