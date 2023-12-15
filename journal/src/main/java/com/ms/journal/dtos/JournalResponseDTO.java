package com.ms.journal.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class JournalResponseDTO {

    private UUID id;
    private Long dia;
    private Long mes;
    private Long ano;
    private String text;
}
