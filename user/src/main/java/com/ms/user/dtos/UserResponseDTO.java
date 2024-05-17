package com.ms.user.dtos;

import com.ms.user.entities.User;

import java.util.UUID;

public record UserResponseDTO(UUID id, String email, String name)  {
    public UserResponseDTO (User user){
        this(user.getId(), user.getEmail(), user.getEmail());
    }
}
