package com.example.injeciondependencyspring.repository;

import com.example.injeciondependencyspring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Estereotipo para generar un bean
public interface PersonRepository extends JpaRepository<Person,Long> {
}
