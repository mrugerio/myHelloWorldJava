package com.curso;

public abstract class Decorator implements Component {
	
	Component componente;
	String nombreAccesorio;
	double precioAccesorio;
	
	public Decorator(Component componente) {
		this.componente = componente;
	}

	@Override
	public String getNombrePrecio() {
		return componente.getNombrePrecio() + "\n" +
				nombreAccesorio + ": " + precioAccesorio;
	}

	@Override
	public double getCostoTotal() {
		return componente.getCostoTotal() + precioAccesorio;
	}

}
