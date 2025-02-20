package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "TipoPropulsao")
@Table(schema = "Dominio")
public class TipoPropulsao {
    @Id
    @Column(name = "Id_TipoPropulsao", nullable = false)
    private Integer id;

    @Column(name = "TipoRecursoLogistico", length = 50)
    private String tipoRecursoLogistico;

    @Column(name = "RecursoLogistico", length = 50)
    private String recursoLogistico;

    @Column(name = "Id_TipoRecursoLogistico")
    private Integer idTiporecursologistico;

    @Column(name = "Id_RecursoLogistico")
    private Integer idRecursologistico;

    @Column(name = "Nome", nullable = false, length = 10)
    private String nome;

    public Integer getId() {
        return id;
    }

    public TipoPropulsao setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTipoRecursoLogistico() {
        return tipoRecursoLogistico;
    }

    public TipoPropulsao setTipoRecursoLogistico(String tipoRecursoLogistico) {
        this.tipoRecursoLogistico = tipoRecursoLogistico;
        return this;
    }

    public String getRecursoLogistico() {
        return recursoLogistico;
    }

    public TipoPropulsao setRecursoLogistico(String recursoLogistico) {
        this.recursoLogistico = recursoLogistico;
        return this;
    }

    public Integer getIdTiporecursologistico() {
        return idTiporecursologistico;
    }

    public TipoPropulsao setIdTiporecursologistico(Integer idTiporecursologistico) {
        this.idTiporecursologistico = idTiporecursologistico;
        return this;
    }

    public Integer getIdRecursologistico() {
        return idRecursologistico;
    }

    public TipoPropulsao setIdRecursologistico(Integer idRecursologistico) {
        this.idRecursologistico = idRecursologistico;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoPropulsao setNome(String nome) {
        this.nome = nome;
        return this;
    }

}