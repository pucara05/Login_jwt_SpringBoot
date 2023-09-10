package com.prueba.praticando.controllers;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@controller
//@ResponseBody
@RestController
@RequestMapping("/api")
public class ControladorBasico {


    @GetMapping("/home")
    public String saludar(){
        return "index";
    }
    

    @GetMapping("/login")
    public String  login(){
        return "login";
    }




}
