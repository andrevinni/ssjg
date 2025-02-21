package com.casnav.testeapi.ssgnApi.entities.dominio;

import jakarta.persistence.*;

@Entity(name = "Base")
@Table(name = "base", schema = "Dominio")
//@AttributeOverrides({
//        @AttributeOverride(name = "nome", column = @Column(name = "Nome", nullable = false, length = 50))
//})
public class Base extends Elemento {
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

    public Base setIdTipobase(Integer idTipobase) {
        this.idTipobase = idTipobase;
        return this;
    }

    public Double getExtensaoCais() {
        return extensaoCais;
    }

    public Base setExtensaoCais(Double extensaoCais) {
        this.extensaoCais = extensaoCais;
        return this;
    }

    public Double getCaladoMaximo() {
        return caladoMaximo;
    }

    public Base setCaladoMaximo(Double caladoMaximo) {
        this.caladoMaximo = caladoMaximo;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Base setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

}