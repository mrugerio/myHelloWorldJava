package com.curso.v2;

public class Principal2 {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		show(intArray);
		show(doubleArray);
		show(charArray);


	}
	
	private static <T> void  show(T[] inputArray){
		for(T elemento: inputArray) {
			System.out.println("Elemento: "+elemento);
		}
		
	}

}
