package com.eCommerce.backend.Dto;

import lombok.Data;

@Data
public class LoginDto {
    private String email;
    private String username;
    private String password;
}
