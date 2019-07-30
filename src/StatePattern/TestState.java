package StatePattern;

public class TestState {
	public static void main(String[] args) {
		CarRace game = new CarRace();
		//default road regular
		System.out.println(game);
		game.turnLeft();
		game.Accel();
		game.turnRight();
		game.Brake();
		
		game.chooseRoad(3);
		System.out.println(game);
		game.turnLeft();
		game.Accel();
		game.turnRight();
		game.Brake();
		
		game.chooseRoad(2);
		System.out.println(game);
		game.turnLeft();
		game.Accel();
		game.turnRight();
		game.Brake();		
		
		game.chooseRoad(4);
		System.out.println(game);
		game.turnLeft();
		game.Accel();
		game.turnRight();
		game.Brake();		

	}
}
