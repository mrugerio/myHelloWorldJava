package command.comandos;

import accesorios.Tv;

public class CommandTvOff implements Command {
	
	Tv tv;

	public CommandTvOff(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

}
