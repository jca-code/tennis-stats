package org.jca.tennisstats.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.jca.tennisstats.model.Player;
import org.jca.tennisstats.service.PlayerService;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    
    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable(value = "id") Long id) {
    	Optional<Player> p = playerService.getById(id);
    	return p.isPresent() ? p.get() : null;

    }

    @GetMapping("/list")
    public Iterable<Player> list() {
        return playerService.list();
    }
}
