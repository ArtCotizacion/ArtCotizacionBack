package com.example.cotizacion_api.service.impl;

import com.example.cotizacion_api.mapper.UserMapper;
import com.example.cotizacion_api.model.dto.UserRequestDTO;
import com.example.cotizacion_api.model.dto.UserResponseDTO;
import com.example.cotizacion_api.model.entity.User;
import com.example.cotizacion_api.repository.UserRepository;
import com.example.cotizacion_api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserResponseDTO> getAllUsers() {
        if(userMapper.converToListDTO(userRepository.findAll())!=null)
        {
            return userMapper.converToListDTO(userRepository.findAll());
        }
        else
        {
            throw  new NullPointerException("Error no se encontraron usuarios");
        }
    }

    @Override
    public void addUser(UserRequestDTO user) {
        User euser= userMapper.convertToEntity(user);
        String usernameprovided = euser.getUsername();
        if(userRepository.findByUsername(usernameprovided)!=null)
        {
            throw  new IllegalArgumentException("Error el usuario ya existe");
        }
        userRepository.save(euser);
    }

    @Override
    public void deleteUser(int userId) {
        User user= userRepository.findById(userId).orElse(null);
        if (user != null) {
            userRepository.delete(user);
        }
        else {
            throw  new NullPointerException("Error el usuario no existe");
        }
    }

    @Override
    public boolean login(UserRequestDTO user) {
        String usernameprovided = user.getUsername();
        String passwordprovided = user.getPassword();

        User user1 = userRepository.findByUsername(usernameprovided);

        if (user1==null) {
            return false;
        }

        if (user1.getPassword().equals(passwordprovided)) {
            return true;
        }

        return false;
    }

    @Override
    public List<User> getPrivateUsers() {
        return userRepository.findAll();
    }
}