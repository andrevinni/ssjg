package com.casnav.testeapi.ssgnApi.entities.seguranca;

import com.casnav.testeapi.ssgnApi.entities.processo.DominioSimulacao;
import jakarta.persistence.*;

@Entity
@Table(name = "forca_", schema = "seguranca")
public class Forca_ {
    @Id
    @Column(name = "id_forca", nullable = false)
    private Integer id;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "prefixo", length = 50)
    private String prefixo;

    @Column(name = "id_classe")
    private Integer idClasse;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dominio_simulacao")
    private DominioSimulacao idDominioSimulacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_forca_origem")
    private Forca_ idForcaOrigem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public Integer getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(Integer idClasse) {
        this.idClasse = idClasse;
    }

    public DominioSimulacao getIdDominioSimulacao() {
        return idDominioSimulacao;
    }

    public void setIdDominioSimulacao(DominioSimulacao idDominioSimulacao) {
        this.idDominioSimulacao = idDominioSimulacao;
    }

    public Forca_ getIdForcaOrigem() {
        return idForcaOrigem;
    }

    public void setIdForcaOrigem(Forca_ idForcaOrigem) {
        this.idForcaOrigem = idForcaOrigem;
    }

}