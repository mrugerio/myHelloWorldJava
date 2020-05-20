package com.curso;

public class Principal {

	public static void main(String[] args) {

		int intPrim = 10;
		//Autoboxing int
		Integer intObj = intPrim;
		System.out.println("Valor de intObj: "+intObj);
		//Unboxing int
		int intPrim2 = intObj;
		System.out.println("Valor de intPrim2: "+intPrim2);
		
		//Autoboxing char
		Character charObj = 'a';
		//Unboxing Character
		char charPrim = charObj;
		System.out.println("Valor de charObj: "+charObj);
		System.out.println("Valor de charPrim: "+charPrim);

	}

}
