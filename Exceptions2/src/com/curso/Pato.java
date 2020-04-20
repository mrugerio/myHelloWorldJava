package com.curso;

public class Pato implements AutoCloseable{

	public static void main(String[] args) {
		try (Pato p = new Pato()){
			System.out.println(p);
		}
	}

	@Override
	public void close() {
		System.out.println("Cerrar al Pato");
	}

	@Override
	public String toString() {
		return "Pato []";
	}
}
