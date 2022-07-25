package org.jca.tennisstats.service;

import org.jca.tennisstats.model.Country;
import org.jca.tennisstats.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country save(Country country) {
        return countryRepository.save(country);
    }
    
    public Iterable<Country> list() {
    	
    	return countryRepository.findAll();
    }

}
