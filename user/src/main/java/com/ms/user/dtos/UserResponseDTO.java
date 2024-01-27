package com.ms.user.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserResponseDTO {


    private UUID id;
    private String email;
    private String name;

    public UserResponseDTO() {
    }

    public UserResponseDTO(UUID id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }
}
