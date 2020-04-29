package com.curso;

public class Principal {

	public static void main(String[] args) {

		Component laptopSinAccesorios = new Laptop();
		mostrarInfo(laptopSinAccesorios);
		
		Component laptopConAccesorios = new Enfriador(new Laptop());
		mostrarInfo(laptopConAccesorios);
		
		laptopConAccesorios = new MesaBambu(new Laptop());
		mostrarInfo(laptopConAccesorios);
		
		laptopConAccesorios = new Enfriador(new MesaBambu(new Laptop()));
		mostrarInfo(laptopConAccesorios);
		
		laptopConAccesorios = new Protector(new Enfriador(
									new MesaBambu(new Laptop())));
		mostrarInfo(laptopConAccesorios);
		
	}
	
	static void mostrarInfo(Component component) {
		System.out.println(component.getNombrePrecio());
		System.out.println("Costo Total: "+component.getCostoTotal());
		System.out.println("--------------");
	}

}
