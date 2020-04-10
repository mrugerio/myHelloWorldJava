package com.curso.strategy;

public class Pato extends Ave {

	public Pato(String nombre) {
		super(nombre);
		cv = new AleatorioVolar();
	}

}
