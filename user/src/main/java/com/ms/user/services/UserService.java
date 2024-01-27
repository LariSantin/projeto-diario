package com.ms.user.services;


import com.ms.user.dtos.UserRequestDTO;
import com.ms.user.dtos.UserResponseDTO;
import com.ms.user.entities.User;
import com.ms.user.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private BCryptPasswordEncoder bCrypt;

    @Autowired
    private UserRepository repository;

    private final ModelMapper modelMapper = new ModelMapper();


    public UserResponseDTO createUser(UserRequestDTO request){

        String passwordEncode = bCrypt.encode(request.getPassword());

        User save = repository.save(new User(
                request.getName(),
                request.getEmail(),
                passwordEncode)
        );

        return modelMapper.map(save, UserResponseDTO.class);

    }

    public UserResponseDTO findByEmail(String email) {

        User user = repository.findByEmail(email);

        return modelMapper.map(user, UserResponseDTO.class);
    }

}
