package com.example.injeciondependencyspring.service;

import com.example.injeciondependencyspring.model.Person;
import org.springframework.stereotype.Service;

@Service("fake") // Estereotipo para generar un bean
public class PersonServiceImpl_FAKE implements PersonService{

    @Override
    public void save(Person person) {
        System.out.println("No guardaste NADAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
