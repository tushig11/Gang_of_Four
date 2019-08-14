package Command;

public class ScaleCommand implements Command {
	private Square square;
	
	public ScaleCommand(Square square) 
	{
		this.square = square;
	}

	@Override
	public void execute(int unit) {
		// TODO Auto-generated method stub
		square.scale(unit);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		square.undoScale();
	}

}
