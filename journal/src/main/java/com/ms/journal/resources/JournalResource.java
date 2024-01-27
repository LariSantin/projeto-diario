package com.ms.journal.resources;

import com.ms.journal.dtos.JournalRequestDTO;
import com.ms.journal.dtos.JournalResponseDTO;
import com.ms.journal.services.JournalService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/journals")
public class JournalResource {

    @Autowired
    private JournalService service;


    @PostMapping
    public ResponseEntity<JournalResponseDTO> createJournal(@RequestBody JournalRequestDTO request){
        return ResponseEntity.ok(service.createJournal(request));
    }


    @GetMapping
    public ResponseEntity<List<JournalResponseDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<JournalResponseDTO> findById(@PathVariable UUID id){
        return ResponseEntity.ok(service.findById(id));
    }
}
