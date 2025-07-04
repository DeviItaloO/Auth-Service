package com.proyecto.web.controller;

import com.proyecto.application.service.AuthService;
import com.proyecto.application.dto.GenerateTokenRequest;
import com.proyecto.application.dto.GenerateTokenResponse;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("/token")
    public ResponseEntity<GenerateTokenResponse> generateToken(@RequestBody GenerateTokenRequest request){
        GenerateTokenResponse reponse = authService.generateToken(request);
        return ResponseEntity.ok(reponse);
    }
}