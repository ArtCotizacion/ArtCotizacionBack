package com.example.cotizacion_api.service;

import com.example.cotizacion_api.model.dto.ClientResponseDTO;

import java.util.List;

public interface ClientService {
    List<ClientResponseDTO> getAllClients();
    ClientResponseDTO getClientById(int id);
    void deleteClient(int id);
}
