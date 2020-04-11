package com.curso.pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import com.curso.Constante;
import com.curso.Division;
import com.curso.Expresion;
import com.curso.Multi;
import com.curso.Resta;
import com.curso.Suma;

public class TestComposite {

	@Test
	public void testConstante() {
		double testValor = 3.0;
		Expresion e = new Constante(testValor);
		assertEquals(testValor,e.getValor(),0.0);
	}
	@Test
	public void testSuma() {
		double testValorA = 2.0;
		double testValorB = 4.0;
		Expresion izquierda = new Constante(testValorA);
		Expresion derecha = new Constante(testValorB);
		Expresion e = new Suma(izquierda,derecha);
		assertEquals(testValorA + testValorB , e.getValor() ,0.0);

	}
	@Test
	public void testResta() {
		double testValorA = 2.0;
		double testValorB = 4.0;
		Expresion izquierda = new Constante(testValorA);
		Expresion derecha = new Constante(testValorB);
		Expresion e = new Resta(izquierda,derecha);
		assertEquals(testValorA - testValorB , e.getValor() ,0.0);
	}
	@Test
	public void testMultiplicacion() {
		double testValorA = 2.0;
		double testValorB = 4.0;
		Expresion izquierda = new Constante(testValorA);
		Expresion derecha = new Constante(testValorB);
		Expresion e = new Multi(izquierda,derecha);
		assertEquals(testValorA * testValorB , e.getValor() ,0.0);
	}
	@Test
	public void testDivision() {
		double testValorA = 2.0;
		double testValorB = 4.0;
		Expresion izquierda = new Constante(testValorA);
		Expresion derecha = new Constante(testValorB);
		Expresion e = new Division(izquierda,derecha);
		assertEquals(testValorA / testValorB , e.getValor() ,0.0);
	}
	@Test
	public void testExpresionCompleja() {
		Expresion e = 
				new Division(
						new Multi(
								new Suma(
										new Constante(4.0),
										new Constante(6.0)
										),
								new Constante(200.0)
						),
						new Suma(
								new Constante(3),
								new Constante(83)
								)
								
						);
						
		assertEquals(23.2558, e.getValor(), 0.0001);
	}

}
