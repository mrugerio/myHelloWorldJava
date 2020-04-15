package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		Contenedor<Bici> c1 = new Contenedor<>(new Bici("bici"));
		Contenedor<Moto> c2 = new Contenedor<>(new Moto("moto"));
		Contenedor<Motoneta> c3 = 
				new Contenedor<>(new Motoneta("motoneta"));
		Contenedor<String> c4 = 
				new Contenedor<>(new String("Java"));
		
		Bici bici = c1.getT();
		Motoneta m = c3.getT();
		
		c2.mostrarCertificado(new Integer(5));
		c2.mostrarCertificado(new StringBuilder("XZ87"));
	}

}
