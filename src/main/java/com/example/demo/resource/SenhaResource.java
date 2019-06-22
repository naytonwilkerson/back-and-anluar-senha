package com.example.demo.resource;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Senha;
import com.example.demo.repository.SenhaRepository;

@RestController
@RequestMapping(value="/senha")
@CrossOrigin(origins = "http://localhost:4200")
public class SenhaResource {
	
	@Autowired
	private SenhaRepository service;
	
	@GetMapping
	public ResponseEntity<List<Senha>> findAll() {
		List<Senha> alunos = service.findAll();
		return ResponseEntity.ok().body(alunos);
	}
		
	@PutMapping
	public ResponseEntity<?> atualizar(@Valid @RequestBody Senha empresa) {
		service.save(empresa);
	    return ResponseEntity.noContent().build();
	}
	
		
	
	
	

}