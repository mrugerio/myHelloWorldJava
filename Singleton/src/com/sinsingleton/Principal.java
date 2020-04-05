package com.sinsingleton;

public class Principal {

	public static void main(String[] args) {

		Conexion con1 = new Conexion("Mysql");
		Conexion con2 = new Conexion("Mysql");
		Conexion con3 = new Conexion("Mysql");

		System.out.println(Conexion.contador);
		
		
	}

}
