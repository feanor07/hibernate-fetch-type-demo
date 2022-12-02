package com.dilek.alptug.hibernatefetchtypedemo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="pet")
@Data
public class Pet {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private PetType petType;
    @OneToOne(mappedBy = "pet", fetch = FetchType.LAZY, optional = false)
    private PetInfo petInfo;
}
