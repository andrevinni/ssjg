package com.casnav.testeapi.ssgnApi.repositories.dominio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.dominio.Nri;
import com.casnav.testeapi.ssgnApi.entities.dominio.NriId;

public interface NriRepository extends JpaRepository<Nri, NriId>{

}
