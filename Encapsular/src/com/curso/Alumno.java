package com.curso;

public class Alumno {
	
	private String nombre;
	private int edad;
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public String getNombre() {
		//Solo si tienes el rol de Adminstrador 
		//se puede consultar el nombre.
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad<15) {
			throw new IllegalArgumentException("Edad incorrecta");
		}
		this.edad = edad;
	}
	
}
