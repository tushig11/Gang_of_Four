package Flyweight;

public class Customer implements ICustomer {
	private int customerId;
	private String firstName;
	private String lastName;
	private Address residenceAddress;
	private HealthProfile profile;
	
	//Intrinsic Attribute
	private final Image locationMap;
	
	public Customer()
	{
		this.locationMap = new Image(3, 4);
	}
	
	@Override
	public void createCustomer(int id, String firstName, String lastName, Address address, HealthProfile profile) {
		// TODO Auto-generated method stub
		this.customerId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.residenceAddress = address;
		this.profile = profile;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Id: " + this.customerId + " Firstname: " + this.firstName + " Lastname: "
				+ this.lastName);
		System.out.println("Address: " +
				" " + residenceAddress.getStreet1() 
				+ " " +residenceAddress.getStreet2()
		+ " " + residenceAddress.getCity()
		+ " " + residenceAddress.getState()
		+ " " + residenceAddress.getZipcode());
		
		System.out.println("X: " + locationMap.getX() 
				+ " Y: " + locationMap.getY());
	}
	
	public int getId() {
		return this.customerId;
	}
	
	public String getFirstname()
	{
		return this.firstName;
	}
	
	public String getLastname()
	{
		return this.lastName;
	}
	
	public HealthProfile getProfile() {
		return profile;
	}
	
}
