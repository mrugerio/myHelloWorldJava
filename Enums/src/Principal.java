
public class Principal {

	public static void main(String[] args) {
		
		
		//System.out.println(e);
		//System.out.println(e == Estacion.PRIMAVERA);
		
		for (Estacion estacion: Estacion.values()) {
			//System.out.println(estacion.name() + " " + estacion.ordinal());
		}
		
		Estacion e = Estacion.INVIERNO;
		//Switch
		switch (e) {
		case PRIMAVERA:
			System.out.println("Estacion primavera");
			break;
		case INVIERNO:
			System.out.println("Estacion invierno");
			break;
		case OTOÑO:
			System.out.println("Estacion otoño");
			break;
		default:
			System.out.println("Tendría que ser Verano");
		}
		
		e.mostrarVisEsperados();

	}

}
