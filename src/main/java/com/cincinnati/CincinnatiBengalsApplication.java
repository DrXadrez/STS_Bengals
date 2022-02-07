package com.cincinnati;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cincinnati.entidades.Posicao;
import com.cincinnati.repositorios.PosicaoRepositorio;

@SpringBootApplication
public class CincinnatiBengalsApplication implements CommandLineRunner{

	@Autowired
	private PosicaoRepositorio posicaoRepositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(CincinnatiBengalsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Posicao pos1 = new Posicao(1L, "Quarterback", "QB");
		Posicao pos2 = new Posicao(2L, "Wide Receiber", "WR");
		
		posicaoRepositorio.save(pos1);
		posicaoRepositorio.save(pos2);
	}

}
