package StatePattern;

public class CSWet implements State {

	private String name = "Wet Road";

	@Override
	public void left() {
		System.out.println(4);
	}

	@Override
	public void accel() {
		System.out.println(9);
	}

	@Override
	public void right() {
		System.out.println(4);
	}

	@Override
	public void brake() {
		System.out.println(7);
	}

	@Override
	public String getStateName() {
		return this.name;
	}
}
