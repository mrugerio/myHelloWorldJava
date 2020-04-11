package com.curso;

public class Constante implements Expresion {

	private double valor;

	public Constante(double valor) {
		this.valor = valor;
	}

	@Override
	public double getValor() {
		return this.valor;
	}

}
