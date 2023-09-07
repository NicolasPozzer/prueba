
package com.nicospring.prueba.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//Seteamos la Anotation de que este es un controlador con @RestController
@RestController
public class HelloController {
    
    
    /*=========@GetMapping=========*/
    //Creacion de metodo
    @GetMapping("/hola")
    public String sayHello(){
        return "Hola Mundo, esto es una prueba de API";
    }
    
    @GetMapping("/chau")
    public String sayBay(){
        return "Chau Mundo, Un gusto!!";
    }
    
    
    /*=========@PathVariable=========*/
    //Creacion de metodo con parametro agregable a la URL
    /*==Asi se llama: http://localhost:8080/saludo/Nicolas ==*/
    @GetMapping("/saludo/{nombre}")
    public String sayHelloyNombre(@PathVariable String nombre){
        return "Hola " + nombre + " Como estas?";
    }
    
    //Creacion de metodo con varios parametros agregable a la URL
    @GetMapping("/datos/{nombre}/{edad}/{profesion}")
    public String sayDatos(@PathVariable String nombre,
                            @PathVariable int edad ,
                            @PathVariable String profesion){
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nPofesion: " + profesion;
    }
    
    
    /*=========@RequestParam=========*/
    /*==Asi se llama: http://localhost:8080/saludo2?nombre=NicolasPozzer ==*/
    @GetMapping("/saludo2")
    public String sayHelloyNombresito(@RequestParam String nombre){
        return "Hola " + nombre + " Como estas?";
    }
    
    
    @GetMapping("/datos2")
    /*==Asi se llama: http://localhost:8080/datos2?nombre=NicolasPozzer&edad=23&profesion=Tenista ==*/
    public String sayDatosito(@RequestParam String nombre,
                            @RequestParam int edad ,
                            @RequestParam String profesion){
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nPofesion: " + profesion;
    }
    
    
    
    
}
