package command.undo.dispositivo;

import accesorios.*;
import command.undo.comandos.*;

public class Configuracion {
	
	public static void configurar(ControlInteligente ci) {
		Luz luz = new Luz();
		Tv tv = new Tv();
		
		ci.setBoton1(new CommandTvOn(tv));
		ci.setBoton2(new CommandTvOff(tv));
		ci.setBoton3(new CommandLuzOn(luz));
		ci.setBoton4(new CommandLuzOff(luz));
		
	}

}
