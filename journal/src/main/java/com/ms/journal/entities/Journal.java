package com.ms.journal.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_journal")
@Getter
@Setter
public class Journal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Long dia;
    private Long mes;
    private Long ano;
    private String text;

    public Journal() {
    }

    public Journal(Long dia, Long mes, Long ano, String text) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.text = text;
    }
}
