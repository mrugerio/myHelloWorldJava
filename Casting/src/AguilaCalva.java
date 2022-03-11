
public class AguilaCalva extends Aguila {
	
	String tipo = "Aguila Calva";

	public AguilaCalva(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	void volar() {
		System.out.println("Volar como un aguila Calva");
	}
	
	void volarAguilaCalva() {
		System.out.println("volarAguilaCalva()");
	}

}
