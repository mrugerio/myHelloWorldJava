package com.curso;

public class Cliente {
	
	String nombre;
	Banco banco;

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + "]";
	}
	
	void realizarPago(double cantidad){
		boolean resultado = banco.pagar(cantidad);
		System.out.println(resultado);
	}
	
}
