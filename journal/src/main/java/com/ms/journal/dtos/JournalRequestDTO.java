package com.ms.journal.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JournalRequestDTO {

    private Long dia;
    private Long mes;
    private Long ano;
    private String text;
}
