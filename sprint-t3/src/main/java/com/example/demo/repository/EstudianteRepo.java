package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Carrera;
import com.example.demo.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


// public class EstudianteRepo {
public interface EstudianteRepo extends JpaRepository<Estudiante,Long>{
	

	@Query("SELECT e FROM Estudiante e WHERE e.genero LIKE %:gen% ORDER BY e.apellido, e.nombre")
	public List<Estudiante> xGenero(String gen);

@Query("SELECT e FROM Estudiante e JOIN e.carreras c WHERE c = :carr AND e.ciudad_reside LIKE %:ciudad%")
public List<Estudiante> filtrar(Carrera carr, String ciudad);
	// public List<Estudiante> findAll() {
		// return RepositoryFactory.getEntity_manager()
				// .createQuery("SELECT e FROM Estudiante e ORDER BY e.id", Estudiante.class).getResultList();
				// return null;
	// }

	// // lista los estudiantes por genero
	// public List<Estudiante> xGenero(String g) {
	// 	String consulta = "SELECT e FROM Estudiante e WHERE e.genero LIKE :generoParametro ORDER BY e.apellido, e.nombre";
	// 	TypedQuery<Estudiante> query = RepositoryFactory.getEntity_manager().createQuery(consulta, Estudiante.class);
	// 	query.setParameter("generoParametro", "%" + g + "%");
	// 	return query.getResultList();
	// }

	// @Override
	// // guarda un nuevo estudiante
	// public Estudiante save(Estudiante estudiante) {

	// 	RepositoryFactory.getEntity_manager().getTransaction().begin();
	// 	if (estudiante.getId() == 0) {
	// 		RepositoryFactory.getEntity_manager().persist(estudiante);
	// 	} else {
	// 		estudiante = RepositoryFactory.getEntity_manager().merge(estudiante);
	// 	}
	// 	RepositoryFactory.getEntity_manager().getTransaction().commit();
	// 	RepositoryFactory.cerrar_conexion();
	// 	return estudiante;
	// }

	// @Override
	// public void delete(Estudiante Estudiante) {
	// 	RepositoryFactory.getEntity_manager().remove(Estudiante);
	// }

	// public List<Estudiante> xCarreraYciudad(Carrera carrera, String ciudad) {
	// 	String consulta = "SELECT e FROM Estudiante e JOIN e.carreras c WHERE c = :carr AND e.ciudad_reside LIKE :city";
	// 	TypedQuery<Estudiante> query = RepositoryFactory.getEntity_manager().createQuery(consulta, Estudiante.class);
	// 	query.setParameter("carr", carrera);
	// 	query.setParameter("city", "%" + ciudad + "%");
	// 	return query.getResultList();
	// }

	}