package com.curso.factory;

import com.curso.pizzas.Pizza;
import com.curso.pizzas.PizzaAlmeja;
import com.curso.pizzas.PizzaPeperoni;
import com.curso.pizzas.PizzaQueso;
import com.curso.pizzas.PizzaVegetariana;

public class TiendaPizza {
	
 
	public Pizza orderPizza(String tipo) {
		
		Pizza pizza = SimpleFactoryPizza.crearPizza(tipo);
 
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empaquetar();

		return pizza;
	}

}
