package com.curso.pizzafm.store;

import com.curso.pizzafm.Pizza;

public abstract class TiendaPizza {
 
	abstract Pizza crearPizza(String tipo);
 
	public Pizza ordenarPizza(String tipo) {
		Pizza pizza = crearPizza(tipo);
		System.out.println("--- Haciendo una " + pizza.getNombre() + " ---");
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empaquetar();
		return pizza;
	}
}
