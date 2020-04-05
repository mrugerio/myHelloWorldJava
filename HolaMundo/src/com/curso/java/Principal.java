package com.curso.java;

public class Principal {

	public static void main(String[] args) {
		
		Pato pato1 = new Pato("Lucas",1);
		System.out.println(Pato.contador);

		Pato pato2 = new Pato("Donald",2);
		System.out.println(Pato.contador);

		Pato pato3 = new Pato("Patito feo",3);
		System.out.println(Pato.contador);
		
		System.out.println(Pato.getContador());

	}

}
