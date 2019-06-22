package com.example.demo.resource;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.model.Cadastrados;
import com.example.demo.repository.CadastradosRepository;



@RestController
@RequestMapping(value="/cadastrados")
@CrossOrigin(origins = "http://localhost:4200")
public class CadastradosResource {
	
	@Autowired
	private CadastradosRepository service;
	
	@GetMapping
	public ResponseEntity<List<Cadastrados>> findAll() {
		List<Cadastrados> alunos = service.findAll();
		return ResponseEntity.ok().body(alunos);
	}
		
	@PostMapping
	public ResponseEntity<?> salvar(@Valid @RequestBody Cadastrados cadastrados) {
		service.save(cadastrados);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
		        .buildAndExpand(cadastrados.getCodigo()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<?> atualizar(@Valid @RequestBody Cadastrados cadastrados) {
		service.save(cadastrados);
	    return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping
	public ResponseEntity<?> excluir(@PathVariable Integer codigo) {
		try {
			service.deleteById(codigo);
			return ResponseEntity.ok(codigo);	
		} catch(EmptyResultDataAccessException e) {
			return ResponseEntity.notFound().build();
		}
	}

}