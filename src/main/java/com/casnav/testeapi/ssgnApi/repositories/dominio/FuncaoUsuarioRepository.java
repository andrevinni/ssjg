package com.casnav.testeapi.ssgnApi.repositories.dominio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.dominio.FuncaoUsuario;
import com.casnav.testeapi.ssgnApi.entities.dominio.FuncaoUsuarioId;

public interface FuncaoUsuarioRepository extends JpaRepository<FuncaoUsuario, FuncaoUsuarioId>{

}
