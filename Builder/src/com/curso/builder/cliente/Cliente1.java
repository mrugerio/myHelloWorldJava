package com.curso.builder.cliente;

import com.curso.builder.TareaBuilder;
import com.curso.builder.Tarea;

public class Cliente1 {
	
	public static void main(String[] args) {
		Tarea tarea = new TareaBuilder(20)
				.setTarea("Comprar leche")
				.setDefinidaPor("Epeneto")
				.setAsignadaA("Andronico")
				.build();
		
		System.out.println(tarea);
	}

}
