package com.sinsingleton;

public class Conexion {
	
	private String nombre;
	static int contador;

	public Conexion(String nombre) {
		this.nombre = nombre;
		contador++;
	}
	
}
