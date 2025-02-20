package com.casnav.testeapi.ssgnApi.modelos.Processo;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DominioConexaoId implements Serializable {
    private static final long serialVersionUID = -9146985005969903403L;
    @Column(name = "Id_Dominio_Simulacao", nullable = false)
    private Long idDominioSimulacao;

    @Column(name = "Id_Usuario", nullable = false)
    private Integer idUsuario;

    public Long getIdDominioSimulacao() {
        return idDominioSimulacao;
    }

    public DominioConexaoId setIdDominioSimulacao(Long idDominioSimulacao) {
        this.idDominioSimulacao = idDominioSimulacao;
        return this;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public DominioConexaoId setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DominioConexaoId entity = (DominioConexaoId) o;
        return Objects.equals(this.idUsuario, entity.idUsuario) &&
                Objects.equals(this.idDominioSimulacao, entity.idDominioSimulacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idDominioSimulacao);
    }

}