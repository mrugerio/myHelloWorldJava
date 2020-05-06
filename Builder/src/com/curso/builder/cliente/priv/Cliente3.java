package com.curso.builder.cliente.priv;

import com.curso.builder.priv.Tarea;

import java.util.Date;

public class Cliente3 {
	
	public static void main(String[] args) {
		

		Tarea tarea = new Tarea.TareaBuilder(35)
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
