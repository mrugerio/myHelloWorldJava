package com.curso;

public class Becario {
	
	private String nombre;
	PcLinux myPc;

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderPc() {
		System.out.println(nombre);
		myPc = new PcLinux("Ubuntu 18.04");
		myPc.encender();
	}

}
