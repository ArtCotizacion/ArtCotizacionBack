package com.example.cotizacion_api.service.impl;

import com.example.cotizacion_api.execption.ResourceNotFoundException;
import com.example.cotizacion_api.mapper.ClientMapper;
import com.example.cotizacion_api.model.dto.ClientResponseDTO;
import com.example.cotizacion_api.model.entity.Client;
import com.example.cotizacion_api.repository.ClientRepository;
import com.example.cotizacion_api.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public List<ClientResponseDTO> getAllClients() {
        List<Client> clients = clientRepository.findAll();
        return clientMapper.convertToListDTO(clients);
    }

    @Override
    public ClientResponseDTO getClientById(int id) {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Localizacion no encontrada con el numero de ID"+id));
        return clientMapper.convertToDTO(client);
    }
    public Client getClientEntity(int id){
        Client client = clientRepository.findById(id).orElseThrow(null);
        return client;
    }
    @Override
    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }

    public Optional<Integer> findClientIdByNumero(String numero) {
        return clientRepository.findByNumero(numero)
                .map(Client::getId);
    }

}
