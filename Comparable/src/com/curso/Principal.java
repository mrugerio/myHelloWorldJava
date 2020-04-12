package com.curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		int[] enteros = {8,2,0,4,9};
		Arrays.sort(enteros);
		System.out.println(Arrays.toString(enteros));
		
		String[] nombres = {"Patrobas","Tercio","Andronico","Rolas"};
		Arrays.sort(nombres);
		System.out.println(Arrays.toString(nombres));
		
		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("Patrobas");
		listaNombres.add("Tercio");
		listaNombres.add("Andronico");
		listaNombres.add("Rolas");
		System.out.println("Lista Nombres:");
		
		Collections.sort(listaNombres);
		System.out.println(listaNombres);
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		System.out.println("ListaEmpleados");
		Collections.sort(listaEmpleados);
		for (Empleado e:listaEmpleados) System.out.println(e);
		
	}

}
