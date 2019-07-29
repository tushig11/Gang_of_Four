package CoR;

public class ChainBuilder {
	private AbstractAgent handler = new Validator();
	
	ChainBuilder(){
		buildChain();
	}
	
	private void buildChain(){
		AbstractAgent washer = new DataWasher();
		AbstractAgent reporter = new Reporter();
		handler.nextAgent = washer;
		washer.nextAgent = reporter;

	}
	
	public AbstractAgent getHandler() {
		return handler;
	}
}