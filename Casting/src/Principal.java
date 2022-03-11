
public class Principal {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		
		AguilaReal ave1 = new AguilaReal("Real",3);
		//ave1.volar();
		//System.out.println(ave1.tipo);
		//ave1.volarAguilaReal();
		//ave1.volarAguila();
		//ave1.volarAve();
		
		Aguila ave2 = ave1;
		//ave2.volar();
		//System.out.println(ave2.tipo);
		//ave2.volarAguilaReal(); //NO SE PUEDE
		//ave2.volarAguila();
		//ave2.volarAve();
		
		Ave ave3 = ave2;
		//ave3.volar();
		//System.out.println(ave3.tipo);
		//ave3.volarAguilaReal(); //NO SE PUEDE
		//ave3.volarAguila(); //NO SE PUEDE
		//ave3.volarAve();
		
		Ave ave = new AguilaReal("Otra Real",2);
		ave.volar();
		System.out.println(ave.tipo);
		//ave.volarAguilaReal(); //NO SE PUEDE
		//ave.volarAguila(); //NO SE PUEDE
		ave.volarAve();
		
		*/
		
		
		Ave ave4 = new AguilaCalva("Calva",2);
		//ave4.volar();
		//System.out.println(ave4.tipo);
		//ave4.volarAguilaCalva(); //NO SE PUEDE
		//ave4.volarAguila(); //NO SE PUEDE
		//ave4.volarAve();
		
		Aguila ave5 = (Aguila)ave4;
		//ave5.volar();
		//System.out.println(ave5.tipo);
		//ave5.volarAguilaCalva(); //NO SE PUEDE
		//ave5.volarAguila(); 
		//ave5.volarAve();
		
		AguilaCalva ave6 = (AguilaCalva)ave5;
//		ave6.volar();
//		System.out.println(ave6.tipo);
//		ave6.volarAguilaCalva(); 
//		ave6.volarAguila(); 
//		ave6.volarAve();
//		
		Ave ave7 = new AguilaCalva("Otra Aguila Calva",3);
		AguilaCalva ave8 = (AguilaCalva) ave7;
		ave8.volarAguilaCalva();
		
		
		
		
		
		
		
		
		
	}
}
