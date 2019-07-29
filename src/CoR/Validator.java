package CoR;

public class Validator extends AbstractAgent{

	@Override
	public void handleRequest(CallRecord req) {
		// Checked only address, email, phone can be checkable here . . . 
		if(req.getCustomer().getAddress() != null) {
			req.setIsValid(true);
			if(this.nextAgent != null )
				this.nextAgent.handleRequest(req);
			else
				//if it is last agent of chain
				System.out.println("Validator handled the Request");
		}
		else
			System.out.println("Saved in discarded-requests file.");

	}

}
