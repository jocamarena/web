package com.mytest.web.repositories;

import com.mytest.web.domain.Memory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MemoryRepository extends JpaRepository<Memory, Long> {
    public List<Memory> findAllByDateEntryAfter(LocalDate dateEntry);
}
