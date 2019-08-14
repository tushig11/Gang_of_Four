package Command;

public interface Command {
	public void execute(int unit);
	public void undo();
}
