package com.curso;

public class Division extends Operacion {

	public Division(int x, int y) {
		super(x, y);
	}

	@Override
	int ejecuta() {
		return x/y;
	}

}
