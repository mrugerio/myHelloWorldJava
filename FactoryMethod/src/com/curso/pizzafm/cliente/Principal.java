package com.curso.pizzafm.cliente;

import com.curso.pizzafm.Pizza;
import com.curso.pizzafm.store.TiendaPizzaMty;
import com.curso.pizzafm.store.TiendaPizzaVer;
import com.curso.pizzafm.store.TiendaPizza;

public class Principal {
 
	public static void main(String[] args) {
		TiendaPizza tiendaVer = new TiendaPizzaVer();
		TiendaPizza tiendaMty = new TiendaPizzaMty();
 
		Pizza pizza = tiendaVer.ordenarPizza("queso");
		System.out.println("Patrobas ordenó una " + pizza.getNombre() + "\n");
		
		pizza = tiendaMty.ordenarPizza("queso");
		System.out.println("Filólogo ordenó una " + pizza.getNombre() + "\n");
		/*
		pizza = tiendaVer.ordenarPizza("almeja");
		System.out.println("Patrobas ordenó una " + pizza.getNombre() + "\n");
 
		pizza = tiendaMty.ordenarPizza("almeja");
		System.out.println("Filólogo ordenó una " + pizza.getNombre() + "\n");

		pizza = tiendaVer.ordenarPizza("peperoni");
		System.out.println("Patrobas ordenó una " + pizza.getNombre() + "\n");
 
		pizza = tiendaMty.ordenarPizza("peperoni");
		System.out.println("Filólogo ordenó una " + pizza.getNombre() + "\n");

		pizza = tiendaVer.ordenarPizza("vegetariana");
		System.out.println("Patrobas ordenó una " + pizza.getNombre() + "\n");
 
		pizza = tiendaMty.ordenarPizza("vegetariana");
		System.out.println("Filólogo ordenó una " + pizza.getNombre() + "\n");*/
	}
}
