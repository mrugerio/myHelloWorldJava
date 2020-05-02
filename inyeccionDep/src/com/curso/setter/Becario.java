package com.curso.setter;

public class Becario {
	
	private String nombre;
	private Pc myPc;

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	public Pc getMyPc() {
		return myPc;
	}

	public void setMyPc(Pc myPc) {
		this.myPc = myPc;
	}

	void encenderPc() {
		System.out.println(nombre);
		myPc.encender();
	}

}
