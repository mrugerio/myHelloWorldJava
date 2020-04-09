package com.curso;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Almacen almacen1 = new Almacen("Centro");
		
		//Cuenta cta1 = new Cuenta("x001");
		//Cuenta cta2 = new Cuenta("z005");
		//Cuenta cta3 = new Cuenta("y007");

		//List<Cuenta> listaCtas = new ArrayList<>();
		
		//listaCtas.add(new Cuenta("x001"));
		//listaCtas.add(new Cuenta("z005"));
		//listaCtas.add(new Cuenta("y007"));
		
		System.out.println(almacen1.listaCuentas);
		
		//almacen1.setCuentas(listaCtas);
		almacen1.setCuenta(new Cuenta("x001"));
		almacen1.setCuenta(new Cuenta("z005"));
		almacen1.setCuenta(new Cuenta("y007"));

		System.out.println(almacen1.listaCuentas);

		almacen1 = null;
		
		//System.out.println("De Principal");
		//System.out.println(listaCtas);
		
	}

}
