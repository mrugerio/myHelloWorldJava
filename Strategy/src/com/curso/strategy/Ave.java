package com.curso.strategy;

public abstract class Ave {
	
	String nombre;
	ComportamientoVolar cv;
	
	public Ave(String nombre) {
		this.nombre = nombre;
	}
	
	void volar() {
		cv.ejecutaVuelo();
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + 
				" [nombre=" + nombre + "]";
	}
}
