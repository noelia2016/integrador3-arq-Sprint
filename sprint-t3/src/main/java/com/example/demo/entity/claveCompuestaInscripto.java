package com.example.demo.entity;

import java.io.Serializable;


public class claveCompuestaInscripto implements Serializable{
    private Estudiante estudiante;

	private Carrera carrera;

    public claveCompuestaInscripto(){}

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
