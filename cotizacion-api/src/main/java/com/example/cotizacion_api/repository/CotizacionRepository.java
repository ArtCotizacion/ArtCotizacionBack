package com.example.cotizacion_api.repository;

import com.example.cotizacion_api.model.entity.Cotizacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CotizacionRepository extends JpaRepository<Cotizacion, Integer> {
}
