package com.curso.sinstrategy;

public class Pinguino extends Ave {

	public Pinguino(String nombre) {
		super(nombre);
	}

	@Override
	void volar() {
		System.out.println("No puedo volar");
	}

}
