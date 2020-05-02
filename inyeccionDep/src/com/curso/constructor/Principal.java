package com.curso.constructor;

public class Principal {

	public static void main(String[] args) {

		Becario becario = Inyector.getBecario();
				
		becario.encenderPc();
		
	}

}
