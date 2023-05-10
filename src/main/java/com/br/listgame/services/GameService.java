package com.br.listgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.listgame.dto.GameMinDTO;
import com.br.listgame.entities.Game;
import com.br.listgame.repositories.GameRepository;

@Service
public class GameService {
		
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
