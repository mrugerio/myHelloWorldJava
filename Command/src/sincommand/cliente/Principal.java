package sincommand.cliente;

import accesorios.Luz;
import accesorios.Tv;
import sincommand.dispositivo.ControlInteligente;

public class Principal {

	public static void main(String[] args) {

		ControlInteligente control = new ControlInteligente();
		
		Luz luz = new Luz();
		Tv tv = new Tv();
		
		control.setLuz(luz);
		control.setTv(tv);
		
		control.clickBoton1();
		control.clickBoton3();
		control.clickBoton2();
		control.clickBoton4();
		
		
	}

}
