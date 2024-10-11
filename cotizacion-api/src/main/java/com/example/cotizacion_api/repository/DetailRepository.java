package com.example.cotizacion_api.repository;

import com.example.cotizacion_api.model.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
