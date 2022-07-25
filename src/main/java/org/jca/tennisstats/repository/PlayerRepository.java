package org.jca.tennisstats.repository;

import java.util.List;

import org.jca.tennisstats.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

	//List<Player> findByOrderByRankAsc();
	
}
