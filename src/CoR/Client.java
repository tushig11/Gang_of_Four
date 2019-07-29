package CoR;

public class Client {
	private ChainBuilder chain; //can be injected or received from a constructor
	
	Client(ChainBuilder chain){
		this.chain = chain;
	}
	
	public void sendRequest(Customer customer, String req) {
		
		Address addr2 = new Address("Court", "Fairfield", "IA", "52556");
		Agent agent = new Agent("1", addr2);
		
		CallRecord rec = new CallRecord(customer, agent);
		rec.setRequestInformation(req);
		
		chain.getHandler().handleRequest(rec);
	}
}