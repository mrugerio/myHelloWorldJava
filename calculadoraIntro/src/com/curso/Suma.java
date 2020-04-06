package com.curso;

public class Suma extends Operacion {

	public Suma(int x, int y) {
		super(x, y);
	}
	
	@Override
	int ejecuta() {
		return x+y;
	}
	@Override
	public String toString() {
		return "Suma [x=" + x + ", y=" + y + "]";
	}

}
