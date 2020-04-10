package com.curso;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Almacen almacen1 = new Almacen("Centro");
		
		Cliente cli1 = new Cliente("Patrobas");
		Cliente cli2 = new Cliente("Andronico");
		Cliente cli3 = new Cliente("Tercio");
		
		cli1.banco = new Banco("Azteca");
		cli1.realizarPago(100.00);
		
		List<Cliente> listaClientes = new ArrayList<>();
		listaClientes.add(cli1);
		listaClientes.add(cli2);
		listaClientes.add(cli3);

		System.out.println(almacen1.listaClientes);
		//ASIGNAMOS LA LISTA DE CLIENTES AL ALMACEN
		almacen1.setListaClientes(listaClientes);
		

		listaClientes.add(new Cliente("Rolas"));
		
		System.out.println("Almacen: "+almacen1.listaClientes);
		
		almacen1 = null;
		System.out.println(almacen1);
		System.out.println("Principal: "+listaClientes);
		
		
	}

}
