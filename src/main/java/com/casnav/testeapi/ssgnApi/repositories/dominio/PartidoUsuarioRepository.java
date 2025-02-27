package com.casnav.testeapi.ssgnApi.repositories.dominio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.dominio.PartidoUsuario;
import com.casnav.testeapi.ssgnApi.entities.dominio.PartidoUsuarioId;

public interface PartidoUsuarioRepository extends JpaRepository<PartidoUsuario, PartidoUsuarioId>{

}
