package com.curso;

public class Multi extends ExpresionBinaria {
	
	public Multi(Expresion izquierda, Expresion derecha) {
		super(izquierda,derecha);
	}

	@Override
	public double getValor() {
		return this.izquierda.getValor() * 
				this.derecha.getValor();
	}

}
