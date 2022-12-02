package com.dilek.alptug.hibernatefetchtypedemo.service;

import com.dilek.alptug.hibernatefetchtypedemo.model.PetLightDTO;
import com.dilek.alptug.hibernatefetchtypedemo.repository.PetRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<PetLightDTO> findAllPets() {
        return petRepository.findAll().stream().map(PetLightDTO::new).collect(Collectors.toList());
    }
}
