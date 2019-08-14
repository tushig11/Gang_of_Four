package Command;

public class MoveLeftCommand implements Command {

	private Square square;
	private int unit;
	
	public MoveLeftCommand(Square square) {
		// TODO Auto-generated constructor stub
		this.square = square;
	}
	
	@Override
	public void execute(int unit) {
		// TODO Auto-generated method stub
		square.moveLeft(unit);
		this.unit = unit;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		square.moveRight(unit);
	}

}
