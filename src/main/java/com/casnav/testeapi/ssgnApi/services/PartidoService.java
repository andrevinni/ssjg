package com.casnav.testeapi.ssgnApi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casnav.testeapi.ssgnApi.entities.Partido2;
import com.casnav.testeapi.ssgnApi.repositories.PartidoRepository;

@Service
public class PartidoService {
	
	@Autowired
	private PartidoRepository repository;
	
	public List<Partido2> findAll() {
		return repository.findAll();
	}
	
	public Partido2 findById(Long id) {
		Optional<Partido2> obj = repository.findById(id);
		return obj.get();
	}

}
