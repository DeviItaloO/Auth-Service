package com.SaludVital_T2_ESPINOZA_ITALO.application.service;

import com.SaludVital_T2_ESPINOZA_ITALO.application.dto.GenerateTokenRequest;
import com.SaludVital_T2_ESPINOZA_ITALO.application.dto.GenerateTokenResponse;

public interface AuthService {
    GenerateTokenResponse generateToken(GenerateTokenRequest generateTokenRequest);
}
