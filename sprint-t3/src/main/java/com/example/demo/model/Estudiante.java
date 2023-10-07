package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import jakarta.persistence.JoinColumn;

@Entity

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
			String ciudadReside) {
		this.id = nro_libreta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nro_doc = nro_doc;
		this.edad = edad;
		this.genero = genero;
		this.ciudad_reside = ciudadReside;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getNroDoc() {
		return nro_doc;
	}

	public void setNroDoc(Integer nrodoc) {
		this.nro_doc = nrodoc;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCiudadReside() {
		return ciudad_reside;
	}

	public void setCiudadReside(String ciudad) {
		this.ciudad_reside = ciudad;
	}



	@Override
	public String toString() {
		return "\nEstudiante [id=" + id + ", nombre= " + nombre + " Apellido= " + apellido + ", nro_doc="
				+ nro_doc + " Género: " + genero
				+ ", ciudad residente= " + ciudadReside + "]";
	}

}

