
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
    
    
    /*=========EJERCICIO 1 PathVariable=========*/
    //Suma de 2 numeros
    @GetMapping("/ejer1/{n1}/{n2}")
    public String ejercicio1(@PathVariable int n1,
                             @PathVariable int n2){
        
        int suma = n1 + n2;
        return "La suma de: "+n1+" + "+n2+"   es: "+ suma;
    }
    
    
    /*=========EJERCICIO 2 RequestParam=========*/
    //Devolver el estado de masa corporal de la persona
    @GetMapping("/ejer2")
    public String ejercicio2(@RequestParam double peso){
        String resultado = null;
        
        if(peso >= 1 && peso <= 18.5){
            resultado = "Peso Insuficiente";
        }
        else if(peso >= 18.6 && peso <= 24.9){
                    resultado = "Peso normal";}
        else if(peso >= 25 && peso <= 29.9){
                    resultado = "Sobrepeso";}
        else if(peso >= 30){
                    resultado = "Obesidad";}
        
        return resultado;
    }
    
    
    
}
