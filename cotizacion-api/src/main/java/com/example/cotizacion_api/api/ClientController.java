package com.example.cotizacion_api.api;

import com.example.cotizacion_api.model.dto.ClientResponseDTO;
import com.example.cotizacion_api.service.impl.ClientServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
@AllArgsConstructor
public class ClientController {
    private final ClientServiceImpl clientServiceImpl;

    @GetMapping
    public ResponseEntity<List<ClientResponseDTO>> findAll() {
        List<ClientResponseDTO> solicitante = clientServiceImpl.getAllClients();
        return new ResponseEntity<>(solicitante, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientResponseDTO> findById(@PathVariable int id) {
        ClientResponseDTO solicitante = clientServiceImpl.getClientById(id);
        return new ResponseEntity<>(solicitante, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteSolicitante(@PathVariable int id) {
        clientServiceImpl.deleteClient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/searchByDni/{numero}")
    public ResponseEntity<Integer> findSolicitanteIdByNumero(@PathVariable String numero) {
        Optional<Integer> solicitanteId = clientServiceImpl.findClientIdByNumero(numero);
        if (solicitanteId.isPresent()) {
            return new ResponseEntity<>(solicitanteId.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
