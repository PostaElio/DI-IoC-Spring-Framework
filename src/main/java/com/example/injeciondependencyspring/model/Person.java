package com.example.injeciondependencyspring.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String address;
    private String email;

}
