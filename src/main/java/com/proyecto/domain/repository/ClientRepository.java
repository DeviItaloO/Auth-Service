package com.proyecto.domain.repository;

import com.proyecto.domain.model.Client;

import java.util.Optional;

public interface ClientRepository {
    Optional<Client> findByClientId(String clientId);
}
