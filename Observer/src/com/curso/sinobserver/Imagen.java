package com.curso.sinobserver;

public class Imagen {
	
	String nombreImg;

	public Imagen(String nombreImg) {
		this.nombreImg = nombreImg;
	}
	
	void mostrarImagen() {
		System.out.println("Mostrar imagen: "+nombreImg);
	}

}
