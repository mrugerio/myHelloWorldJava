package com.curso;

public class Pato extends Ave {
	
	public Pato(String nombre) {
		super(nombre);
	}
	/*@Override
	void volar() {
		System.out.println("No puedo volar");
	}*/
	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + "]";
	}
}
