package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Funcao", schema = "Processo")
public class Funcao {
    @Id
    @Column(name = "Id_Funcao", nullable = false)
    private Integer id;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "Funcao", length = 50)
    private String funcao;

    @Column(name = "LoginUnico")
    private Boolean loginUnico;

    @Column(name = "MultiplosPapeis")
    private Boolean multiplosPapeis;

    public Integer getId() {
        return id;
    }

    public Funcao setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Funcao setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getFuncao() {
        return funcao;
    }

    public Funcao setFuncao(String funcao) {
        this.funcao = funcao;
        return this;
    }

    public Boolean getLoginUnico() {
        return loginUnico;
    }

    public Funcao setLoginUnico(Boolean loginUnico) {
        this.loginUnico = loginUnico;
        return this;
    }

    public Boolean getMultiplosPapeis() {
        return multiplosPapeis;
    }

    public Funcao setMultiplosPapeis(Boolean multiplosPapeis) {
        this.multiplosPapeis = multiplosPapeis;
        return this;
    }

}