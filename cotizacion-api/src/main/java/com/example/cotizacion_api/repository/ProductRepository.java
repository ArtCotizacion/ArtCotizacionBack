package com.example.cotizacion_api.repository;

import com.example.cotizacion_api.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
