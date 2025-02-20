package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.*;

@Entity
@Table(name = "ItemInterfaceAcesso", schema = "Processo", indexes = {
        @Index(name = "IX_ItemInterfaceAcesso", columnList = "Id_Funcao")
})
public class ItemInterfaceAcesso {
    @EmbeddedId
    private ItemInterfaceAcessoId id;

    @MapsId("idFuncao")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Funcao", nullable = false)
    private Funcao idFuncao;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "Id_Recurso", referencedColumnName = "Id_Recurso", nullable = false),
            @JoinColumn(name = "Id_ChaveItemIntf", referencedColumnName = "Id_ChaveItemIntf", nullable = false)
    })
    private com.casnav.testeapi.ssgnApi.modelos.Processo.ItemInterfaceRecurso itemInterfaceRecurso;

    @MapsId("idFase")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Fase", nullable = false)
    private FaseJogo idFase;

    public ItemInterfaceAcessoId getId() {
        return id;
    }

    public ItemInterfaceAcesso setId(ItemInterfaceAcessoId id) {
        this.id = id;
        return this;
    }

    public Funcao getIdFuncao() {
        return idFuncao;
    }

    public ItemInterfaceAcesso setIdFuncao(Funcao idFuncao) {
        this.idFuncao = idFuncao;
        return this;
    }

    public com.casnav.testeapi.ssgnApi.modelos.Processo.ItemInterfaceRecurso getItemInterfaceRecurso() {
        return itemInterfaceRecurso;
    }

    public ItemInterfaceAcesso setItemInterfaceRecurso(com.casnav.testeapi.ssgnApi.modelos.Processo.ItemInterfaceRecurso itemInterfaceRecurso) {
        this.itemInterfaceRecurso = itemInterfaceRecurso;
        return this;
    }

    public FaseJogo getIdFase() {
        return idFase;
    }

    public ItemInterfaceAcesso setIdFase(FaseJogo idFase) {
        this.idFase = idFase;
        return this;
    }

}