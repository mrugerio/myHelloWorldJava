package com.curso;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		List<String> listaComida = new ArrayList<>();
		listaComida.add("Semilla");
		listaComida.add("Plantas");
		listaComida.add("Insectos");

		Pato pato = new Pato("Lucas",5,listaComida);
		
		System.out.println(pato.getNombre());
		System.out.println(pato.getEdad());
		System.out.println(pato.getComidaPreferida());
		
		listaComida.add("Chicharron");
		System.out.println("OOOHHH SII!!");
		System.out.println(pato.getComidaPreferida());

	}

}
