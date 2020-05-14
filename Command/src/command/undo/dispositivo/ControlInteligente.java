package command.undo.dispositivo;

import command.undo.comandos.Command;

public class ControlInteligente {
	
	private Command boton1;
	private Command boton2;
	private Command boton3;
	private Command boton4;
	private Command botonUndo;
	
	public void clickBoton1() {
		boton1.execute();
		botonUndo = boton1;
	}
	
	public void clickBoton2() {
		boton2.execute();
		botonUndo = boton2;
	}
	
	public void clickBoton3() {
		boton3.execute();
		botonUndo = boton3;
	}
	
	public void clickBoton4() {
		boton4.execute();
		botonUndo = boton4;
	}
	
	public void clickBotonUndo() {
		System.out.print("Click undo: ");
		botonUndo.undo();
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
