package com.cliquejah.ssjg.entities.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Configuracao")
@Table(schema = "Dominio")
public class Configuracao {
    @Id
    @Column(name = "Id_Configuracao", nullable = false)
    private Integer id;

    @Column(name = "Id_Elemento", nullable = false)
    private Long idElemento;

    @Column(name = "CodConfiguracao")
    private Integer codConfiguracao;

    @Column(name = "CodRaioAcaoConfiguracao", nullable = false)
    private Integer codRaioAcaoConfiguracao;

    @Column(name = "CaracteristicaConfiguracao", length = 50)
    private String caracteristicaConfiguracao;

    @Column(name = "Carga", nullable = false)
    private Integer carga;

    @Column(name = "CapacTanqueCombExterno")
    private Integer capacTanqueCombExterno;

    @Column(name = "QtdeTanques")
    private Integer qtdeTanques;

    @Column(name = "ListaCabidesTanque", length = 50)
    private String listaCabidesTanque;

    @Column(name = "CoeficientePos")
    private Double coeficientePos;

    @Column(name = "RaioAcaoAA")
    private Integer raioAcaoAA;

    @Column(name = "RaioAcaoBB")
    private Integer raioAcaoBB;

    @Column(name = "QtdeBRS_Ativa")
    private Integer qtdebrsAtiva;

    @Column(name = "AlcanceMaximoBRS")
    private Double alcanceMaximoBRS;

    @Column(name = "ListaCabidesBRS_Ativa", length = 50)
    private String listacabidesbrsAtiva;

    @Column(name = "QtdeRC")
    private Integer qtdeRC;

    @Column(name = "ListaCabidesRC", length = 50)
    private String listaCabidesRC;

    @Column(name = "ClasseCaracteristica", length = 10)
    private String classeCaracteristica;

    @Column(name = "QtdeBRS_Passiva")
    private Integer qtdebrsPassiva;

    @Column(name = "ListaCabidesBRS_Passiva", length = 50)
    private String listacabidesbrsPassiva;

    public Integer getId() {
        return id;
    }

    public Configuracao setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getIdElemento() {
        return idElemento;
    }

    public Configuracao setIdElemento(Long idElemento) {
        this.idElemento = idElemento;
        return this;
    }

    public Integer getCodConfiguracao() {
        return codConfiguracao;
    }

    public Configuracao setCodConfiguracao(Integer codConfiguracao) {
        this.codConfiguracao = codConfiguracao;
        return this;
    }

    public Integer getCodRaioAcaoConfiguracao() {
        return codRaioAcaoConfiguracao;
    }

    public Configuracao setCodRaioAcaoConfiguracao(Integer codRaioAcaoConfiguracao) {
        this.codRaioAcaoConfiguracao = codRaioAcaoConfiguracao;
        return this;
    }

    public String getCaracteristicaConfiguracao() {
        return caracteristicaConfiguracao;
    }

    public Configuracao setCaracteristicaConfiguracao(String caracteristicaConfiguracao) {
        this.caracteristicaConfiguracao = caracteristicaConfiguracao;
        return this;
    }

    public Integer getCarga() {
        return carga;
    }

    public Configuracao setCarga(Integer carga) {
        this.carga = carga;
        return this;
    }

    public Integer getCapacTanqueCombExterno() {
        return capacTanqueCombExterno;
    }

    public Configuracao setCapacTanqueCombExterno(Integer capacTanqueCombExterno) {
        this.capacTanqueCombExterno = capacTanqueCombExterno;
        return this;
    }

    public Integer getQtdeTanques() {
        return qtdeTanques;
    }

    public Configuracao setQtdeTanques(Integer qtdeTanques) {
        this.qtdeTanques = qtdeTanques;
        return this;
    }

    public String getListaCabidesTanque() {
        return listaCabidesTanque;
    }

    public Configuracao setListaCabidesTanque(String listaCabidesTanque) {
        this.listaCabidesTanque = listaCabidesTanque;
        return this;
    }

    public Double getCoeficientePos() {
        return coeficientePos;
    }

    public Configuracao setCoeficientePos(Double coeficientePos) {
        this.coeficientePos = coeficientePos;
        return this;
    }

    public Integer getRaioAcaoAA() {
        return raioAcaoAA;
    }

    public Configuracao setRaioAcaoAA(Integer raioAcaoAA) {
        this.raioAcaoAA = raioAcaoAA;
        return this;
    }

    public Integer getRaioAcaoBB() {
        return raioAcaoBB;
    }

    public Configuracao setRaioAcaoBB(Integer raioAcaoBB) {
        this.raioAcaoBB = raioAcaoBB;
        return this;
    }

    public Integer getQtdebrsAtiva() {
        return qtdebrsAtiva;
    }

    public Configuracao setQtdebrsAtiva(Integer qtdebrsAtiva) {
        this.qtdebrsAtiva = qtdebrsAtiva;
        return this;
    }

    public Double getAlcanceMaximoBRS() {
        return alcanceMaximoBRS;
    }

    public Configuracao setAlcanceMaximoBRS(Double alcanceMaximoBRS) {
        this.alcanceMaximoBRS = alcanceMaximoBRS;
        return this;
    }

    public String getListacabidesbrsAtiva() {
        return listacabidesbrsAtiva;
    }

    public Configuracao setListacabidesbrsAtiva(String listacabidesbrsAtiva) {
        this.listacabidesbrsAtiva = listacabidesbrsAtiva;
        return this;
    }

    public Integer getQtdeRC() {
        return qtdeRC;
    }

    public Configuracao setQtdeRC(Integer qtdeRC) {
        this.qtdeRC = qtdeRC;
        return this;
    }

    public String getListaCabidesRC() {
        return listaCabidesRC;
    }

    public Configuracao setListaCabidesRC(String listaCabidesRC) {
        this.listaCabidesRC = listaCabidesRC;
        return this;
    }

    public String getClasseCaracteristica() {
        return classeCaracteristica;
    }

    public Configuracao setClasseCaracteristica(String classeCaracteristica) {
        this.classeCaracteristica = classeCaracteristica;
        return this;
    }

    public Integer getQtdebrsPassiva() {
        return qtdebrsPassiva;
    }

    public Configuracao setQtdebrsPassiva(Integer qtdebrsPassiva) {
        this.qtdebrsPassiva = qtdebrsPassiva;
        return this;
    }

    public String getListacabidesbrsPassiva() {
        return listacabidesbrsPassiva;
    }

    public Configuracao setListacabidesbrsPassiva(String listacabidesbrsPassiva) {
        this.listacabidesbrsPassiva = listacabidesbrsPassiva;
        return this;
    }

}