package com.curso;

public class Aguila extends Ave {

	Aguila(String nombre, int edad){
		super(nombre,edad);
	}
	
	@Override
	void volar() {
		System.out.println("Si puedo volar");
	}
	
	@Override
	public String toString() {
		return "Aguila [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
