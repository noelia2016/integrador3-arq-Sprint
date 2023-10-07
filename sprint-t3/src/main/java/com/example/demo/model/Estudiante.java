package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import jakarta.persistence.JoinColumn;

import lombok.Data;

@Entity
@Data
public class Estudiante {
	@Id
	@Column(name = "nro_libreta")
	private Integer id;

	// Relación con Inscripto
	@OneToMany(mappedBy = "estudiante")
	private List<Inscripto> inscripciones;

	@Column
	private String nombre;

	@Column
	private String apellido;

	@Column(name = "dni")
	private Integer nro_doc;

	@Column
	private Integer edad;

	@Column
	private String genero;

	@Column(name = "ciudad")
	private String ciudad_reside;

	@ManyToMany
	@JoinTable(name = "Inscripto", joinColumns = @JoinColumn(name = "nro_libreta"), inverseJoinColumns = @JoinColumn(name = "carrera"))
	private List<Carrera> carreras;

	public Estudiante() {
		super();
	}

	public Estudiante(int nro_libreta, String nombre, String apellido, Integer nro_doc, Integer edad, String genero,
			String ciudad_reside) {
		this.id = nro_libreta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nro_doc = nro_doc;
		this.edad = edad;
		this.genero = genero;
		this.ciudad_reside = ciudad_reside;
	}


	@Override
	public String toString() {
		return "\nEstudiante [id=" + id + ", nombre= " + nombre + " Apellido= " + apellido + ", nro_doc="
				+ nro_doc + " Género: " + genero
				+ ", ciudad residente= " + ciudad_reside + "]";
	}

}

/*
{
	"nro_libreta":123,
    "nombre":"pepe",
    "apellido":"lugones",
    "nro_doc":29550550,
    "edad":22,
    "genero":"mas",
    "ciudad":"3a"
}
	*/