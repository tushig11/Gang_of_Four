package Flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = CustomerFactory.getCustomer(1, "A", "B", 
				new Address("abc","def","ghi","jkl","111"), new HealthProfile());
		
		c1.print();
		
		Customer c2 = CustomerFactory.getCustomer(2, "C", "D", 
				new Address("hhh","fff","eee","bbb","222"), new HealthProfile());
		
		c2.print();
		
		Customer c3 = CustomerFactory.getCustomer(1, "A", "B", 
				new Address("abc","def","ghi","jkl","111"), new HealthProfile());
		
		c3.print();
		
		CustomerFactory.display();
	}

}
