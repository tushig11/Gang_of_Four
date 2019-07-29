package CoR;

public class TestCoR {
	public static void main(String[] args) {
		//Setup
		ChainBuilder chain = new ChainBuilder();
		Client client = new Client(chain);
		
		Address addr1 = new Address("4th", "Fairfield", "IA", "52557");
		//Customer
		Customer cust1 = new Customer("Bob", "Ken", "516-223-6541","bob@gmail.com");
		Customer cust2 = new Customer("Bryan", "John", "265-564-7823","bryan@gmail.com");
		Customer cust3 = new Customer("John", "Joe", "654-256-3145","john@gmail.com");
		cust2.setAddress(addr1);
		cust3.setAddress(addr1);
	
		client.sendRequest(cust1, "C");
		client.sendRequest(cust2, "Java");
		client.sendRequest(cust2, "JavaScript");
		client.sendRequest(cust3, "C++");
		client.sendRequest(cust3, "JavaFX");
		
	}
}
