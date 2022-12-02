package com.dilek.alptug.hibernatefetchtypedemo.repository;

import com.dilek.alptug.hibernatefetchtypedemo.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> { }
