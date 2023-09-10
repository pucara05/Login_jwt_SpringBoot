package com.prueba.praticando.Auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {


    private final AuthService authService;

    //metodos de pruebas para login
    @PostMapping(value = "login")
    public ResponseEntity<AuthResponse> login (@RequestBody LoginRequest request)
    {
        return ResponseEntity.ok(authService.login(request));
    }

    //metodos de pruebas para register
    @PostMapping(value = "register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request)
    {
        return ResponseEntity.ok(authService.register(request));

    }

}
