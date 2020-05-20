package com.curso;

import java.util.*;

public class SumaNumsImpares {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++)
			list.add(i);
		
		int sumaImpares = calculaSumaImp(list);
		System.out.println("Suma números impares = "+sumaImpares);
	}

	private static int calculaSumaImp(List<Integer> list) {
		int sum = 0;
		// unboxing de i es automático
		for(Integer i:list) {
			if (i % 2 !=0)
				sum += i;
		}
		
		return sum;
	}
}
