package com.curso;

public abstract class OperacionAbs implements Operacion {
	int x;
	int y;
	public OperacionAbs(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + 
				" [x=" + x + ", y=" + y + "]";
	}
}
