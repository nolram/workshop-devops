package br.com.southsystem.workshop.appcrud.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloResource{

    @GetMapping("/")
    public String root(){
        return "Hello";
    }

    @GetMapping("/moto")
    public String moto(){
        return "Hello Moto!";
    }
}