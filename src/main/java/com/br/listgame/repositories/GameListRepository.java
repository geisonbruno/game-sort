package com.br.listgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.listgame.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
