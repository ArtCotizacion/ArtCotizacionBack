package com.example.cotizacion_api.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detail")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "det_id_in")
    private int id;

    @Column(name = "det_subT_dob")
    private double subTotal;

    @Column(name = "det_op_gr_dob")
    private double opGravadas;

    @Column(name = "det_dsc_glo_dob")
    private double dsctoGlobales;

    @Column(name = "det_igv_dob")
    private double igv;

    @Column(name = "det_tot_cot_dob")
    private double totalCotizacion;

    @Column(name = "det_obs_dob")
    private double observacion;

    @Column(name = "det_tp_dob")
    private double totalPalabras;
}
