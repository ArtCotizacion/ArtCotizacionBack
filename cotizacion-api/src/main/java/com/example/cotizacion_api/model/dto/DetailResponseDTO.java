package com.example.cotizacion_api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailResponseDTO {
    private double subTotal;
    private double opGravadas;
    private double dsctoGlobales;
    private double igv;
    private double totalCotizacion;
    private double observacion;
    private double totalPalabras;
}
