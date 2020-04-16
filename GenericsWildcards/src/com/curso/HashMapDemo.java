package com.curso;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Crear un nuevo hash map
		Map<Number, Figura> newHashMap = new HashMap<>();
		
		//putAll(Map<? extends K,? extends V> m)
		
		//Crear un hash map
		Map<Integer, Circulo> hashMap = new HashMap<>();
		hashMap.put(10, new Circulo(1));
		hashMap.put(20, new Circulo(2));
		hashMap.put(30, new Circulo(3));
		hashMap.put(40, new Circulo(4));
		
		System.out.println(hashMap);
		
		newHashMap.putAll(hashMap);
		System.out.println("Nuevo HashMap");
		System.out.println(newHashMap);



	}

}
