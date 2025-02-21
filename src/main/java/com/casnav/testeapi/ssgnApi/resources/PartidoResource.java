package com.casnav.testeapi.ssgnApi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casnav.testeapi.ssgnApi.entities.Partido2;
import com.casnav.testeapi.ssgnApi.services.PartidoService;

@RestController
@RequestMapping("/partidos")
public class PartidoResource {
	
	@Autowired
	private PartidoService service;
	
	@GetMapping
	public ResponseEntity<List<Partido2>> findAll(){
		//Partido u = new Partido(1L, "Maria", "maria@gmail.com", "999999", "12345");
		
		List<Partido2> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Partido2> findById(@PathVariable Long id) {
		
		Partido2 obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
