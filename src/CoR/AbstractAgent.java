package CoR;

public abstract class AbstractAgent {
	protected AbstractAgent nextAgent;
	abstract public void handleRequest(CallRecord req);
	boolean canHandleRequest(CallRecord req){
		return true;
	}
}