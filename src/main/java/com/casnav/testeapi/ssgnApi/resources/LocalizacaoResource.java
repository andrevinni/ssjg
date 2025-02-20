package com.casnav.testeapi.ssgnApi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casnav.testeapi.ssgnApi.entities.Localizacao;
import com.casnav.testeapi.ssgnApi.services.LocalizacaoService;

@RestController
@RequestMapping("/localizacao")
public class LocalizacaoResource {
	
	@Autowired
	private LocalizacaoService service;
	
	@GetMapping
	public ResponseEntity<List<Localizacao>> findAll(){
		//Localizacao u = new Localizacao(1L, "Maria", "maria@gmail.com", "999999", "12345");
		
		List<Localizacao> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Localizacao> findById(@PathVariable Long id) {
		
		Localizacao obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
