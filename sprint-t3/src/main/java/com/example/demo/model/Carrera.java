package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data

public class Carrera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_carrera;

    // Relación con Inscripto
    @OneToMany(mappedBy = "carrera")
    private List<Inscripto> inscripciones;

	@Column
	private String nombre;

	@Column
	private int duracion;

	@Column
	private String institucion;
	
	
	@ManyToMany(mappedBy = "carreras")
    private List<Estudiante> estudiantes;
	
	public Carrera() {
		super();
	}

	public Carrera(String nombre, int duracion, String institucion) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.institucion = institucion;
	}

	

	@Override
	public String toString() {
		return "\nCarrera [id_carrera= " + id_carrera + ", nombre= " + nombre + ", duracion= " + duracion + ", institucion= "
				+ institucion + "]";
	}

}

	/*
	 {
		"nombre":"arquitectura",
		"duracion":5,
		"institucion":"UNICEN"
	
	 }
	 */