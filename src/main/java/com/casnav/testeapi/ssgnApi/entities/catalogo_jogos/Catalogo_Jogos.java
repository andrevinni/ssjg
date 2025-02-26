package com.casnav.testeapi.ssgnApi.entities.catalogo_jogos;

import java.time.LocalTime;
import java.util.Objects;

import jakarta.persistence.*;

@Entity(name = "CatalogoJogos")
@Table(schema = "catalogo_jogos")
public class Catalogo_Jogos {
    @Id
    @Column(name = "id_catalogo_jogos", nullable = false)
    private Long id;

    @Column(name = "nome_jogo", length = 50)
    private String nomeJogo;

    @Column(name = "versao_jogo", length = 50)
    private String versaoJogo;

    @Column(name = "servidor", length = 50)
    private String servidor;
    
    @Column(name = "nome_banco", length = 50)
    private String nomeBanco;

    @Column(name = "dh_criacao", length = 14)
    private LocalTime DH_Criacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getVersaoJogo() {
		return versaoJogo;
	}

	public void setVersaoJogo(String versaoJogo) {
		this.versaoJogo = versaoJogo;
	}

	public String getServidor() {
		return servidor;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public LocalTime getDH_Criacao() {
		return DH_Criacao;
	}

	public void setDH_Criacao(LocalTime dH_Criacao) {
		DH_Criacao = dH_Criacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalogo_Jogos other = (Catalogo_Jogos) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Catalogo_Jogos [id=" + id + ", nomeJogo=" + nomeJogo + ", versaoJogo=" + versaoJogo + ", servidor="
				+ servidor + ", nomeBanco=" + nomeBanco + ", DH_Criacao=" + DH_Criacao + "]";
	}

	public Catalogo_Jogos(Long id, String nomeJogo, String versaoJogo, String servidor, String nomeBanco,
			LocalTime dH_Criacao) {
		this.id = id;
		this.nomeJogo = nomeJogo;
		this.versaoJogo = versaoJogo;
		this.servidor = servidor;
		this.nomeBanco = nomeBanco;
		DH_Criacao = dH_Criacao;
	}

}