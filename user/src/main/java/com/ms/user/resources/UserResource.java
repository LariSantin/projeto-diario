package com.ms.user.resources;

import com.ms.user.dtos.UserRequestDTO;
import com.ms.user.dtos.UserResponseDTO;
import com.ms.user.entities.User;
import com.ms.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;


    @PostMapping
    public ResponseEntity<UserResponseDTO> createJournal(@RequestBody UserRequestDTO request){
        return ResponseEntity.ok(service.createUser(request));
    }

    @GetMapping("/search")
    public ResponseEntity<UserResponseDTO> findByEmail(@PathVariable String email){
        return ResponseEntity.ok(service.findByEmail(email));
    }

}
