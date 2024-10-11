package com.example.cotizacion_api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDTO {
    private String codigo;
    private String descripcion;
    private Integer cantidad;
    private Double valorUnitario;
    private Double precioUnitario;
}
