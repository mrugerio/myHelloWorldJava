package com.curso.variable;

public class Becario {
	
	private String nombre;
	Pc myPc;

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderPc() {
		System.out.println(nombre);
		myPc.encender();
	}

}
