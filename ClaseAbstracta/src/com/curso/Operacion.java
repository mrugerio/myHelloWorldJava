package com.curso;

public abstract class Operacion {
	int x;
	int y;
	public Operacion(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	abstract int ejecuta();
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+ 
				" [x=" + x + ", y=" + y + "]";
	}

}
