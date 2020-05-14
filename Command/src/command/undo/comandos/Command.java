package command.undo.comandos;

public interface Command {
	
	public void execute();
	
	public void undo();

}
