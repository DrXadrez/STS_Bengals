package com.cincinnati;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cincinnati.entidades.Jogador;
import com.cincinnati.entidades.Posicao;
import com.cincinnati.repositorios.JogadorRepositorio;
import com.cincinnati.repositorios.PosicaoRepositorio;

@SpringBootApplication
public class CincinnatiBengalsApplication implements CommandLineRunner{

	@Autowired
	private PosicaoRepositorio posicaoRepositorio;
	
	@Autowired
	private JogadorRepositorio jogadorRepositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(CincinnatiBengalsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Posicao pos1 = new Posicao(1L, "Quarterback", "QB");
		Posicao pos2 = new Posicao(2L, "Wide Receiber", "WR");
		
		Jogador jog1 = new Jogador(1L, "Joe Burrow", "QB", 9, 02, "LSU", pos1);
		Jogador jog2 = new Jogador(2L, "Jamaar Chase", "WR", 1, 01, "LSU", pos2);
		Jogador jog3 = new Jogador(3L, "Brandon Allen", "QB", 8, 06, "Arkansas", pos1);
		Jogador jog4 = new Jogador(4L, "Tee Higgins", "WR", 85, 02, "Clemson", pos2);
		
		pos1.getJogadores().addAll(Arrays.asList(jog1, jog3));
		pos2.getJogadores().addAll(Arrays.asList(jog2, jog4));
		
		posicaoRepositorio.save(pos1);
		posicaoRepositorio.save(pos2);
		
		jogadorRepositorio.save(jog1);
		jogadorRepositorio.save(jog2);
		jogadorRepositorio.save(jog3);
		jogadorRepositorio.save(jog4);
	}

}
