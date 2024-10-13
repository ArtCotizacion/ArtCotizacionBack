package com.example.cotizacion_api.service;

import com.example.cotizacion_api.model.dto.UserRequestDTO;
import com.example.cotizacion_api.model.dto.UserResponseDTO;
import com.example.cotizacion_api.model.entity.User;

import java.util.List;

public interface UserService {
    public List<UserResponseDTO> getAllUsers();
    public List<User> getPrivateUsers();
    public void addUser(UserRequestDTO user);
    public void deleteUser(int userId);
    public boolean login(UserRequestDTO user);
}
