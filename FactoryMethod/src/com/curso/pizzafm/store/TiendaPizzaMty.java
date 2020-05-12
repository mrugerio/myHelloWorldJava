package com.curso.pizzafm.store;

import com.curso.pizzafm.PizzaMtyQueso;
import com.curso.pizzafm.PizzaMtyAlmeja;
import com.curso.pizzafm.PizzaMtyPeperoni;
import com.curso.pizzafm.PizzaMtyVegetariana;
import com.curso.pizzafm.Pizza;

public class TiendaPizzaMty extends TiendaPizza {

	@Override
	Pizza crearPizza(String tipo) {
        	if (tipo.equals("queso")) {
            		return new PizzaMtyQueso();
        	} else if (tipo.equals("vegetariana")) {
        	    	return new PizzaMtyVegetariana();
        	} else if (tipo.equals("almeja")) {
        	    	return new PizzaMtyAlmeja();
        	} else if (tipo.equals("peperoni")) {
            		return new PizzaMtyPeperoni();
        	} else return null;
	}
}
