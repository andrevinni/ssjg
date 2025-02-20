package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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