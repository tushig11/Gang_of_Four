package Flyweight;

public interface ICustomer {
	public void createCustomer(int id, String firstName, String lastName,
			Address address, HealthProfile profile);
	
	public void print();
}
