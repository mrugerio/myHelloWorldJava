
public class AguilaReal extends Aguila {
	
	String tipo = "Aguila Real";

	public AguilaReal(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	void volar() {
		System.out.println("Volar como un aguila Real");
	}
	
	void volarAguilaReal() {
		System.out.println("volarAguilaReal()");
	}

}
