package com.casnav.testeapi.ssgnApi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casnav.testeapi.ssgnApi.entities.Partido;
import com.casnav.testeapi.ssgnApi.repositories.PartidoRepository;

@Service
public class PartidoService {
	
	@Autowired
	private PartidoRepository repository;
	
	public List<Partido> findAll() {
		return repository.findAll();
	}
	
	public Partido findById(Long id) {
		Optional<Partido> obj = repository.findById(id);
		return obj.get();
	}

}
