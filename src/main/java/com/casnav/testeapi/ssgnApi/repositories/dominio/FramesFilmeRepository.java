package com.casnav.testeapi.ssgnApi.repositories.dominio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.dominio.FramesFilme;
import com.casnav.testeapi.ssgnApi.entities.dominio.FramesFilmeId;

public interface FramesFilmeRepository extends JpaRepository<FramesFilme, FramesFilmeId>{

}
