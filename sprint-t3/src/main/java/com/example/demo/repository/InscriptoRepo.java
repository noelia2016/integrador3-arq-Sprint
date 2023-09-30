package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Inscripto;
import com.example.demo.entity.claveCompuestaInscripto;

// import java.util.List;


public interface InscriptoRepo extends JpaRepository<Inscripto, claveCompuestaInscripto>{

	

	// @Override
	// public Inscripto findById(Integer id) {
	// 	return RepositoryFactory.getEntity_manager().find(Inscripto.class, id);
	// }

	// public void setEgreso(Estudiante e, Carrera c, int antiguedad) {
	// 	RepositoryFactory.getEntity_manager().getTransaction().begin();
	// 	TypedQuery<Inscripto> i = RepositoryFactory.getEntity_manager().createQuery(
	// 			"SELECT i FROM Inscripto i WHERE carrera= :carr AND nro_libreta=:libreta", Inscripto.class);
	// 	i.setParameter("libreta", e);
	// 	i.setParameter("carr", c);
	// 	Inscripto inscripto = i.getSingleResult();
	// 	inscripto.setAntiguedad(antiguedad);
	// 	inscripto.setEsEgresado(1);
	// 	RepositoryFactory.getEntity_manager().getTransaction().commit();
	// 	RepositoryFactory.cerrar_conexion();
	// }

	// @Override
	// public List<Inscripto> findAll() {
	// 	return RepositoryFactory.getEntity_manager().createQuery("SELECT e FROM Inscripto e", Inscripto.class)
	// 			.getResultList();
	// }

	// @Override
	// public Inscripto save(Inscripto Inscripto) {
	// 	RepositoryFactory.getEntity_manager().getTransaction().begin();
	// 	if (Inscripto.getId() == null) {
	// 		RepositoryFactory.getEntity_manager().persist(Inscripto);
	// 	} else {
	// 		Inscripto = RepositoryFactory.getEntity_manager().merge(Inscripto);
	// 	}
	// 	RepositoryFactory.getEntity_manager().getTransaction().commit();
	// 	RepositoryFactory.cerrar_conexion();
	// 	return Inscripto;
	// }

	// @Override
	// public void delete(Inscripto Inscripto) {
	// 	RepositoryFactory.getEntity_manager().remove(Inscripto);
	// }

}