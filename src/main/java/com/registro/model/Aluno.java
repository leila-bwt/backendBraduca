package com.registro.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String nome;
	
	@Column
	private String matricula;
	
	@Column
	private String contato;
	
	@Column
	private String email;
	
	@Column
	private String senha;
	
	

	public Aluno() {
		super();
	}

	public Aluno(long id, String nome, String matricula, String contato, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.contato = contato;
		this.email = email;
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", contato=" + contato + ", email="
				+ email + ", senha=" + senha + "]";
	}
	
}




