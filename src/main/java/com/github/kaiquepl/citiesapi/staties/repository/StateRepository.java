package com.github.kaiquepl.citiesapi.staties.repository;

import com.github.kaiquepl.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
