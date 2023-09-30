package com.example.demo.controlers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepo;



@RestController
@RequestMapping("/p")
public class PersonaC {
   
    @Autowired
    private PersonaRepo personaRepo;

    @GetMapping
    public Iterable<Persona> persona() {return personaRepo.findAll();}

    // @PostMapping("/cargar")
    // public void cargar(){
    //     Persona p=new Persona((long)3,"tres");
    //     personaRepo.save(p);
    // }
    
}
