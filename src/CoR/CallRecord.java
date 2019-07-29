package CoR;

public class CallRecord {
	private Customer customer;
	private Agent agent;
	private String requestInformation;
	private boolean isValid = false;
	private boolean isASalesLead = false;
	
	CallRecord(Customer cust, Agent agent){
		this.customer = cust;
		this.agent = agent;
	}
	
	//getters
	public String getRequestInformation() {
		return requestInformation;
	}
	public boolean getIsValid(){
		return this.isValid;
	}
	public boolean getIsASalesLead(){
		return this.isASalesLead;
	}
	public Agent getAgent() {
		return agent;
	}
	public Customer getCustomer() {
		return customer;
	}
	
	//setters
	public void setIsValid(boolean isValid){
		this.isValid = isValid;
	}
	public void setIsASalesLead(boolean isASalesLead){
		this.isASalesLead = isASalesLead;
	}
	public void setRequestInformation(String requestInformation) {
		this.requestInformation = requestInformation;
	}
	
	
}
