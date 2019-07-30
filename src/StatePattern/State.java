package StatePattern;

public interface State {
	public void left();
	public void accel();
	public void right();
	public void brake();
	public String getStateName();
}
