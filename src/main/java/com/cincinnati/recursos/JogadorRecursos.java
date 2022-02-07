package com.cincinnati.recursos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cincinnati.entidades.Jogador;
import com.cincinnati.repositorios.JogadorRepositorio;

@RestController
@RequestMapping(value = "/jogador")

public class JogadorRecursos {
	
	@Autowired
	private JogadorRepositorio JogadorRepositorio;

		@GetMapping
		public ResponseEntity<List<Jogador>> findAll() {
			List<Jogador> list = JogadorRepositorio.findAll();
			return ResponseEntity.ok().body(list);
		}

		@GetMapping(value = "/{id}")
		public ResponseEntity<Jogador> findById(@PathVariable Long id) {
			Jogador pos = JogadorRepositorio.findById(id);
			return ResponseEntity.ok().body(pos);
		}
	
	
	}

