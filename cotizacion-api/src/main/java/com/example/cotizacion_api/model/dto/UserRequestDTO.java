package com.example.cotizacion_api.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRequestDTO {
    @NotBlank(message = "El nombre de usuario no puede estar vacio")
    private String username;
    @NotBlank(message = "Ingrese la contraseña")
    private String password;
}
