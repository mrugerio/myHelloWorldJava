package com.curso;

import java.util.ArrayList;
import java.util.List;

public final class Pato {
	
	private final String nombre;
	private final int edad;
	private final List<String> comidaPreferida;
	
	public Pato(String nombre, int edad, List<String> comidaPreferida) {
		this.nombre = nombre;
		this.edad = edad;
		//this.comidaPreferida = comidaPreferida;
		this.comidaPreferida = new ArrayList<>(comidaPreferida);
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public List<String> getComidaPreferida() {
		return new ArrayList<>(comidaPreferida);
	}
	
	public final void comer() {
		System.out.println(nombre +" comiendo.");
	}

}
