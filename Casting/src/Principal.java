
public class Principal {
	
	public static void main(String[] args) {
		
		AguilaReal ave1 = new AguilaReal("Real",3);
		
		Aguila ave2 = ave1;
		
		Ave ave3 = ave2;
		
		Ave ave4 = new AguilaCalva("Calva",2);
		
		Aguila ave5 = (Aguila)ave4;
		
		AguilaCalva ave6 = (AguilaCalva)ave5;
		
		ave6.volar();
		
		
		
		
		
		
	}
	
	
	

}
