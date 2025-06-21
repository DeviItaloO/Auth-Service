package com.SaludVital_T2_ESPINOZA_ITALO.infraestructure.repository;

import com.SaludVital_T2_ESPINOZA_ITALO.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByClientId(String clientId);
}
