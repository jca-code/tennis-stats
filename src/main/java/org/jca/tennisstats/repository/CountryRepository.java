package org.jca.tennisstats.repository;

import java.util.List;

import org.jca.tennisstats.model.Country;
import org.jca.tennisstats.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, String> {
	
}
