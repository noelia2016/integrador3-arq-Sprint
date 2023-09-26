package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Persona {
    @Id
    private Long id;

    @Column
    private String nombre;

    public Persona(Long id,String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    



    
}
