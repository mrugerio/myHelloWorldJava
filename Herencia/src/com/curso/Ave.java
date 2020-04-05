package com.curso;

public class Ave {
	
	String nombre;
	int edad;
	
	public Ave(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	void volar(){
		System.out.println("No puedo volar");
	}

}
