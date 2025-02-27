package com.casnav.testeapi.ssgnApi.entities.seguranca;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcao_", schema = "seguranca")
public class Funcao_ {
    @Id
    @Column(name = "id_funcao", nullable = false)
    private Integer id;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "funcao", length = 50)
    private String funcao;

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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

/*
 TODO [Reverse Engineering] create field to map the 'login_unico' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "login_unico", columnDefinition = "bit")
    private Object loginUnico;
*/
/*
 TODO [Reverse Engineering] create field to map the 'multiplos_papeis' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "multiplos_papeis", columnDefinition = "bit")
    private Object multiplosPapeis;
*/
}