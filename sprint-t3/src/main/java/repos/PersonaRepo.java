package repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import modelos.Persona;

public interface PersonaRepo extends JpaRepository<Persona,Long>{

    @Query("SELECT p FROM Persona p WHERE p.nombre=:nombre")
    public List<Persona> buscarPorNombre(String nombre);


    
}
