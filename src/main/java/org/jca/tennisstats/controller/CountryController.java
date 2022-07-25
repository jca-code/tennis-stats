package org.jca.tennisstats.controller;

import org.jca.tennisstats.model.Country;
import org.jca.tennisstats.model.Player;
import org.jca.tennisstats.service.CountryService;
import org.jca.tennisstats.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/list")
    public Iterable<Country> list() {
        return countryService.list();
    }
}
