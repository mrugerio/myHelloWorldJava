package com.curso.conobserver.obs;

import com.curso.conobserver.sub.Subject;

public class Gif extends Observer {
	
	String nombre;

	public Gif(String nombre, Subject sub) {
		super(sub);
		this.nombre = nombre;
	}
	
	void moverGif() {
		System.out.println("Girar Gif: "+nombre);
	}

	@Override
	public void update() {
		moverGif();
	}
	

}
