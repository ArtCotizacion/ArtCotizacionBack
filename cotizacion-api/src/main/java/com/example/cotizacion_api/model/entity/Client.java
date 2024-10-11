package com.example.cotizacion_api.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_id_in")
    private int id;

    @Column(name = "cli_dni_vc")
    private String numero;

    @Column(name = "cli_nom_vc")
    private String nombres;
}
