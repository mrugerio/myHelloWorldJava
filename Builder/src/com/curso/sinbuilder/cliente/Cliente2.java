package com.curso.sinbuilder.cliente;

import com.curso.sinbuilder.Tarea;

public class Cliente2 {
	
	public static void main(String[] args) {
		Tarea tarea = new Tarea(30,"Comprar Pan");
		tarea.setDefinidaPor("Urbano");
		tarea.setAsignadaA("Aristobulo");
		
		System.out.println(tarea);
	}

}
