package com.curso;

public class Principal2 {

	public static void main(String[] args) {
		int x = 101;
		int y = 2;
		int res = 0;

		try {
			res = calculaDiv(x,y);
			System.out.println("Resultado: " + res);
		} catch (CeroException | NegativoException  e) {
			e.printStackTrace();
			System.out.println("No se pudo ejecutar la operación");
		} 
		finally {
			System.out.println("Paso por Finally");
		}

	}

	private static int calculaDiv(int x, int y) throws CeroException, NegativoException {
		if (y==0) {
			throw new CeroException("No se puede dividir entre cero");
		}
		if (y<0) {
			throw new NegativoException("No se puede dividir entre negativos");
		}
		if (x>100) {
			throw new UnsupportedOperationException("x no puede ser mayor a 100");
		}
		
		return x / y;
	}

}
