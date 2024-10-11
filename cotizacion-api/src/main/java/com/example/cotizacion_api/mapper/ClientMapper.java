package com.example.cotizacion_api.mapper;

import com.example.cotizacion_api.model.dto.ClientRequestDTO;
import com.example.cotizacion_api.model.dto.ClientResponseDTO;
import com.example.cotizacion_api.model.entity.Client;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ClientMapper {
    private ModelMapper modelMapper;

    public Client convertToEntity(ClientRequestDTO clientRequestDTO) {
        return modelMapper.map(clientRequestDTO, Client.class);
    }

    public ClientResponseDTO convertToDTO(Client client) {
        return modelMapper.map(client, ClientResponseDTO.class);
    }

    public List<ClientResponseDTO> convertToListDTO(List<Client> clients) {
        return clients.stream()
                .map(this::convertToDTO)
                .toList();
    }
}
