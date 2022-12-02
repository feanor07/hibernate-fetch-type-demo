package com.dilek.alptug.hibernatefetchtypedemo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="pet_info")
@Data
public class PetInfo {
    @Id
    @GeneratedValue
    private Long id;
    private String favoriteFood;
    private int birthYear;
    @OneToOne
    @JoinColumn(name = "pet_id" , referencedColumnName = "id")
    private Pet pet;
}

