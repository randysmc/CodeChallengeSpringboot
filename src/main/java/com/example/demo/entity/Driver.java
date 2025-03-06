package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
//Para obtener getter, setter...
@Data
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    private int age;
}


