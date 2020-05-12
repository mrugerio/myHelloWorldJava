package com.curso.pizzafm.store;

import com.curso.pizzafm.PizzaVerQueso;
import com.curso.pizzafm.PizzaVerAlmeja;
import com.curso.pizzafm.PizzaVerPeperoni;
import com.curso.pizzafm.PizzaVerVegetariana;
import com.curso.pizzafm.Pizza;

public class TiendaPizzaVer extends TiendaPizza {

	Pizza crearPizza(String tipo) {
		if (tipo.equals("queso")) {
			return new PizzaVerQueso();
		} else if (tipo.equals("vegetariana")) {
			return new PizzaVerVegetariana();
		} else if (tipo.equals("almeja")) {
			return new PizzaVerAlmeja();
		} else if (tipo.equals("peperoni")) {
			return new PizzaVerPeperoni();
		} else return null;
	}
}
