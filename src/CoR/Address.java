package CoR;

public class Address {

	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;

	public Address(String street, String city, String state, String zip) {
		this.streetAddress = street;
		this.city = city;
		this.state = state;
		this.zipcode = zip;
	}

	//getter methods
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	//setter methods
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
