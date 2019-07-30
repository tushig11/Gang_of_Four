package StatePattern;

public class CarRace {

	private State gravel;
	private State ice;
	private State regular;
	private State wet;
	
	private State state;

	public CarRace(){
		regular = new CSRegular();
		gravel = new CSGravel();
		wet = new CSWet();
		ice = new CSIce();
		
		state = regular;
	}

	public void turnLeft() {
		state.left();
	}

	public void turnRight() {
		state.right();
	}
	
	public void Accel() {
		state.accel();
	}
	
	public void Brake() {
		state.brake();
	}
	
	void chooseRoad(int level) {
		switch(level) {
			case 1:
				setState(regular);
				break;
			case 2:
				setState(gravel);
				break;
			case 3:
				setState(wet);
				break;
			case 4:
				setState(ice);
				break;
			default:
				System.out.println("Select one of the following roads:");
				System.out.println("1. Regular");
				System.out.println("2. Gravel");
				System.out.println("3. Wet");
				System.out.println("4. Ice");
		}
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Current Stage is: " +this.state.getStateName();
	}
}
