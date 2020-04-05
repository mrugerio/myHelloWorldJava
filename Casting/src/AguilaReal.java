
public class AguilaReal extends Aguila {

	public AguilaReal(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	void volar() {
		System.out.println("Puedo volar como un aguila Real");
	}

}
