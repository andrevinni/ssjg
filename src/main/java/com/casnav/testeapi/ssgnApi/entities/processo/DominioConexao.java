package com.casnav.testeapi.ssgnApi.entities.processo;

import jakarta.persistence.*;

@Entity
@Table(name = "DominioConexao", schema = "Processo")
public class DominioConexao {
    @EmbeddedId
    private DominioConexaoId id;

    @MapsId("idDominioSimulacao")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Dominio_Simulacao", nullable = false)
    private DominioSimulacao idDominioSimulacao;

    @MapsId("idUsuario")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Usuario", nullable = false)
    private com.casnav.testeapi.ssgnApi.entities.processo.Usuario idUsuario;

    public DominioConexaoId getId() {
        return id;
    }

    public DominioConexao setId(DominioConexaoId id) {
        this.id = id;
        return this;
    }

    public DominioSimulacao getIdDominioSimulacao() {
        return idDominioSimulacao;
    }

    public DominioConexao setIdDominioSimulacao(DominioSimulacao idDominioSimulacao) {
        this.idDominioSimulacao = idDominioSimulacao;
        return this;
    }

    public com.casnav.testeapi.ssgnApi.entities.processo.Usuario getIdUsuario() {
        return idUsuario;
    }

    public DominioConexao setIdUsuario(com.casnav.testeapi.ssgnApi.entities.processo.Usuario idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

}