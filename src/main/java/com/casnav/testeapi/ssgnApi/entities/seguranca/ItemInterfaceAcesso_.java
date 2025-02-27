package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"iteminterfaceacesso\"", schema = "seguranca")
public class ItemInterfaceAcesso_ {
    @EmbeddedId
    private ItemInterfaceAcessoId id;

    public ItemInterfaceAcessoId getId() {
        return id;
    }

    public void setId(ItemInterfaceAcessoId id) {
        this.id = id;
    }

}