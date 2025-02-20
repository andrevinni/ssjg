package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EspecificacaoRecurso", schema = "Processo")
public class EspecificacaoRecurso {
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

    public EspecificacaoRecurso setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getIdClassificacaorecurso() {
        return idClassificacaorecurso;
    }

    public EspecificacaoRecurso setIdClassificacaorecurso(Long idClassificacaorecurso) {
        this.idClassificacaorecurso = idClassificacaorecurso;
        return this;
    }

    public Long getIdArmamanento() {
        return idArmamanento;
    }

    public EspecificacaoRecurso setIdArmamanento(Long idArmamanento) {
        this.idArmamanento = idArmamanento;
        return this;
    }

    public Long getIdSensor() {
        return idSensor;
    }

    public EspecificacaoRecurso setIdSensor(Long idSensor) {
        this.idSensor = idSensor;
        return this;
    }

}