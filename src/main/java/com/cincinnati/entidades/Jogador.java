package com.cincinnati.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Jogador implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String pos;
	private int jersey;
	private int experiencia;
	private String college;
	
	private Posicao posicao;
	
	public Jogador() {
		
	}

	public Jogador(Long id, String nome, String pos, int jersey, int experiencia, String college, Posicao posicao) {
		super();
		this.id = id;
		this.nome = nome;
		this.pos = pos;
		this.jersey = jersey;
		this.experiencia = experiencia;
		this.college = college;
		this.posicao = posicao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public int getJersey() {
		return jersey;
	}

	public void setJersey(int jersey) {
		this.jersey = jersey;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
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
		Jogador other = (Jogador) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
