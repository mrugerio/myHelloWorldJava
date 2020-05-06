package com.curso.builder.cliente;

import com.curso.builder.TareaBuilder;
import com.curso.builder.Tarea;

public class Cliente2 {
	
	public static void main(String[] args) {
		
		Tarea tarea = new TareaBuilder(30)
				.setTarea("Comprar Pan")
				.setDefinidaPor("Urbano")
				.setAsignadaA("Aristobulo")
				.build();
		
		System.out.println(tarea);
	}

}
