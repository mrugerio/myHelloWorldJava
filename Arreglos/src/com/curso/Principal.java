package com.curso;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {

		String[] arreglo = new String[] {"A","B","C","D"};
		int[] arrayint = {1,2,3,4,5};
		int[] arrayint2 = new int[3];
		arrayint2[0] = 7;
		arrayint2[1] = 8;
		arrayint2[2] = 9;
		
		System.out.println(Arrays.toString(arreglo));
		System.out.println(Arrays.toString(arrayint));
		System.out.println(Arrays.toString(arrayint2));

		System.out.println(arreglo[3]);
		System.out.println(arrayint[4]);
		System.out.println(arrayint2[1]);
		System.out.println("length: "+arreglo.length);
		
		ArrayList<String> listString = new ArrayList<>();
		listString.add("A");
		listString.add("B");
		listString.add("C");
		listString.add("D");

		System.out.println("-----------");
		System.out.println(listString.size());
		
		listString.remove(2);
		
		System.out.println(listString.size());
		
	
		
	}

}
