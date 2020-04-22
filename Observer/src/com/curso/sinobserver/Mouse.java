package com.curso.sinobserver;

public class Mouse {
	
	Texto txt;
	Imagen img;
	Gif gif;
	
	void click() {
		System.out.println("click mouse");
		txt.mostrarTexto();
		img.mostrarImagen();
		gif.moverGif();
	}

}
