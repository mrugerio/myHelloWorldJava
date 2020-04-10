package com.curso;

import java.util.*;

public class Almacen {
	
	String nombre;
	List<Cuenta> listaCuentas = new ArrayList<>();
	List<Cliente> listaClientes;

	public Almacen(String nombre) {
		this.nombre = nombre;
		listaClientes = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + "]";
	}
	
	void setCuenta(Cuenta cuenta) {
		listaCuentas.add(cuenta);
	}
	
	void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	
}
