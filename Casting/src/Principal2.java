
public class Principal2 {

	public static void main(String[] args) {
		
		Ave ave = getAve();
		
		//ave.volarAguilaReal(); //NO SE PUEDE
		
		if (ave instanceof AguilaReal) {
			AguilaReal aguilaReal = (AguilaReal) ave;
			aguilaReal.volarAguilaReal();
		}else {
			System.out.println("Metodo no definido en la variable de la clase");
		}

	}
	
	static Ave getAve() {
		return new Ave("Ave",1);
		//return new Aguila("Aguila",2);
		//return new AguilaCalva("AguilaCalva",3);
		//return new AguilaReal("AguilaReal",4);
		
	}

}
