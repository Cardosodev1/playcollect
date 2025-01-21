package com.devcardoso.playcollect.repositories;

import com.devcardoso.playcollect.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
