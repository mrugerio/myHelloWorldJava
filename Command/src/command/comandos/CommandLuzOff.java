package command.comandos;

import accesorios.Luz;

public class CommandLuzOff implements Command {
	
	Luz luz;

	public CommandLuzOff(Luz luz) {
		this.luz = luz;
	}

	@Override
	public void execute() {
		luz.apagar();
	}

}
