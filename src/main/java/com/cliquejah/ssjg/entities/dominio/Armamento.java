package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Armamento")
@Table(schema = "Dominio")
public class Armamento {
    @Id
    @Column(name = "ID_Armamento", nullable = false)
    private Long id;

    @Column(name = "TabelaArmamento", nullable = false, length = 50)
    private String tabelaArmamento;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "CargaExplosiva")
    private Double cargaExplosiva;

    @Column(name = "Observacao", length = 100)
    private String observacao;

    @Column(name = "Id_EmpregoArmamento")
    private Integer idEmpregoarmamento;

    public Long getId() {
        return id;
    }

    public Armamento setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTabelaArmamento() {
        return tabelaArmamento;
    }

    public Armamento setTabelaArmamento(String tabelaArmamento) {
        this.tabelaArmamento = tabelaArmamento;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Armamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Double getCargaExplosiva() {
        return cargaExplosiva;
    }

    public Armamento setCargaExplosiva(Double cargaExplosiva) {
        this.cargaExplosiva = cargaExplosiva;
        return this;
    }

    public String getObservacao() {
        return observacao;
    }

    public Armamento setObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    public Integer getIdEmpregoarmamento() {
        return idEmpregoarmamento;
    }

    public Armamento setIdEmpregoarmamento(Integer idEmpregoarmamento) {
        this.idEmpregoarmamento = idEmpregoarmamento;
        return this;
    }

}