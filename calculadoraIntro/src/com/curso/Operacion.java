package com.curso;

public class Operacion {
	int x;
	int y;
	public Operacion(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	int ejecuta() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Operacion [x=" + x + ", y=" + y + "]";
	}

}
