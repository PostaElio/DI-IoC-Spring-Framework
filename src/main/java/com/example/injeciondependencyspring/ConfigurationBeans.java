package com.example.injeciondependencyspring;

import com.example.injeciondependencyspring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //La anotación Spring Configuration indica que la clase tiene métodos de definición de @Bean.
// Entonces, el contenedor Spring puede procesar la clase y generar Spring Beans para usar en la aplicación.
//La anotación Spring @Configuration nos permite usar anotaciones para la inyección de dependencia.
// Comprendamos cómo crear clases de configuración de Spring
public class ConfigurationBeans {


    //Tenga en cuenta que Spring carga beans en su contexto antes de que lo hayamos solicitado. Esto es para
    //asegurarse de que todos los beans estén configurados correctamente y que la aplicación falle rápidamente si algo sale mal
    //El nombre de la funcion es el nombre del bean
    @Bean
    public Person myPersonBean0(){
        System.out.println("Creando bean person");
        return new Person();
    }
    @Bean
    public Person myPersonBean1(){
        System.out.println("Creando otro bean person");
        return new Person();
    }

}
