package com.example.cotizacion_api.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id_in")
    private int id;

    @Column(name = "pro_cod_vc")
    private String codigo;

    @Column(name = "pro_des_vc")
    private String descripcion;

    @Column(name = "pro_cant_vc")
    private Integer cantidad;

    @Column(name = "pro_val_unit_vc")
    private Double valorUnitario;
}
