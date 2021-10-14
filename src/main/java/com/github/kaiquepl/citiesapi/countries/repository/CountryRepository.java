package com.github.kaiquepl.citiesapi.countries.repository;

import com.github.kaiquepl.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
