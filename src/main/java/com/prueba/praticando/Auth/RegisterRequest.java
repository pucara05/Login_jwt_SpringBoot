package com.prueba.praticando.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    
    Integer id;
    String username;
    String password;
    String name;
    String lastname;
    String email;
    String country;
    String phone;
}
