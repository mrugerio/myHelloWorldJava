package com.curso.strategy;

public class Pinguino extends Ave {

	public Pinguino(String nombre) {
		super(nombre);
		cv = new NoVolar();
	}

}
