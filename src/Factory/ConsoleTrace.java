package Factory;

public class ConsoleTrace implements Trace{
	private boolean state = false;
	@Override
	public void setDebug(boolean debug) {
		this.state = debug;
	}

	@Override
	public void debug(String message) {
		if(state)
			System.out.println("ConsoleTrace debug: " + message);
		else
			System.out.println("Debug mode disabled");
	}

	@Override
	public void error(String message) {
		if(state)
			System.out.println("ConsoleTrace error: " + message);
		else
			System.out.println("Debug mode disabled");
	}
	
	@Override
	public boolean getState() {
		return this.state;
	}
	
}
