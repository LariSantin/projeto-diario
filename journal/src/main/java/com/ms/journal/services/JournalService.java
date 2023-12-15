package com.ms.journal.services;

import com.ms.journal.dtos.JournalRequestDTO;
import com.ms.journal.dtos.JournalResponseDTO;
import com.ms.journal.entities.Journal;
import com.ms.journal.repositories.JournalRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JournalService {


    @Autowired
    private JournalRepository repository;

    private final ModelMapper modelMapper = new ModelMapper();

    public JournalResponseDTO createJournal(JournalRequestDTO request) {

        Journal map = modelMapper.map(request, Journal.class);

        Journal save = repository.save(map);

        return modelMapper.map(save, JournalResponseDTO.class);
    }


    public List<JournalResponseDTO> findAll(){
        List<Journal> all = repository.findAll();

        List<JournalResponseDTO> result = new ArrayList<>();

        for (Journal j: all) {
           result.add(modelMapper.map(j, JournalResponseDTO.class));
        }

        return result;
    }
}
