package com.example.demo.dtos;

import com.example.demo.model.Carrera;

public class CarreraConCantidadDTO {
    
    private Carrera carrera;
    private int cantidad;

    public CarreraConCantidadDTO() {
        super();
    }

    public CarreraConCantidadDTO(Carrera carrera, int cantidad) {
        this.carrera = carrera;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "\n" + cantidad + " Inscriptos en: " + carrera.getNombre();
    }

    public Carrera getCarrera() {
        return carrera;
    }

   

    public int getCantidad() {
        return cantidad;
    }

    
}
