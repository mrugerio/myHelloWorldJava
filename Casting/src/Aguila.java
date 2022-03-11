
public class Aguila extends Ave {
	
	String tipo = "Aguila";

	public Aguila(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	void volar() {
		System.out.println("Volar Aguila");
	}
	
	void volarAguila() {
		System.out.println("volarAguila()");
	}

}
