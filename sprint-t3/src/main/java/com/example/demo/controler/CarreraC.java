package com.example.demo.controler;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.CarreraConCantidadDTO;
import com.example.demo.dtos.EstudianteCarreraDTO;
import com.example.demo.entity.Carrera;
import com.example.demo.repository.CarreraRepo;
import com.example.demo.repository.EstudianteRepo;

@RestController
@RequestMapping("/carrera")
public class CarreraC {
    @Autowired
    private CarreraRepo repo;

    // @Autowired
    // private EstudianteRepo estudianteRepo;

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

    @GetMapping("/reporte")
    public List<EstudianteCarreraDTO> reportar(){
        List<EstudianteCarreraDTO> listaCarreras=repo.listaDeIngresos();
        listaCarreras.addAll(repo.listaDeEgresos());
        listaCarreras.sort(Comparator
		.comparing(EstudianteCarreraDTO::getNombreCarrera) 
		.thenComparing(EstudianteCarreraDTO::getFech)
		);


        return listaCarreras;
    }




}
