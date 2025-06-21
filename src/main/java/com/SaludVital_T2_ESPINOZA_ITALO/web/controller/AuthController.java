package com.SaludVital_T2_ESPINOZA_ITALO.web.controller;

import com.SaludVital_T2_ESPINOZA_ITALO.application.service.AuthService;
import com.SaludVital_T2_ESPINOZA_ITALO.application.dto.GenerateTokenRequest;
import com.SaludVital_T2_ESPINOZA_ITALO.application.dto.GenerateTokenResponse;

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