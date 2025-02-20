package com.casnav.testeapi.ssgnApi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casnav.testeapi.ssgnApi.entities.MeioSimulado;
import com.casnav.testeapi.ssgnApi.services.MeioSimuladoService;

@RestController
@RequestMapping("/meiosimulado")
public class MeioSimuladoResource {
	
	@Autowired
	private MeioSimuladoService service;
	
	@GetMapping
	public ResponseEntity<List<MeioSimulado>> findAll(){
		//MeioSimulado u = new MeioSimulado(1L, "Maria", "maria@gmail.com", "999999", "12345");
		
		List<MeioSimulado> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MeioSimulado> findById(@PathVariable Long id) {
		
		MeioSimulado obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
