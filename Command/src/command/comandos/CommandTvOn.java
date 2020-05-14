package command.comandos;

import accesorios.Tv;

public class CommandTvOn implements Command {
	
	Tv tv;

	public CommandTvOn(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}

}
