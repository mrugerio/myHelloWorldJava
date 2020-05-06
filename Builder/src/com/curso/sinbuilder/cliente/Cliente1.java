package com.curso.sinbuilder.cliente;

import com.curso.sinbuilder.Tarea;

public class Cliente1 {
	
	public static void main(String[] args) {
		Tarea tarea = new Tarea(20);
		tarea.setTarea("Comprar leche");
		tarea.setDefinidaPor("Epeneto");
		tarea.setAsignadaA("Andronico");
		
		System.out.println(tarea);
	}

}
