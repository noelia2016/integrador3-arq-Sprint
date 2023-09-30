package com.example.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Estudiante;
import com.example.demo.repository.EstudianteRepo;

@RestController
@RequestMapping("/estudiante")
public class EstudianteC {

    @Autowired
    private EstudianteRepo repo;

    @GetMapping
    public List<Estudiante> listarEstudiantes() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Estudiante> estudianteXlibreta(@PathVariable Long id) {
        return repo.findById(id);
    }
    @GetMapping("/s/{sexo}")
    public List<Estudiante> xGenero(@PathVariable String sexo){
        return repo.xGenero(sexo);
    }

    @PostMapping
    public void grabarEstudiante(@RequestBody Estudiante e) {
        repo.save(e);
    }

}
