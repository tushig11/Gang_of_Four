package StatePattern;

public class CSGravel implements State{

	private String name = "Gravel Road";

	public CSGravel() {
	}

	@Override
	public void left() {
		System.out.println(3);
	}

	@Override
	public void accel() {
		System.out.println(7);
	}

	@Override
	public void right() {
		System.out.println(3);
	}

	@Override
	public void brake() {
		System.out.println(6);
	}
	
	@Override
	public String getStateName() {
		return this.name;
	}

}
