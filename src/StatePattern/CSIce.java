package StatePattern;

public class CSIce implements State{

	private String name = "Icy Road";

	@Override
	public void left() {
		System.out.println(1);
	}

	@Override
	public void accel() {
		System.out.println(3);
	}

	@Override
	public void right() {
		System.out.println(1);
	}

	@Override
	public void brake() {
		System.out.println(2);
	}

	@Override
	public String getStateName() {
		return this.name;
	}
}
