package com.registro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.model.Aluno;
import com.registro.repositories.AlunoRepository;
import com.registro.service.exception.ObjectNotFoundException;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	public Aluno findById(Long id) { 
        Optional<Aluno> usuario = alunoRepository.findById(id);
        return usuario.orElseThrow(() -> new ObjectNotFoundException("Objeto com id: " + id + " não foi encontrado. Tipo: " + Aluno.class.getName()));
	}
	
	public List<Aluno> findAll() {
		return alunoRepository.findAll();
	}
	
	public Aluno save (Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public Aluno update(Aluno aluno) {
		findById(aluno.getId());
		return alunoRepository.save(aluno);
	}
	
	public void deleteAluno(Long id) {
		alunoRepository.deleteById(id);
	}
	
}
