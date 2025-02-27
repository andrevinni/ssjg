package com.casnav.testeapi.ssgnApi.repositories.dominio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.dominio.VisibilidadePartido;
import com.casnav.testeapi.ssgnApi.entities.dominio.VisibilidadePartidoId;

public interface VisibilidadePartidoRepository extends JpaRepository<VisibilidadePartido, VisibilidadePartidoId>{

}
