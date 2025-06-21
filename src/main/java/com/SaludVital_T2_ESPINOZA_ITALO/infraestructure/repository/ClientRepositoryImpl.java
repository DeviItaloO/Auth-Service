package com.SaludVital_T2_ESPINOZA_ITALO.infraestructure.repository;


import com.SaludVital_T2_ESPINOZA_ITALO.domain.model.Client;
import com.SaludVital_T2_ESPINOZA_ITALO.domain.repository.ClientRepository;
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
