package com.curso;

import java.util.*;

public class Almacen {
	
	String nombre;
	List<Cuenta> listaCuentas = new ArrayList<>();

	public Almacen(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + "]";
	}
	
	void setCuenta(Cuenta cuenta) {
		listaCuentas.add(cuenta);
	}
	
	/*void setCuentas(List<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}*/
	
}
