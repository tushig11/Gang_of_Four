package Command;

public class MoveDownCommand implements Command
{
	private Square square;
	int unit;
	
	public MoveDownCommand(Square square) {
		// TODO Auto-generated constructor stub
		this.square = square;
	}

	@Override
	public void execute(int unit) {
		// TODO Auto-generated method stub
		square.moveDown(unit);
		this.unit = unit;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		square.moveUp(unit);
	}

}
