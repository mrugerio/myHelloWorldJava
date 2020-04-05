
public class AguilaCalva extends Aguila {

	public AguilaCalva(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	void volar() {
		System.out.println("Puedo volar como un aguila Calva");
	}

}
