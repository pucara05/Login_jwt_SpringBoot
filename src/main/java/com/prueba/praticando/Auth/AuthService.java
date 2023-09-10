package com.prueba.praticando.Auth;

import org.springframework.stereotype.Service;

import com.prueba.praticando.Jwt.JwtService;
import com.prueba.praticando.User.Role;
import com.prueba.praticando.User.User;
import com.prueba.praticando.User.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor


public class AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        User user = User.builder()
        .username(request.getUsername())
        .password(request.getPassword())
        .name(request.getName())
        .lastname(request.getLastname())
        .email(request.getEmail())
        .phone(request.getPhone())
        .role(Role.USER)
        .build();

        userRepository.save(user);

        return AuthResponse.builder()
        .token(jwtService.getToken(user))
        .build();
    }

}
