package com.curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.curso.pojo.Empleado;

public class Principal2 implements Comparator<Empleado> {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		System.out.println("ListaEmpleados por Nombre");
		Collections.sort(listaEmpleados, new Principal2());
		for (Empleado e:listaEmpleados) System.out.println(e);
	}

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return (int) (o2.getSueldo() - o1.getSueldo());
	}

}
