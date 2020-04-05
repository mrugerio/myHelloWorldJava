package com.consingleton;

public class Principal {

	public static void main(String[] args) {
		
		Conexion con1 = Conexion.getInstance();
		Conexion con2 = Conexion.getInstance();
		Conexion con3 = Conexion.getInstance();

		System.out.println(Conexion.contador);

	}

}
