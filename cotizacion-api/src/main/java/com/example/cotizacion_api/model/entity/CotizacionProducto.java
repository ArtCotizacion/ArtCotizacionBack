package com.example.cotizacion_api.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cotizacion_producto")
public class CotizacionProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cp_id_in")
    private int id;

    @Column(name = "cp_cantidad")
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "cot_id_in", nullable = false)
    private Cotizacion cotizacion;

    @ManyToOne
    @JoinColumn(name = "pro_id_in", nullable = false)
    private Product product;
}
