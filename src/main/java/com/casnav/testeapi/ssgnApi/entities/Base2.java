package com.casnav.testeapi.ssgnApi.entities;

import jakarta.persistence.*;

@Entity(name = "Base2")
@Table(schema = "Dominio")
@AttributeOverrides({
        @AttributeOverride(name = "nome", column = @Column(name = "Nome", nullable = false, length = 50))
})
public class Base2 extends Elemento {
    @Column(name = "Id_TipoBase", nullable = false)
    private Integer idTipobase;

    @Column(name = "ExtensaoCais")
    private Double extensaoCais;

    @Column(name = "CaladoMaximo")
    private Double caladoMaximo;

    @Column(name = "Descricao", length = 70)
    private String descricao;

    public Integer getIdTipobase() {
        return idTipobase;
    }

    public Base2 setIdTipobase(Integer idTipobase) {
        this.idTipobase = idTipobase;
        return this;
    }

    public Double getExtensaoCais() {
        return extensaoCais;
    }

    public Base2 setExtensaoCais(Double extensaoCais) {
        this.extensaoCais = extensaoCais;
        return this;
    }

    public Double getCaladoMaximo() {
        return caladoMaximo;
    }

    public Base2 setCaladoMaximo(Double caladoMaximo) {
        this.caladoMaximo = caladoMaximo;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Base2 setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

}