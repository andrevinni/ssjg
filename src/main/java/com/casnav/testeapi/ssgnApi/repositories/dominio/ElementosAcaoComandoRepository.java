package com.casnav.testeapi.ssgnApi.repositories.dominio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.dominio.ElementosAcaoComando;
import com.casnav.testeapi.ssgnApi.entities.dominio.ElementosAcaoComandoId;

public interface ElementosAcaoComandoRepository extends JpaRepository<ElementosAcaoComando, ElementosAcaoComandoId>{

}
