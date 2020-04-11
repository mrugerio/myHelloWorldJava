package com.curso;

public class Suma extends ExpresionBinaria {
	
	public Suma(Expresion izquierda, Expresion derecha) {
		super(izquierda,derecha);
	}

	@Override
	public double getValor() {
		return this.izquierda.getValor() + 
				this.derecha.getValor();
	}

}
