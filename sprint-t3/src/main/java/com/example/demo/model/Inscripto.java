package com.example.demo.model;

import jakarta.persistence.*;

@Entity

@IdClass(ClaveCompuestaInscripto.class)
public class Inscripto {

	@Id
	@ManyToOne
	@JoinColumn(name = "nro_libreta")
	private Estudiante estudiante;

	@Id
	@ManyToOne
	@JoinColumn(name = "carrera")
	private Carrera carrera;

	@Column
	private int fecha;

	@Column
	private int antiguedad;

	@Column 
	private Integer esEgresado;

	public Inscripto() {
		super();
	}

	public Inscripto(Estudiante e, Carrera c, int fecha) {
		this.estudiante = e;
		this.carrera = c;
		this.fecha = fecha;
	}


	public int getAntiguedad() {
		return antiguedad;
	}

	public Integer isEsEgresado() {
		return esEgresado;
	}

	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void setEsEgresado(Integer esEgresado) {
		this.esEgresado = esEgresado;
	}

	public int getfecha() {
		return fecha;
	}


	public Estudiante getId() {
		return this.estudiante;
	}
	

	public Carrera getCarrera() {
		return carrera;
	}


	/*@Override
	public String toString() {
		return "Inscripto [estudiante=" + estudiante.getId() + ", carrera=" + carrera.getId_carrera() + ", fecha="
				+ fecha
				+ ", anioEgreso=" + (fecha+antiguedad) + "]";
	}*/
}
