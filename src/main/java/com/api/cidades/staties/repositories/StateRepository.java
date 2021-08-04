package com.api.cidades.staties.repositories;

import com.api.cidades.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
