package com.proyecto.infraestructure.repository;

import com.proyecto.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByClientId(String clientId);
}
