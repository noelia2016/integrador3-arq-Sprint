package com.example.demo.model;

import java.io.Serializable;


public class ClaveCompuestaInscripto implements Serializable{
    private Estudiante estudiante;

	private Carrera carrera;

    public ClaveCompuestaInscripto(){}

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    
}
