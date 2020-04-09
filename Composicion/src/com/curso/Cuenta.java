package com.curso;

public class Cuenta {
	String clave;
	public Cuenta(String clave) {
		this.clave = clave;
	}
	@Override
	public String toString() {
		return "Cuenta [clave=" + clave + "]";
	}
}
