package command.dispositivo;

import command.comandos.Command;

public class ControlInteligente {
	
	private Command boton1;
	private Command boton2;
	private Command boton3;
	private Command boton4;
	
	public void clickBoton1() {
		boton1.execute();
	}
	
	public void clickBoton2() {
		boton2.execute();
	}
	
	public void clickBoton3() {
		boton3.execute();
	}
	
	public void clickBoton4() {
		boton4.execute();
	}

	public Command getBoton1() {
		return boton1;
	}

	public void setBoton1(Command boton1) {
		this.boton1 = boton1;
	}

	public Command getBoton2() {
		return boton2;
	}

	public void setBoton2(Command boton2) {
		this.boton2 = boton2;
	}

	public Command getBoton3() {
		return boton3;
	}

	public void setBoton3(Command boton3) {
		this.boton3 = boton3;
	}

	public Command getBoton4() {
		return boton4;
	}

	public void setBoton4(Command boton4) {
		this.boton4 = boton4;
	}

}
