package com.curso;

public class Empleado implements Comparable<Empleado> {
	
	private String nombre;
	private int edad;
	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}

	@Override
	public int compareTo(Empleado o) {
		return o.nombre.compareTo(this.nombre);
	}
	
	/*@Override
	public int compareTo(Empleado o) {
		if (this.edad > o.edad) return -1;
		if (this.edad < o.edad) return 1;
		return 0;
	}*/
	/*public int compareTo(Empleado o) {
		if (this.sueldo > o.sueldo) return 1;
		if (this.sueldo < o.sueldo) return -1;
		return 0;
	}	*/
	
	
}
