package com.example.injeciondependencyspring.controller;

import com.example.injeciondependencyspring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController // @Controller estereotipo, @ResponseBody para poder retorner JSON
@RequestMapping("/persons") //se lo usa en los methodos y en las clases para definir "el mapeo"
public class PersonController {

    //(required= false) : por defecto es true, se pone falso para que funcione en tiempo de ejecucio y rompa en tiempo de compilacion
    //Ya que no va a encontrar a ninguna implementacion de PersonService, nullexception
    @Autowired //Injeccion PersonService SINGLETON como dependencia
    @Qualifier("real") //decimos que queremos la clase que tiene

    //Tambien se lo puede declarar en el stereotipo
    //Scope("prototype")//The scope of a bean defines the life cycle and visibility of that bean in the contexts we use it.
    //prototype -> se creará una nueva instancia cada vez que se solicite el bean
    //request @RequestScope -> Esto es lo mismo que el alcance del prototipo, sin embargo, está destinado a ser utilizado
    //para aplicaciones web. Se creará una nueva instancia del bean para cada solicitud HTTP.
    //session -> El contenedor creará un nuevo bean para cada sesión HTTP.
    //global-session -> Se utiliza para crear beans de sesión globales para aplicaciones de Portlet.
    private PersonService personService;

    //No es necesario poner @Autowired, ya que lo tiene por default
    //Ponemos el @Qualifier(calificatorio) dentro del parametro
    public PersonController(@Qualifier("real") PersonService personService) {
        this.personService = personService;
    }
    @Autowired
    public void setPersonService(@Qualifier("fake") PersonService personService) {
        this.personService = personService;
    }
}
