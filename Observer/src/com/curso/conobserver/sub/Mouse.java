package com.curso.conobserver.sub;

import com.curso.conobserver.obs.Gif;
import com.curso.conobserver.obs.Imagen;
import com.curso.conobserver.obs.Texto;

public class Mouse extends Subject {
	
	public void click() {
		System.out.println("click mouse");
		notificar();
	}

}
