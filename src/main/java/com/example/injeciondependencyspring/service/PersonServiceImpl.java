package com.example.injeciondependencyspring.service;

import com.example.injeciondependencyspring.model.Person;
import com.example.injeciondependencyspring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

//@RequestScope
//@Scope("prototype")
@Service("real") // Estereotipo para generar un bean
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    // matchByName para usarlo podemos usar @Resource("myPersonBean")
    // mmatchByType  solo usariamos @Resource
    @Bean(name="myPersonBean")
    public Person createPerson(){
        return new Person();
    }
}
