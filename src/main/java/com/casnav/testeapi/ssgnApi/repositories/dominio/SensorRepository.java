package com.casnav.testeapi.ssgnApi.repositories.dominio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.dominio.Sensor;

public interface SensorRepository extends JpaRepository<Sensor, Long>{

}
