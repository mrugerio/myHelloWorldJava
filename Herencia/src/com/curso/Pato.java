package com.curso;

public class Pato extends Ave {
	
	public Pato(String nombre, int edad) {
		super(nombre,edad);
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
