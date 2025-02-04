package com.eCommerce.backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersResponseDto {
    private String message;
    private boolean success;
    private Object data;
}
