
package com.nicospring.prueba.controller;

//Seteamos la Anotation de que este es un controlador con @RestController

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    
    
    //Creacion de metodo
    @GetMapping
    public String sayHello(){
        return "Hola Mundo, esto es una prueba de API";
    }
    
    
}
