package com.cincinnati.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Posicao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String posicao;
	private String abreviacao;
	
	@JsonIgnore
	private List<Jogador> jogadores = new ArrayList<>();
	public Posicao() {
	}

	public Posicao(Long id, String posicao, String abreviacao) {
		super();
		this.id = id;
		this.posicao = posicao;
		this.abreviacao = abreviacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getAbreviacao() {
		return abreviacao;
	}

	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}
	
	public List<Jogador> getJogadores() {
		return jogadores;
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
		Posicao other = (Posicao) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
