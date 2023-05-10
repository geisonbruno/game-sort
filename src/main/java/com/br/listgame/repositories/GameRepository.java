package com.br.listgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.listgame.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
