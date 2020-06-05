package pojos;

public class Alumno {
	
	String nombre;

	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}
	
	
}
