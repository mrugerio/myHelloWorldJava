package com.curso;

public class Principal {

	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		int res = 0;
		try {
			res = calculaDiv(x,y);
			System.out.println("Resultado: "+res);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("No se puede dividir entre 0");
		}
		finally {
			System.out.println("Fin de programa");
		}

	}

	private static int calculaDiv(int x, int y) {
		return x / y;
	}

}
