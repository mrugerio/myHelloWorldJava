package com.curso.conobserver.obs;

import com.curso.conobserver.sub.Subject;

public class Imagen extends Observer {
	
	String nombreImg;

	public Imagen(String nombreImg, Subject sub) {
		super(sub);
		this.nombreImg = nombreImg;
	}
	
	void mostrarImagen() {
		System.out.println("Mostrar imagen: "+nombreImg);
	}

	@Override
	public void update() {
		mostrarImagen();
	}

}
