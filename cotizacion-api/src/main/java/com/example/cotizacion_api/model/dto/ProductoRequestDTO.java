package com.example.cotizacion_api.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoRequestDTO {
    @NotBlank(message = "El nombre no puede estar vacio")
    private String codigo;

    @NotBlank(message = "El nombre no puede estar vacio")
    private String descripcion;

    @NotBlank(message = "El nombre no puede estar vacio")
    private Integer cantidad;

    @NotBlank(message = "El nombre no puede estar vacio")
    @Pattern(regexp = "[0-9]+", message = "El numero de DNI debe contener solo digitos")
    private Double valorUnitario;
}
