package com.curso.pizza.sinfm;

import com.curso.pizzafm.PizzaMtyQueso;
import com.curso.pizzafm.PizzaMtyAlmeja;
import com.curso.pizzafm.PizzaMtyPeperoni;
import com.curso.pizzafm.PizzaMtyVegetariana;
import com.curso.pizzafm.PizzaVerQueso;
import com.curso.pizzafm.PizzaVerAlmeja;
import com.curso.pizzafm.PizzaVerPeperoni;
import com.curso.pizzafm.PizzaVerVegetariana;
import com.curso.pizzafm.Pizza;

public class TiendaPizzaSinFactory {
 
	public Pizza crearPizza(String estilo, String tipo) {
		Pizza pizza = null;
		if (estilo.equals("Veracruz")) {
			if (tipo.equals("queso")) {
				pizza = new PizzaVerQueso();
			} else if (tipo.equals("vegetariana")) {
				pizza = new PizzaVerVegetariana();
			} else if (tipo.equals("almeja")) {
				pizza = new PizzaVerAlmeja();
			} else if (tipo.equals("peperoni")) {
				pizza = new PizzaVerPeperoni();
			}
		} else if (estilo.equals("Monterrey")) {
			if (tipo.equals("queso")) {
				pizza = new PizzaMtyQueso();
			} else if (tipo.equals("vegetariana")) {
				pizza = new PizzaMtyVegetariana();
			} else if (tipo.equals("almeja")) {
				pizza = new PizzaMtyAlmeja();
			} else if (tipo.equals("peperoni")) {
				pizza = new PizzaMtyPeperoni();
			}
		} else {
			System.out.println("Error: verifique estilo de pizza");
			return null;
		}
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empaquetar();
		return pizza;
	}
}
