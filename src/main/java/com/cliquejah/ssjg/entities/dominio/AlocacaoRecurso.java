package com.cliquejah.ssjg.entities.dominio;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;

@Entity(name = "AlocacaoRecurso")
@Table(name = "Alocacao_Recurso", schema = "Dominio")
public class AlocacaoRecurso {
    @Id
    @Column(name = "Id_Alocacao_Recurso", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "Id_Alocacao_Recurso", nullable = false)
    private com.cliquejah.ssjg.entities.dominio.DetalheAlocacaoLogistica detalheAlocacaoLogistica;

    @Column(name = "Id_Tipo_Alocacao", nullable = false)
    private Long idTipoAlocacao;

    @Column(name = "Id_EspecificacaoRecurso", nullable = false)
    private Long idEspecificacaorecurso;

    @Column(name = "Id_Elemento", nullable = false)
    private Long idElemento;

    @Column(name = "Quantidade", nullable = false)
    private Long quantidade;

    @Column(name = "CapacidadeArmaz")
    private Long capacidadeArmaz;

    @Column(name = "ListaCabideAlocacao", length = 50)
    private String listaCabideAlocacao;

    public Long getId() {
        return id;
    }

    public AlocacaoRecurso setId(Long id) {
        this.id = id;
        return this;
    }

    public com.cliquejah.ssjg.entities.dominio.DetalheAlocacaoLogistica getDetalheAlocacaoLogistica() {
        return detalheAlocacaoLogistica;
    }

    public AlocacaoRecurso setDetalheAlocacaoLogistica(com.cliquejah.ssjg.entities.dominio.DetalheAlocacaoLogistica detalheAlocacaoLogistica) {
        this.detalheAlocacaoLogistica = detalheAlocacaoLogistica;
        return this;
    }

    public Long getIdTipoAlocacao() {
        return idTipoAlocacao;
    }

    public AlocacaoRecurso setIdTipoAlocacao(Long idTipoAlocacao) {
        this.idTipoAlocacao = idTipoAlocacao;
        return this;
    }

    public Long getIdEspecificacaorecurso() {
        return idEspecificacaorecurso;
    }

    public AlocacaoRecurso setIdEspecificacaorecurso(Long idEspecificacaorecurso) {
        this.idEspecificacaorecurso = idEspecificacaorecurso;
        return this;
    }

    public Long getIdElemento() {
        return idElemento;
    }

    public AlocacaoRecurso setIdElemento(Long idElemento) {
        this.idElemento = idElemento;
        return this;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public AlocacaoRecurso setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public Long getCapacidadeArmaz() {
        return capacidadeArmaz;
    }

    public AlocacaoRecurso setCapacidadeArmaz(Long capacidadeArmaz) {
        this.capacidadeArmaz = capacidadeArmaz;
        return this;
    }

    public String getListaCabideAlocacao() {
        return listaCabideAlocacao;
    }

    public AlocacaoRecurso setListaCabideAlocacao(String listaCabideAlocacao) {
        this.listaCabideAlocacao = listaCabideAlocacao;
        return this;
    }

}