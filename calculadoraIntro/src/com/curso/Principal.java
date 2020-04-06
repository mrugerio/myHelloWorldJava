package com.curso;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Operacion> operaciones = 
				new ArrayList<>();
		
		operaciones.add(new Suma(8,4));
		operaciones.add(new Resta(8,4));
		operaciones.add(new Multi(8,4));
		operaciones.add(new Operacion(8,4));

		for(Operacion op :operaciones) {
			System.out.println(op);
			int resultado = op.ejecuta();
			System.out.println(resultado);
		}

	}

}
