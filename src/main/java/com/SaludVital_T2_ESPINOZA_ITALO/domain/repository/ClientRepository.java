package com.SaludVital_T2_ESPINOZA_ITALO.domain.repository;

import com.SaludVital_T2_ESPINOZA_ITALO.domain.model.Client;

import java.util.Optional;

public interface ClientRepository {
    Optional<Client> findByClientId(String clientId);
}
