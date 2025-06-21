package com.SaludVital_T2_ESPINOZA_ITALO.application.dto;

public record GenerateTokenResponse(String token, String tokenType, Long expiresInSeconds) {
}
