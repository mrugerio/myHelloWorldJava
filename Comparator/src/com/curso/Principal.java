package com.curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.curso.comparator.ComparatorEdad;
import com.curso.comparator.ComparatorNombre;
import com.curso.comparator.ComparatorSueldo;
import com.curso.pojo.Empleado;

public class Principal {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		System.out.println("ListaEmpleados por Nombre");
		Collections.sort(listaEmpleados, new ComparatorNombre());
		for (Empleado e:listaEmpleados) System.out.println(e);
		
		System.out.println("ListaEmpleados por Edad");
		Collections.sort(listaEmpleados, new ComparatorEdad());
		for (Empleado e:listaEmpleados) System.out.println(e);
		
		System.out.println("ListaEmpleados por Sueldo");
		Collections.sort(listaEmpleados, new ComparatorSueldo());
		for (Empleado e:listaEmpleados) System.out.println(e);
		
	}

}
