package CoR;

public class DataWasher extends AbstractAgent{

	@Override
	public void handleRequest(CallRecord req) {
		if(req.getRequestInformation().startsWith("Java")) {
			req.setIsASalesLead(true);
			if(this.nextAgent != null )
				this.nextAgent.handleRequest(req);
			else
				System.out.println("Data Washer handled the Request");
		}
		else
			System.out.println("Thanks for Calling us.");

	}
}
