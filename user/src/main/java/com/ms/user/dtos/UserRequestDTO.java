package com.ms.user.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {

    private String email;
    private String name;
    private String password;

    public UserRequestDTO(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
