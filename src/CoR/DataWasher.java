package CoR;

public class DataWasher extends AbstractAgent{

	@Override
	public void handleRequest(CallRecord req) {
		//Request which starts with Java will be marked as a salesLead
		if(req.getRequestInformation().startsWith("Java")) {
			req.setIsASalesLead(true);
			if(this.nextAgent != null )
				this.nextAgent.handleRequest(req);
			else
				System.out.println("Data Washer handled the Request");
		}
		//if it is not a sales lead request
		else
			System.out.println("Thanks for Calling us.");
	}
}
