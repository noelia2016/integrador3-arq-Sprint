package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

public interface CarreraRepo extends JpaRepository<Carrera,Long>{

	


	/**
	 * Generar un reporte de las carreras, que para cada carrera incluya información
	 * de los
	 * inscriptos y egresados por año. Se deben ordenar las carreras
	 * alfabéticamente, y presentar
	 * los años de manera cronológica
	 */
	// public List<EstudianteCarreraDTO> reporte() {
	// 	String consulta = "SELECT NEW dtos.EstudianteCarreraDTO(c , e, i, i.fecha as fech) FROM Inscripto i JOIN i.estudiante e JOIN i.carrera c";
	// 	TypedQuery<EstudianteCarreraDTO> query = RepositoryFactory.getEntity_manager().createQuery(consulta,
	// 			EstudianteCarreraDTO.class);
	// 	List<EstudianteCarreraDTO> ingresos = query.getResultList();

	// 	consulta = "SELECT NEW dtos.EstudianteCarreraDTO(c , e, i, (i.fecha + i. antiguedad) as fech) FROM Inscripto i JOIN i.estudiante e JOIN i.carrera c WHERE i.esEgresado = 1";
	// 	query = RepositoryFactory.getEntity_manager().createQuery(consulta, EstudianteCarreraDTO.class);
	// 	List<EstudianteCarreraDTO> egrersos = query.getResultList();

	// 	List<EstudianteCarreraDTO> resultados = new ArrayList<>();
	// 	resultados.addAll(ingresos);
	// 	resultados.addAll(egrersos);

	// 	return resultados;
	// }

}