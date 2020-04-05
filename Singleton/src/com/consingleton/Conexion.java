package com.consingleton;

public class Conexion {
	private String nombre;
	static int contador;
	private static Conexion conexion;
	
	private Conexion(String nombre) {
		this.nombre = nombre;
		contador++;
	}
	
	public static Conexion getInstance() {
		if(conexion==null) {
			conexion = new Conexion("Mysql");
			return conexion;
		}else {
			return conexion;
		}
	}

}
