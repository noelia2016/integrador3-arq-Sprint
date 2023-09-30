package com.example.demo.controler;

import java.util.List;
import java.util.Map;
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

import com.example.demo.entity.Carrera;
import com.example.demo.entity.Estudiante;
import com.example.demo.entity.Inscripto;
import com.example.demo.repository.CarreraRepo;
import com.example.demo.repository.EstudianteRepo;
import com.example.demo.repository.InscriptoRepo;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/inscripto")
public class InscriptoC {

    @Autowired
    private InscriptoRepo repo;

    @Autowired
    private EstudianteRepo estudianteRepo;

    @Autowired
    private CarreraRepo carreraRepo;

    @GetMapping
    public List<Inscripto> listarInscriptos() {
        return repo.findAll();
    }

    @PostMapping
    public Inscripto inscribir(@RequestBody Map<String, Integer> json) {
        Optional<Estudiante> e = estudianteRepo.findById((long) json.get("nro_libreta"));
        Optional<Carrera> c = carreraRepo.findById((long) json.get("id_carrera"));
        Inscripto i = new Inscripto(e.get(), c.get(), (int) json.get("fecha"));
        return repo.save(i);
    }

   
    



}
