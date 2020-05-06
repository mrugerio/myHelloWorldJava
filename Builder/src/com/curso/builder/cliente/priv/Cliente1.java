package com.curso.builder.cliente.priv;

import com.curso.builder.priv.Tarea;

public class Cliente1 {
	
	public static void main(String[] args) {
		
		Tarea tarea = new Tarea.TareaBuilder(20)
				.setTarea("Comprar leche")
				.setDefinidaPor("Epeneto")
				.setAsignadaA("Andronico")
				.build();
		
		System.out.println(tarea);
	}

}
