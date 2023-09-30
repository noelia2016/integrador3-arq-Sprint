package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.CarreraConCantidadDTO;
import com.example.demo.entity.Carrera;
import com.example.demo.repository.CarreraRepo;

@RestController
@RequestMapping("/carrera")
public class CarreraC {
    @Autowired
    private CarreraRepo repo;

    @GetMapping
    public List<Carrera> listarCarreras(){
        return repo.findAll();
    }

    @PostMapping
    public void grabarCarrera(@RequestBody Carrera c){
        repo.save(c);
    }

    @GetMapping("/anotados")
    public List<CarreraConCantidadDTO> listarCarrerasConInscriptos() {
        return repo.listaCarrerasConInscriptos();
    }

    // @GetMapping("/anotados")
    // public List<Carrera> listarCarrerasConInscriptos() {
    //     return repo.listarCarrerasConInscriptos();
    // }




}
