package com.curso;

public class Suma extends OperacionAbs {
	
	public Suma(int x, int y) {
		super(x,y);
	}
	
	@Override
	public int ejecuta() {
		return x+y;
	}
	
}
