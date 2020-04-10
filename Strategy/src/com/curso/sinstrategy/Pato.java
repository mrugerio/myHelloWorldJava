package com.curso.sinstrategy;

public class Pato extends Ave {

	public Pato(String nombre) {
		super(nombre);
	}

	@Override
	void volar() {
		System.out.println("No puedo volar");
	}

}
