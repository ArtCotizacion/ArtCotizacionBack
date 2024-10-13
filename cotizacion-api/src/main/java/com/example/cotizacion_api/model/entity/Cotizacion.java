package com.example.cotizacion_api.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cotizacion")
public class Cotizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cot_id_in")
    private int id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "cot_emision_dt")
    private LocalDate fechaEmision;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "cot_fec_ven_dt")
    private LocalDate fechaVencimiento;

    @Column(name = "cot_moneda_date")
    private String tipoMoneda;

    @OneToMany(mappedBy = "cotizacion", cascade = CascadeType.ALL)
    private List<CotizacionProducto> productos;

    @ManyToOne
    @JoinColumn(name = "cli_id_in", nullable = false)
    private Client cliente;

    @OneToOne(mappedBy = "cotizacion", cascade = CascadeType.ALL)
    private Detail detalle;
}
