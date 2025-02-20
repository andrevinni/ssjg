package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "Mina")
@Table(schema = "Dominio")
public class Mina {
    @Id
    @Column(name = "ID_Armamento", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Armamento", nullable = false)
    private Armamento armamento;

    @Column(name = "AtuacaoArmamentoAbrev", nullable = false, length = 50)
    private String atuacaoArmamentoAbrev;

    @Column(name = "id_AgenteLancador", nullable = false)
    private Integer idAgentelancador;

    @Column(name = "Peso")
    private Double peso;

    @Column(name = "Profundidade", length = 50)
    private String profundidade;

    @Column(name = "Id_TipoAlvo")
    private Integer idTipoalvo;

    @Column(name = "Id_TipoMina")
    private Integer idTipomina;

    public Long getId() {
        return id;
    }

    public Mina setId(Long id) {
        this.id = id;
        return this;
    }

    public Armamento getArmamento() {
        return armamento;
    }

    public Mina setArmamento(Armamento armamento) {
        this.armamento = armamento;
        return this;
    }

    public String getAtuacaoArmamentoAbrev() {
        return atuacaoArmamentoAbrev;
    }

    public Mina setAtuacaoArmamentoAbrev(String atuacaoArmamentoAbrev) {
        this.atuacaoArmamentoAbrev = atuacaoArmamentoAbrev;
        return this;
    }

    public Integer getIdAgentelancador() {
        return idAgentelancador;
    }

    public Mina setIdAgentelancador(Integer idAgentelancador) {
        this.idAgentelancador = idAgentelancador;
        return this;
    }

    public Double getPeso() {
        return peso;
    }

    public Mina setPeso(Double peso) {
        this.peso = peso;
        return this;
    }

    public String getProfundidade() {
        return profundidade;
    }

    public Mina setProfundidade(String profundidade) {
        this.profundidade = profundidade;
        return this;
    }

    public Integer getIdTipoalvo() {
        return idTipoalvo;
    }

    public Mina setIdTipoalvo(Integer idTipoalvo) {
        this.idTipoalvo = idTipoalvo;
        return this;
    }

    public Integer getIdTipomina() {
        return idTipomina;
    }

    public Mina setIdTipomina(Integer idTipomina) {
        this.idTipomina = idTipomina;
        return this;
    }

}