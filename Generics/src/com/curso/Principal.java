package com.curso;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<String> listaString = new ArrayList<>();
		listaString.add("String "+"Hello");
		listaString.add("String "+"World");
		imprimirObjetos(listaString);
		//imprimirFiguras(listaString);
		//insertarFiguras(listaString);
		
		List<Circulo> listaCirculo = new ArrayList<>();
		listaCirculo.add(new Circulo(4.0));
		listaCirculo.add(new Circulo(2.0));
		imprimirObjetos(listaCirculo);
		imprimirFiguras(listaCirculo);
		//insertarFiguras(listaCirculo);

		List<Cuadrado> listaCuadrado = new ArrayList<>();
		listaCuadrado.add(new Cuadrado(4.0));
		listaCuadrado.add(new Cuadrado(2.0));
		imprimirObjetos(listaCuadrado);
		imprimirFiguras(listaCuadrado);
		//insertarFiguras(listaCuadrado);

		List<Triangulo> listaTriangulo = new ArrayList<>();
		listaTriangulo.add(new Triangulo(4.0));
		listaTriangulo.add(new Triangulo(2.0));
		imprimirObjetos(listaTriangulo);
		imprimirFiguras(listaTriangulo);
		//insertarFiguras(listaTriangulo);
		
		List<Figura> listaFigura = new ArrayList<>();
		listaFigura.add(new Circulo(4.0));
		listaFigura.add(new Cuadrado(4.0));
		listaFigura.add(new Triangulo(4.0));
		imprimirObjetos(listaFigura);
		imprimirFiguras(listaFigura);
		insertarFiguras(listaFigura);
	}
	static void imprimirObjetos(List<?> lista) {
		//lista.add(new String(""));
		for(Object o:lista) {
			//System.out.println("Imprimir Objeto: "+o);
		}
	}
	static void imprimirFiguras(List<? extends Figura> lista) {
		//lista.add(new Circulo(6.0));
		for(Figura fig:lista) {
			//System.out.println("Imprimir Figura área "+fig+": "+fig.getArea());
		}
	}
	static void insertarFiguras(List<? super Figura> lista) {
		lista.add(new Circulo(6.0));
		lista.add(new Cuadrado(6.0));
		lista.add(new Triangulo(6.0));
		for(Object o:lista) {
			System.out.println("Imprimir Insertar: "+o);
		}
	}
}

class Figura{
	private double area;
	public Figura(double area) {
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+
				" [area=" + area + "]";
	}
}
class Circulo extends Figura{
	public Circulo(double area) {
		super(area);
	}
}
class Cuadrado extends Figura{
	public Cuadrado(double area) {
		super(area);
	}
}
class Triangulo extends Figura{
	public Triangulo(double area) {
		super(area);
	}
}
