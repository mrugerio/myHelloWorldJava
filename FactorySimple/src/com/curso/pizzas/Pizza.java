package com.curso.pizzas;

import java.util.ArrayList;

abstract public class Pizza {
	String nombre;
	String masa;
	String salsa;
	ArrayList ingredientes = new ArrayList();

	public String getName() {
		return nombre;
	}

	public void preparar() {
		System.out.println("Preparando " + nombre);
	}

	public void hornear() {
		System.out.println("Horneando " + nombre);
	}

	public void cortar() {
		System.out.println("Cortando " + nombre);
	}

	public void empaquetar() {
		System.out.println("Empaquetando " + nombre);
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer mostrar = new StringBuffer();
		mostrar.append("---- " + nombre + " ----\n");
		mostrar.append("masa: "+masa + "\n");
		mostrar.append("salsa: "+salsa + "\n");
		for (int i = 0; i < ingredientes.size(); i++) {
			mostrar.append("ingrediente "+ (i+1) +": "+(String )ingredientes.get(i) + "\n");
		}
		return mostrar.toString();
	}
}

