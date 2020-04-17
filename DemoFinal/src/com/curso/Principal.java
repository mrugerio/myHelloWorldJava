package com.curso;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	static final int y = 10;

	public static void main(String[] args) {
		
			final int x = 5;
			//x = 10;
		
			final Ave ave = new Ave("Pajaro loco");
			ave.nombre = "Donald";
			//ave = new Ave("Patito feo");
			Pato pato1 = new Pato("Lucas");
			
			System.out.println(ave);
			System.out.println(pato1);
			
			final List<String> lista = new ArrayList<>();
			
			lista.add("Hello");
			lista.add("World");
			lista.add("Java");
			
			System.out.println(lista);
			
			//lista = new ArrayList<>();
			
 
	}

}
