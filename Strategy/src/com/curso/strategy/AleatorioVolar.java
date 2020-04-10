package com.curso.strategy;

public class AleatorioVolar implements ComportamientoVolar {

	@Override
	public void ejecutaVuelo() {
		System.out.println("Si quiero puedo volar");
	}

}
