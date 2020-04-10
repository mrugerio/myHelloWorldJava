package com.curso.sinstrategy;

public class Aguila extends Ave {

	public Aguila(String nombre) {
		super(nombre);
	}

	@Override
	void volar() {
		System.out.println("Si puedo volar");
	}

}
