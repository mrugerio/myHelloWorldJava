package com.curso.conobserver.obs;

import com.curso.conobserver.sub.Subject;

public class Texto extends Observer {
	
	String texto;

	public Texto(String texto, Subject sub) {
		super(sub);
		this.texto = texto;
	}
	
	void mostrarTexto(){
		System.out.println("Mostrar texto: "+texto);
	}

	@Override
	public void update() {
		mostrarTexto();
	}
	

}
