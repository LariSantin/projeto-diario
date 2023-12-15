package com.ms.journal.resources;

import com.ms.journal.dtos.JournalRequestDTO;
import com.ms.journal.dtos.JournalResponseDTO;
import com.ms.journal.services.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/journal")
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
}
