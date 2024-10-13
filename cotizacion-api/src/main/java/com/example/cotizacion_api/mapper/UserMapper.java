package com.example.cotizacion_api.mapper;

import com.example.cotizacion_api.model.dto.UserRequestDTO;
import com.example.cotizacion_api.model.dto.UserResponseDTO;
import com.example.cotizacion_api.model.entity.User;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class UserMapper {

    private  final ModelMapper modelMapper;

    public User convertToEntity(UserRequestDTO userRequestDTO)
    {
        return modelMapper.map(userRequestDTO, User.class);
    }

    public UserResponseDTO converToResponseDto(User user)
    {
        return modelMapper.map(user, UserResponseDTO.class);
    }
    public UserRequestDTO converToRequestDto(User user)
    {
        return modelMapper.map(user, UserRequestDTO.class);
    }
    public List<UserResponseDTO> converToListDTO(List<User> users){
        return users.stream().map(this::converToResponseDto).toList();
    }

}
