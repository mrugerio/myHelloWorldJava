package com.curso.sinfactory.cliente;

import com.curso.pizzas.Pizza;
import com.curso.sinfactory.TiendaPizza;

public class Principal {
 
	public static void main(String[] args) {
		Pizza pizza;
		TiendaPizza tienda = new TiendaPizza();

		pizza = tienda.orderPizza("queso");
		System.out.println("Ordené una pizza " + pizza.getName() + "\n");
		System.out.println(pizza);
		System.out.println("*************************");
		pizza = tienda.orderPizza("peperoni");
		System.out.println("Ordené una pizza " + pizza.getName() + "\n");
		System.out.println(pizza);

	}
}
