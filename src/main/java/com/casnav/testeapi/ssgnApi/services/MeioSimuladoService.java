package com.casnav.testeapi.ssgnApi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casnav.testeapi.ssgnApi.entities.MeioSimulado;
import com.casnav.testeapi.ssgnApi.repositories.MeioSimuladoRepository;

@Service
public class MeioSimuladoService {
	
	@Autowired
	private MeioSimuladoRepository repository;
	
	public List<MeioSimulado> findAll() {
		return repository.findAll();
	}
	
	public MeioSimulado findById(Long id) {
		Optional<MeioSimulado> obj = repository.findById(id);
		return obj.get();
	}

}
