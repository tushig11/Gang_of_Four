package StatePattern;

public class CSRegular implements State{

	private String name = "Regular Road";

	@Override
	public void left() {
		System.out.println(5);
	}

	@Override
	public void accel() {
		System.out.println(9);
	}

	@Override
	public void right() {
		System.out.println(5);
	}

	@Override
	public void brake() {
		System.out.println(8);
	}

	@Override
	public String getStateName() {
		return this.name;
	}
}
