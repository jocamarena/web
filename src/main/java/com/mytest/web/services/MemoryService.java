package com.mytest.web.services;

import com.mytest.web.domain.Memory;
import com.mytest.web.repositories.MemoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MemoryService {
    private MemoryRepository memoryRepository;
    public MemoryService(MemoryRepository memoryRepository){
        this.memoryRepository = memoryRepository;
    }
    public Optional<Memory> findById(Long id){
        return memoryRepository.findById(id);
    }
    public Memory saveMemory(Memory memory){
        return memoryRepository.save(memory);
    }
    public void deleteMemory(Memory memory){
        memoryRepository.delete(memory);
    }
    public List<Memory> findAllByEntryDateAfterInput(LocalDate date){
        return memoryRepository.findAllByDateEntryAfter(date);
    }
    public List<Memory> findAll(){
        return memoryRepository.findAll();
    }
}
