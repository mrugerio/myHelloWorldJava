package com.curso.constructor;

public class Becario {
	
	private String nombre;
	private Pc myPc;

	public Becario(String nombre, Pc myPc) {
		this.nombre = nombre;
		this.myPc = myPc;
	}
	
	void encenderPc() {
		System.out.println(nombre);
		myPc.encender();
	}

}
