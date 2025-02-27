package com.casnav.testeapi.ssgnApi.repositories.dominio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.dominio.ForcaUsuario;
import com.casnav.testeapi.ssgnApi.entities.dominio.ForcaUsuarioId;

public interface ForcaUsuarioRepository extends JpaRepository<ForcaUsuario, ForcaUsuarioId>{

}
