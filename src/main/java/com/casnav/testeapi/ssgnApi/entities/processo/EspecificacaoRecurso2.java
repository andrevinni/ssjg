package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EspecificacaoRecurso2", schema = "Processo")
public class EspecificacaoRecurso2 {
    @Id
    @Column(name = "Id_EspecificacaoRecurso", nullable = false)
    private Long id;

    @Column(name = "Id_ClassificacaoRecurso")
    private Long idClassificacaorecurso;

    @Column(name = "Id_Armamanento")
    private Long idArmamanento;

    @Column(name = "Id_Sensor")
    private Long idSensor;

    public Long getId() {
        return id;
    }

    public EspecificacaoRecurso2 setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getIdClassificacaorecurso() {
        return idClassificacaorecurso;
    }

    public EspecificacaoRecurso2 setIdClassificacaorecurso(Long idClassificacaorecurso) {
        this.idClassificacaorecurso = idClassificacaorecurso;
        return this;
    }

    public Long getIdArmamanento() {
        return idArmamanento;
    }

    public EspecificacaoRecurso2 setIdArmamanento(Long idArmamanento) {
        this.idArmamanento = idArmamanento;
        return this;
    }

    public Long getIdSensor() {
        return idSensor;
    }

    public EspecificacaoRecurso2 setIdSensor(Long idSensor) {
        this.idSensor = idSensor;
        return this;
    }

}