package com.cincinnati.recursos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cincinnati.entidades.Posicao;
import com.cincinnati.repositorios.PosicaoRepositorio;

@RestController
@RequestMapping(value = "/posicao")

public class PosicaoRecursos {
	
	@Autowired
	private PosicaoRepositorio posicaoRepositorio;

		@GetMapping
		public ResponseEntity<List<Posicao>> findAll() {
			List<Posicao> list = posicaoRepositorio.findAll();
			return ResponseEntity.ok().body(list);
		}

		@GetMapping(value = "/{id}")
		public ResponseEntity<Posicao> findById(@PathVariable Long id) {
			Posicao pos = posicaoRepositorio.findById(id);
			return ResponseEntity.ok().body(pos);
		}
	
	
	}

