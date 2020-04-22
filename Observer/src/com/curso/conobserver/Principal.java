package com.curso.conobserver;

import com.curso.conobserver.obs.Gif;
import com.curso.conobserver.obs.Imagen;
import com.curso.conobserver.obs.ScrollBar;
import com.curso.conobserver.obs.Texto;
import com.curso.conobserver.sub.Mouse;

public class Principal {

	public static void main(String[] args) {

		Mouse mouse = new Mouse();
		Texto txt = new Texto("Hello World Java",mouse);
		Imagen img = new Imagen("Java",mouse);
		Gif gif = new Gif("Duke",mouse);
		
		mouse.click();
		System.out.println("-------------");
		
		mouse.detach(img);
		new ScrollBar(mouse);
		new Gif("Otro Duke",mouse);
		mouse.click();
	}

}
