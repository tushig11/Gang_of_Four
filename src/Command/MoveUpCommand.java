package Command;

public class MoveUpCommand implements Command {
	private Square square;
	private int unit;

	public MoveUpCommand(Square square) {
		// TODO Auto-generated constructor stub
		this.square = square;
	}
	@Override
	public void execute(int unit) {
		// TODO Auto-generated method stub
		square.moveUp(unit);
		this.unit = unit;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		square.moveDown(unit);
	}

}
