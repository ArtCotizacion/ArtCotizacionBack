package com.example.cotizacion_api.api;

import com.example.cotizacion_api.mapper.UserMapper;
import com.example.cotizacion_api.model.dto.UserResponseDTO;
import com.example.cotizacion_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/public")
@CrossOrigin(origins = {"https://fguevara-guevara.web.app","http://localhost:4200"}, allowCredentials = "true")
public class PublicController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @CrossOrigin(origins = {"https://fguevara-guevara.web.app","http://localhost:4200"}, allowCredentials = "true")
    @GetMapping("/users")
    public ResponseEntity<List<UserResponseDTO>> getPublicUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
}
