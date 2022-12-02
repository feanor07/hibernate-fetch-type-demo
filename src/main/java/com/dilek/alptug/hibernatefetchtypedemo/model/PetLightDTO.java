package com.dilek.alptug.hibernatefetchtypedemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PetLightDTO {
    private Long id;
    private String name;
    private PetType petType;

    public PetLightDTO(Pet pet) {
        this.id = pet.getId();
        this.name = pet.getName();
        this.petType = pet.getPetType();
    }
}
