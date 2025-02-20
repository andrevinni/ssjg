package com.casnav.testeapi.ssgnApi.modelos.Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity(name = "CapacidadeAlocacaoRecurso")
@Table(schema = "Montagem_Jogos")
public class CapacidadeAlocacaoRecurso {
    @Id
    @Column(name = "Id_CapacidadeAlocacaoRecurso", nullable = false)
    private Long id;

    @Column(name = "Id_Tipo_Alocacao", nullable = false)
    private Long idTipoAlocacao;

    @Column(name = "Id_EspecificacaoRecurso", nullable = false)
    private Long idEspecificacaorecurso;

    @Column(name = "Id_Elemento", nullable = false)
    private Long idElemento;

    @Column(name = "Quantidade", nullable = false)
    private Long quantidade;

    @Column(name = "CapacidadeArmaz", precision = 18, scale = 3)
    private BigDecimal capacidadeArmaz;

    public Long getId() {
        return id;
    }

    public CapacidadeAlocacaoRecurso setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getIdTipoAlocacao() {
        return idTipoAlocacao;
    }

    public CapacidadeAlocacaoRecurso setIdTipoAlocacao(Long idTipoAlocacao) {
        this.idTipoAlocacao = idTipoAlocacao;
        return this;
    }

    public Long getIdEspecificacaorecurso() {
        return idEspecificacaorecurso;
    }

    public CapacidadeAlocacaoRecurso setIdEspecificacaorecurso(Long idEspecificacaorecurso) {
        this.idEspecificacaorecurso = idEspecificacaorecurso;
        return this;
    }

    public Long getIdElemento() {
        return idElemento;
    }

    public CapacidadeAlocacaoRecurso setIdElemento(Long idElemento) {
        this.idElemento = idElemento;
        return this;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public CapacidadeAlocacaoRecurso setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public BigDecimal getCapacidadeArmaz() {
        return capacidadeArmaz;
    }

    public CapacidadeAlocacaoRecurso setCapacidadeArmaz(BigDecimal capacidadeArmaz) {
        this.capacidadeArmaz = capacidadeArmaz;
        return this;
    }

}