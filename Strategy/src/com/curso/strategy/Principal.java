package com.curso.strategy;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Pato pato = new Pato("Lucas");
		Pinguino pinguino = new Pinguino("Chilly Willy");
		Aguila aguila = new Aguila("Aguila Calva");
		
		List<Ave> listaAves = new ArrayList<>();
		listaAves.add(pato);
		listaAves.add(pinguino);
		listaAves.add(aguila);

		for(Ave ave : listaAves) {
			aplicaVuelo(ave);
		}
		
		System.out.println("-------------");
		
		pato.cv = new SiVolar();
		aguila.cv = new AleatorioVolar();
		
		for(Ave ave : listaAves) {
			aplicaVuelo(ave);
		}
		
	}
	
	static void aplicaVuelo(Ave ave) {
		System.out.println(ave);
		ave.volar();
	}
}
