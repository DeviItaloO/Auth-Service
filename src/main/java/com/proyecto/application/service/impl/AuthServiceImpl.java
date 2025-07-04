package com.proyecto.application.service.impl;

import com.proyecto.application.dto.GenerateTokenRequest;
import com.proyecto.application.dto.GenerateTokenResponse;
import com.proyecto.application.service.AuthService;
import com.proyecto.domain.repository.ClientRepository;
import com.proyecto.infraestructure.token.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final ClientRepository clienteRepository;
    private final JwtService jwtService;

    @Override
    public GenerateTokenResponse generateToken(GenerateTokenRequest generateTokenRequest) {
        var client = clienteRepository.findByClientId(generateTokenRequest.clientId())
                .orElseThrow(()-> new RuntimeException("Cliente con id invalido"));
        if(!client.isEnabled() || !client.getClientSecret().equals(generateTokenRequest.clientSecret())){
            throw new RuntimeException("Credenciales invalidas");
        }
        String token = jwtService.generateToken(client);
        Date expiration = jwtService.extractExpiration(token);
        Long secondsToExpire = (expiration.getTime() - System.currentTimeMillis())/1000;
        return new GenerateTokenResponse(token, "Bearer", secondsToExpire);
    }
}
