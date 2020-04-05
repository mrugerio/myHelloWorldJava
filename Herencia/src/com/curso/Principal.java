package com.curso;

public class Principal {
	
	public static void main(String[] args) {
		
		Pato pato1 = new Pato("Lucas",2);
		
		System.out.println(pato1);
		
		pato1.volar();
		
		Aguila aguila1 = new Aguila("Birdman",3);
	
		System.out.println(aguila1);
		
		aguila1.volar();

	}

}
