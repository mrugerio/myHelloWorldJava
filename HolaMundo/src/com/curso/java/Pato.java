package com.curso.java;

public class Pato {
	
	String nombre;
	int edad;
	static int contador;
	
	Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++; //contador = contador+1
	}
	
	static int getContador() {
		return contador;
	}
	 
	
}












