package com.cincinnati.repositorios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cincinnati.entidades.Posicao;

@Component
public class PosicaoRepositorio {
	
	private Map<Long, Posicao> map = new HashMap<>();

	public void save(Posicao objeto) {
		map.put(objeto.getId(), objeto);
	}

	public Posicao findById(Long id) {
		return map.get(id);
	}
		
	public List<Posicao> findAll() {
		return new ArrayList<Posicao>(map.values());
	}

	
}