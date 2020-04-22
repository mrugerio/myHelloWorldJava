package com.curso.sinobserver;

public class Principal {

	public static void main(String[] args) {

		Mouse mouse = new Mouse();
		Texto txt = new Texto("Hello World Java");
		Imagen img = new Imagen("Java");
		Gif gif = new Gif("Duke");
		
		mouse.txt = txt;
		mouse.img = img;
		mouse.gif = gif;
		mouse.click();
	}

}
