package com.casnav.testeapi.ssgnApi.entities.processo_montagem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Pista")
@Table(schema = "processo_montagem")
public class Pista {
    @Id
    @Column(name = "Id_Pista", nullable = false)
    private Integer id;

    @Column(name = "Classe")
    private Integer classe;

    @Column(name = "Classe_Efetiva")
    private Integer classeEfetiva;

    @Column(name = "CapacCarga", length = 50)
    private String capacCarga;

    @Column(name = "CompPista", length = 50)
    private String compPista;

    @Column(name = "id_Pavimento")
    private Integer idPavimento;

    public Integer getId() {
        return id;
    }

    public Pista setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getClasse() {
        return classe;
    }

    public Pista setClasse(Integer classe) {
        this.classe = classe;
        return this;
    }

    public Integer getClasseEfetiva() {
        return classeEfetiva;
    }

    public Pista setClasseEfetiva(Integer classeEfetiva) {
        this.classeEfetiva = classeEfetiva;
        return this;
    }

    public String getCapacCarga() {
        return capacCarga;
    }

    public Pista setCapacCarga(String capacCarga) {
        this.capacCarga = capacCarga;
        return this;
    }

    public String getCompPista() {
        return compPista;
    }

    public Pista setCompPista(String compPista) {
        this.compPista = compPista;
        return this;
    }

    public Integer getIdPavimento() {
        return idPavimento;
    }

    public Pista setIdPavimento(Integer idPavimento) {
        this.idPavimento = idPavimento;
        return this;
    }

}