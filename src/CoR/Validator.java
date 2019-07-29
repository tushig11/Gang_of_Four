package CoR;

public class Validator extends AbstractAgent{

	@Override
	public void handleRequest(CallRecord req) {
		if(req.getCustomer().getAddress() != null) {
			req.setIsValid(true);
			if(this.nextAgent != null )
				this.nextAgent.handleRequest(req);
			else
				System.out.println("Validator handled the Request");
		}
		else
			System.out.println("Request discarded");

	}

}
