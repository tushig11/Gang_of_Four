package CoR;

public class Reporter extends AbstractAgent{
	@Override
	public void handleRequest(CallRecord req){
		System.out.print("Request information ( ");
		System.out.print("Customer: " + req.getCustomer().getFullName() + " ");
		System.out.println("Description: " + req.getRequestInformation() + " )");
	}
}
