package com.curso.sinbuilder.cliente;

import com.curso.sinbuilder.Tarea;

public class Cliente3 {
	
	public static void main(String[] args) {
		
	    //Constructor propenso a confundir orden
		Tarea tarea = new Tarea(35,"Comprar tortillas","De maiz azul", 
							"Patrobas", "Filogono", false );
		
		System.out.println(tarea);
		
	}

}
