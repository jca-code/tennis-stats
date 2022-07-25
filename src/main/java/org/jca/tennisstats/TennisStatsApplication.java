package org.jca.tennisstats;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.jca.tennisstats.model.Player;
import org.jca.tennisstats.model.Players;
import org.jca.tennisstats.service.CountryService;
import org.jca.tennisstats.service.PlayerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class TennisStatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TennisStatsApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(PlayerService playerService, CountryService countryService) {
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<Players> typeReference = new TypeReference<Players>() { };
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/headtohead.json");
			try {
				Players players = mapper.readValue(inputStream, typeReference);
				for (Player player : players.getPlayers()) {
					countryService.save(player.getCountry());
					playerService.save(player);
				}
				System.out.println("Users Saved!");
			} catch (IOException e) {
				System.out.println("Unable to save players: " + e.getMessage());
			}
			
//			TypeReference<Player> typeReference = new TypeReference<Player>() { };
//			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/headtohead2.json");
//			try {
//				Player player = mapper.readValue(inputStream, typeReference);
//				playerService.save(player);
//				System.out.println("Users Saved!");
//			} catch (IOException e) {
//				System.out.println("Unable to save players: " + e.getMessage());
//			}
		};
	}

}
