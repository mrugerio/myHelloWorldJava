package sincommand.dispositivo;

import accesorios.Luz;
import accesorios.Tv;

public class ControlInteligente {
	
	private Tv tv;
	private Luz luz;
	
	public void clickBoton1() {
		tv.on();
	}
	
	public void clickBoton2() {
		tv.off();
	}
	
	public void clickBoton3() {
		luz.encender();
	}
	
	public void clickBoton4() {
		luz.apagar();
	}
	
	public Tv getTv() {
		return tv;
	}
	public void setTv(Tv tv) {
		this.tv = tv;
	}
	public Luz getLuz() {
		return luz;
	}
	public void setLuz(Luz luz) {
		this.luz = luz;
	}

}
