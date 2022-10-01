package com.registro.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
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

import com.registro.model.Aluno;
import com.registro.service.AlunoService;

@RestController
@RequestMapping(value= "/alunos")
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	private AlunoService service;
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Aluno> findById(@PathVariable Long id) {
		Aluno aluno = service.findById(id);
		return ResponseEntity.ok().body(aluno);
	}
	
	@PostMapping
	public ResponseEntity<Aluno> save(@RequestBody Aluno aluno) {
		Aluno obj = service.save(aluno);
		return ResponseEntity.ok().body(obj);
	}
	
	@PutMapping
	public ResponseEntity<Aluno> update(@RequestBody Aluno aluno) {
		Aluno obj = service.update(aluno);
		return ResponseEntity.ok().body(obj);
	}
	
	@DeleteMapping(value = "/(id)")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.deleteAluno(id);
		return ResponseEntity.noContent().build();
	}

}
