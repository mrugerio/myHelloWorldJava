package com.curso.variable;

public class Principal {

	public static void main(String[] args) {

		Becario becario = new Becario("Patrobas");
		
		Inyector.inyectarPc(becario);
		
		becario.encenderPc();
		
	}

}
