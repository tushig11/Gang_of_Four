package Builder;

public class TestBuilder {
	public static void main(String[] args) {
		Agent agent = new Agent(1, "JuniorAgent");
		Customer cust = new Customer("515-232-2323");
		Customer cust1 = new Customer("232-231-1212");
		
		Call call = new Call();
		Call call1 = new Call();
		
		call.callPop(agent);
		call1.callPop(agent);
		
		RequestDirector rd = new RequestDirector(new ConcreteBuilder());

		String text1 = "This is new request";
		String text2 = "This is a new request";
		
		rd.constructRequest(call, cust, text1);
		Request req1 = rd.getRequest();
		System.out.println(req1);
		
		rd.constructRequest(call1, cust1, text2);
		Request req2 = rd.getRequest();
		System.out.println(req2);
	}
}
