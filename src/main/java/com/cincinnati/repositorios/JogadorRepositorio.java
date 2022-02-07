package com.cincinnati.repositorios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cincinnati.entidades.Jogador;

@Component
public class JogadorRepositorio {
	
	private Map<Long, Jogador> map = new HashMap<>();

	public void save(Jogador objeto) {
		map.put(objeto.getId(), objeto);
	}

	public Jogador findById(Long id) {
		return map.get(id);
	}
		
	public List<Jogador> findAll() {
		return new ArrayList<Jogador>(map.values());
	}

	
}