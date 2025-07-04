package com.proyecto.application.service;

import com.proyecto.application.dto.GenerateTokenRequest;
import com.proyecto.application.dto.GenerateTokenResponse;

public interface AuthService {
    GenerateTokenResponse generateToken(GenerateTokenRequest generateTokenRequest);
}
