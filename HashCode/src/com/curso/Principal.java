package com.curso;

public class Principal {

	public static void main(String[] args) {

		Carta corazon7 = new Carta("7","Corazon");
		Carta corazon4 = new Carta("4","Corazon");
		Carta corazonOtro4 = new Carta("4","Corazon");
		Carta diamante4 = new Carta("4","Diamante");
		Carta diamante7 = new Carta("7","Diamante");

		System.out.println("corazon4.equals(corazonOtro4): ");
		System.out.println(corazon4.equals(corazonOtro4));
		System.out.println("corazon4.hashCode(): ");
		System.out.println(corazon4.hashCode());
		System.out.println("corazon7.hashCode(): ");
		System.out.println(corazon7.hashCode());
		System.out.println("corazon4.hashCode() == corazon7.hashCode(): ");
		System.out.println(corazon4.hashCode() == corazon7.hashCode());
		System.out.println("corazon4.equals(corazon7): ");
		System.out.println(corazon4.equals(corazon7));
		System.out.println("corazon4.hashCode() == diamante4.hashCode(): ");
		System.out.println(corazon4.hashCode() == diamante4.hashCode());
		System.out.println("diamante4.hashCode(): ");
		System.out.println(diamante4.hashCode());
		System.out.println("diamante7.hashCode(): ");
		System.out.println(diamante7.hashCode());
		System.out.println("diamante4.equals(diamante7): ");
		System.out.println(diamante4.equals(diamante7));
		System.out.println("diamante4.hashCode() == diamante7.hashCode(): ");
		System.out.println(diamante4.hashCode() == diamante7.hashCode());

	}

}
