package com.curso;

public class Resta extends ExpresionBinaria {
	
	public Resta(Expresion izquierda, Expresion derecha) {
		super(izquierda,derecha);
	}

	@Override
	public double getValor() {
		return this.izquierda.getValor() - 
				this.derecha.getValor();
	}

}
