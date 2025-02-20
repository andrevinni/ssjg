package com.casnav.testeapi.ssgnApi.modelos.Processo_Montagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "ClassificacaoRecurso")
@Table(schema = "Processo_Montagem")
public class ClassificacaoRecurso {
    @Id
    @Column(name = "Id_ClassificacaoRecurso", nullable = false)
    private Long id;

    @Column(name = "Nome", length = 150)
    private String nome;

    @Column(name = "RecursoGranel")
    private Boolean recursoGranel;

    @Column(name = "RecursoUnidade")
    private Boolean recursoUnidade;

    public Long getId() {
        return id;
    }

    public ClassificacaoRecurso setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public ClassificacaoRecurso setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Boolean getRecursoGranel() {
        return recursoGranel;
    }

    public ClassificacaoRecurso setRecursoGranel(Boolean recursoGranel) {
        this.recursoGranel = recursoGranel;
        return this;
    }

    public Boolean getRecursoUnidade() {
        return recursoUnidade;
    }

    public ClassificacaoRecurso setRecursoUnidade(Boolean recursoUnidade) {
        this.recursoUnidade = recursoUnidade;
        return this;
    }

}