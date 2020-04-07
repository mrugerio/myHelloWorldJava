package com.curso;

public class Division implements Operacion {
	
	int x;
	int y;
	
	public Division(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Division [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int ejecuta() {
		return x/y;
	}
	

}
