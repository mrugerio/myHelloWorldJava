package command.dispositivo;

import accesorios.*;
import command.comandos.*;

public class Configuracion {
	
	public static void configurar(ControlInteligente ci) {
		Luz luz = new Luz();
		Tv tv = new Tv();
		
		ci.setBoton3(new CommandLuzOn(luz));
		ci.setBoton4(new CommandLuzOff(luz));
		ci.setBoton1(new CommandTvOn(tv));
		ci.setBoton2(new CommandTvOff(tv));

	}

}
