package com.curso.strategy;

public class Aguila extends Ave {

	public Aguila(String nombre) {
		super(nombre);
		cv = new SiVolar();
	}


}
