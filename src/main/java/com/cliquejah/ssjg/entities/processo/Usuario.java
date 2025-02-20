package com.casnav.testeapi.ssgnApi.modelos.Processo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario", schema = "Processo")
public class Usuario {
    @Id
    @Column(name = "Id_Usuario", nullable = false)
    private Integer id;

    @Column(name = "Login", nullable = false, length = 50)
    private String login;

    @Column(name = "Nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "Senha", nullable = false, length = 50)
    private String senha;

    @Column(name = "Conectado", length = 50)
    private String conectado;

    public Integer getId() {
        return id;
    }

    public Usuario setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public Usuario setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getConectado() {
        return conectado;
    }

    public Usuario setConectado(String conectado) {
        this.conectado = conectado;
        return this;
    }

}