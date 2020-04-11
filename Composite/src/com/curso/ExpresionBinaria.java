package com.curso;

public abstract class ExpresionBinaria implements Expresion {
	
	protected Expresion izquierda;
	protected Expresion derecha;

	public ExpresionBinaria(Expresion izquierda, Expresion derecha) {
		this.izquierda = izquierda;
		this.derecha = derecha;
	}

}
