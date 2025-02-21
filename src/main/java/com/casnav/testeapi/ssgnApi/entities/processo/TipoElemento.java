package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tipo_Elemento", schema = "Processo")
public class TipoElemento {
    @Id
    @Column(name = "Id_Tipo_Elemento", nullable = false)
    private Long id;

    @Column(name = "Nome_Descricao", nullable = false, length = 50)
    private String nomeDescricao;

    @Column(name = "fl_movimento", nullable = false)
    private Boolean flMovimento = false;

    @Column(name = "fl_reclog", nullable = false)
    private Boolean flReclog = false;

    @Column(name = "fl_dot_sensor", nullable = false)
    private Boolean flDotSensor = false;

    @Column(name = "fl_possui_partido")
    private Boolean flPossuiPartido;

    @Column(name = "fl_dot_armamento", nullable = false)
    private Boolean flDotArmamento = false;

    public Long getId() {
        return id;
    }

    public TipoElemento setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNomeDescricao() {
        return nomeDescricao;
    }

    public TipoElemento setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
        return this;
    }

    public Boolean getFlMovimento() {
        return flMovimento;
    }

    public TipoElemento setFlMovimento(Boolean flMovimento) {
        this.flMovimento = flMovimento;
        return this;
    }

    public Boolean getFlReclog() {
        return flReclog;
    }

    public TipoElemento setFlReclog(Boolean flReclog) {
        this.flReclog = flReclog;
        return this;
    }

    public Boolean getFlDotSensor() {
        return flDotSensor;
    }

    public TipoElemento setFlDotSensor(Boolean flDotSensor) {
        this.flDotSensor = flDotSensor;
        return this;
    }

    public Boolean getFlPossuiPartido() {
        return flPossuiPartido;
    }

    public TipoElemento setFlPossuiPartido(Boolean flPossuiPartido) {
        this.flPossuiPartido = flPossuiPartido;
        return this;
    }

    public Boolean getFlDotArmamento() {
        return flDotArmamento;
    }

    public TipoElemento setFlDotArmamento(Boolean flDotArmamento) {
        this.flDotArmamento = flDotArmamento;
        return this;
    }

}