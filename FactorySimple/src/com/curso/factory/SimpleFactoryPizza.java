package com.curso.factory;

import com.curso.pizzas.Pizza;
import com.curso.pizzas.PizzaAlmeja;
import com.curso.pizzas.PizzaPeperoni;
import com.curso.pizzas.PizzaQueso;
import com.curso.pizzas.PizzaVegetariana;

public class SimpleFactoryPizza {
	
	public static Pizza crearPizza(String tipo) {
		
		Pizza pizza = null;
		if (tipo.equals("queso")) {
			pizza = new PizzaQueso();
		} else if (tipo.equals("peperoni")) {
			pizza = new PizzaPeperoni();
		} else if (tipo.equals("almeja")) {
			pizza = new PizzaAlmeja();
		} else if (tipo.equals("vegetariana")) {
			pizza = new PizzaVegetariana();
		} 
		return pizza;
	}

}
