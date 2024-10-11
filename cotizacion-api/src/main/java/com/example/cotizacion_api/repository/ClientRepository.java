package com.example.cotizacion_api.repository;

import com.example.cotizacion_api.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    Optional<Client> findByNumero(String numero);
}
