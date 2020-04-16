package com.curso;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {

		List<Object> listaObjetos = new ArrayList<>();
		listaObjetos.add(new Object());
		listaObjetos.add("Hello World Java");
		listaObjetos.add(new Figura(2));
		listaObjetos.add(new Triangulo(4));

		imprimirObjetos(listaObjetos);
	}
	
	static void imprimirObjetos(List<?> lista) {
		//lista.add(new Circulo(6));
		for (Object o:lista) {
			System.out.println("Imprimir Objeto: "+o);
			if (o instanceof String)
				System.out.println("Longitud String: "+
								((String) o).length());
			if (o instanceof Figura)
				System.out.println("Area figura: "+ ((Figura) o).getArea());
		}
	}

}
