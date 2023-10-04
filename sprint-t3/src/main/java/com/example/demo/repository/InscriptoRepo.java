package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ClaveCompuestaInscripto;
import com.example.demo.model.Inscripto;






public interface InscriptoRepo extends JpaRepository<Inscripto, ClaveCompuestaInscripto>{

	

	
}