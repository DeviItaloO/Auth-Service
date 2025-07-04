package com.proyecto.infraestructure.repository;


import com.proyecto.domain.model.Client;
import com.proyecto.domain.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ClientRepositoryImpl implements ClientRepository {
    private final JpaClientRepository jpaClientRepository;

    @Override
    public Optional<Client> findByClientId(String clientId) {
        return jpaClientRepository.findByClientId(clientId);
    }
}
