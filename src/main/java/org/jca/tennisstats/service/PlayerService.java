package org.jca.tennisstats.service;

import java.util.List;
import java.util.Optional;

import org.jca.tennisstats.model.Player;
import org.jca.tennisstats.repository.CountryRepository;
import org.jca.tennisstats.repository.PlayerRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Iterable<Player> list() {
        //return playerRepository.findByOrderByRankAsc();
    	return playerRepository.findAll(Sort.by(Sort.Direction.ASC, "data.rank"));
    }
    
    public Optional<Player> getById(Long id) {
		return playerRepository.findById(id);
    	
    }
    
    public Player save(Player player) {
        return playerRepository.save(player);
    }

    public void save(List<Player> players) {
    	playerRepository.saveAll(players);
    }

}
