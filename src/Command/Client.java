package Command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq1 = new Square();
		Command cmdCreate = new CreateCommand(sq1);
		cmdCreate.execute(5);
		Command cmdScale = new ScaleCommand(sq1);
		cmdScale.execute(2);
		cmdScale.undo();
		
		Command cmdUp = new MoveUpCommand(sq1);
		cmdUp.execute(10);
		cmdUp.undo();

		Command cmdDown = new MoveDownCommand(sq1);
		cmdDown.execute(5);
		cmdDown.undo();

		Command cmdLeft = new MoveLeftCommand(sq1);
		cmdLeft.execute(2);
		cmdLeft.undo();

		Command cmdRight = new MoveRightCommand(sq1);
		cmdRight.execute(8);
		cmdRight.undo();

	}

}
