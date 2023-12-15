package com.ms.journal.repositories;

import com.ms.journal.entities.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JournalRepository  extends JpaRepository<Journal, UUID> {
}
