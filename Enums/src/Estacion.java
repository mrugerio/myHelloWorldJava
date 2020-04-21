
public enum Estacion {
	
	INVIERNO("Baja"), 
	PRIMAVERA("Media"), 
	VERANO("Alta"), 
	OTOÑO("Media");
	
	private String visitantesEsperados;

	private Estacion(String visitantesEsperados) {
		this.visitantesEsperados = visitantesEsperados;
	}
	
	public void mostrarVisEsperados() {
		System.out.println(visitantesEsperados);
	}

}
