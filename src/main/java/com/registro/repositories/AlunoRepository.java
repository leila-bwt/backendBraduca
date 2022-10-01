package com.registro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.model.Aluno;

@Repository
public interface AlunoRepository  extends JpaRepository<Aluno, Long>{

	
	
}
