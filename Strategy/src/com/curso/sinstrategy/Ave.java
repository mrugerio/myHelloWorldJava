package com.curso.sinstrategy;

public abstract class Ave {
	
	String nombre;
	public Ave(String nombre) {
		this.nombre = nombre;
	}
	abstract void volar();
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + 
				" [nombre=" + nombre + "]";
	}
}
