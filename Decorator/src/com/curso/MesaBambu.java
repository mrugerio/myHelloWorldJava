package com.curso;

public class MesaBambu extends Decorator {

	public MesaBambu(Component componente) {
		super(componente);
		nombreAccesorio = "Mesa de Bambu";
		precioAccesorio = 40.00;
	}

}
