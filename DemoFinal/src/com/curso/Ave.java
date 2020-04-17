package com.curso;

public class Ave {
	
	String nombre;
	public Ave(String nombre) {
		this.nombre = nombre;
	}
	final void volar() {
		System.out.println("Si puedo volar");
	}
	@Override
	public String toString() {
		return "Ave [nombre=" + nombre + "]";
	}

}
