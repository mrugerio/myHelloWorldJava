package com.curso.builder.cliente;

import com.curso.builder.TareaBuilder;

import java.util.Date;

import com.curso.builder.Tarea;

public class Cliente3 {
	
	public static void main(String[] args) {
		

		Tarea tarea = new TareaBuilder(35)
				.setFechaLimite(new Date())
				.setAsignadaA("Filogono")
				.setDescripcion("De maiz azul")
				.setHecho(false)
				.setTarea("Comprar tortillas")
				.setDefinidaPor("Patrobas")
				.build();
		
		System.out.println(tarea);
		
	}

}
