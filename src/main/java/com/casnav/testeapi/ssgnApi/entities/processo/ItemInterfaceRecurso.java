package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.*;

@Entity
@Table(name = "ItemInterfaceRecurso", schema = "Processo")
public class ItemInterfaceRecurso {
    @EmbeddedId
    private ItemInterfaceRecursoId id;

    @MapsId("idRecurso")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Recurso", nullable = false)
    private com.casnav.testeapi.ssgnApi.modelos.Processo.Recurso idRecurso;

    @Column(name = "Id_TipoChaveItem", nullable = false)
    private Integer idTipochaveitem;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "Id_ChavePai", nullable = false, length = 50)
    private String idChavepai;

    @Column(name = "Nivel", nullable = false)
    private Integer nivel;

    public ItemInterfaceRecursoId getId() {
        return id;
    }

    public ItemInterfaceRecurso setId(ItemInterfaceRecursoId id) {
        this.id = id;
        return this;
    }

    public com.casnav.testeapi.ssgnApi.modelos.Processo.Recurso getIdRecurso() {
        return idRecurso;
    }

    public ItemInterfaceRecurso setIdRecurso(com.casnav.testeapi.ssgnApi.modelos.Processo.Recurso idRecurso) {
        this.idRecurso = idRecurso;
        return this;
    }

    public Integer getIdTipochaveitem() {
        return idTipochaveitem;
    }

    public ItemInterfaceRecurso setIdTipochaveitem(Integer idTipochaveitem) {
        this.idTipochaveitem = idTipochaveitem;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public ItemInterfaceRecurso setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getIdChavepai() {
        return idChavepai;
    }

    public ItemInterfaceRecurso setIdChavepai(String idChavepai) {
        this.idChavepai = idChavepai;
        return this;
    }

    public Integer getNivel() {
        return nivel;
    }

    public ItemInterfaceRecurso setNivel(Integer nivel) {
        this.nivel = nivel;
        return this;
    }

}