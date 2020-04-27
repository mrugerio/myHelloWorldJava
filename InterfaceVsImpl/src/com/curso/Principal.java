package com.curso;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		//Perro a = new Perro();
		//a.hacerSonido();
		
		/*Animal a = new Perro();
		a.hacerSonido();
		a = new Burro();
		a.hacerSonido();*/
		
		Animal a = getAnimal();
		a.hacerSonido();

	}

	private static Animal getAnimal() {
		Animal[] animales = {new Gato(),new Perro(),new Burro()};
		int random = new Random().nextInt(animales.length);
		Animal animal = animales[random];
		return animal;
	}

}
