package CoR;

public class Customer{
	private String firstName;
	private String lastName;
	private Address address;
	private String phone;
	private String email;
	
	public Customer(String fname, String lname,  String phone, String email){
		this.firstName = fname;
		this.lastName = lname;
		this.address = null;
		this.phone = phone;
		this.email = email;
	}
	
	//getter methods
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Address getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	//setter methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
