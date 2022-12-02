package com.dilek.alptug.hibernatefetchtypedemo.controller;

import com.dilek.alptug.hibernatefetchtypedemo.model.PetLightDTO;
import com.dilek.alptug.hibernatefetchtypedemo.service.PetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/pets")
    // curl -X GET http://localhost:8080/pets
    public Collection<PetLightDTO> getPets() {
        return petService.findAllPets();
    }
}
