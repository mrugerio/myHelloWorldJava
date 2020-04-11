package com.curso;

public class Division extends ExpresionBinaria {
	
	public Division(Expresion izquierda, Expresion derecha) {
		super(izquierda,derecha);
	}

	@Override
	public double getValor() {
		return this.izquierda.getValor() / 
				this.derecha.getValor();
	}

}
