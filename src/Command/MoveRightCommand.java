package Command;

public class MoveRightCommand implements Command {
	private Square square;
	private int unit;
	
	public MoveRightCommand(Square square) {
		// TODO Auto-generated constructor stub
		this.square = square;
	}
	@Override
	public void execute(int unit) {
		// TODO Auto-generated method stub
		square.moveRight(unit);
		this.unit = unit;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		square.moveLeft(unit);
	}

}
