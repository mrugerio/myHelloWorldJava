package com.curso.factory.cliente;

import com.curso.pizzas.Pizza;
import com.curso.factory.TiendaPizza;

public class Principal {
 
	public static void main(String[] args) {
		Pizza pizza;
		TiendaPizza tienda = new TiendaPizza();

		pizza = tienda.orderPizza("almeja");
		System.out.println("Ordené una pizza " + pizza.getName() + "\n");
		System.out.println(pizza);
		System.out.println("*************************");
		pizza = tienda.orderPizza("vegetariana");
		System.out.println("Ordené una pizza " + pizza.getName() + "\n");
		System.out.println(pizza);

	}
}
