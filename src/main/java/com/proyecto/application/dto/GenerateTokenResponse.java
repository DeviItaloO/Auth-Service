package com.proyecto.application.dto;

public record GenerateTokenResponse(String token, String tokenType, Long expiresInSeconds) {
}
