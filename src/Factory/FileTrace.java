package Factory;

public class FileTrace implements Trace{
	private boolean state = false;
	@Override
	public void setDebug(boolean debug) {
		this.state = debug;
	}

	@Override
	public void debug(String message) {
		if(state)
			System.out.println("FileTrace debug: " + message);
		else
			System.out.println("Debug mode disabled");
	}

	@Override
	public void error(String message) {
		if(state)
			System.out.println("FileTrace error: " + message);
		else
			System.out.println("Debug mode disabled");
	}
	@Override
	public boolean getState() {
		return this.state;
	}
}
