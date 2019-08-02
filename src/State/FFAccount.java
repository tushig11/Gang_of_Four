package State;

public class FFAccount {
	//attributes
	private String accountNumber;
	private int numberOfMiles;
	private int numberOfFlights;
	
	private AccountState state;
	
	//constructor
	public FFAccount(String aNumber) {
		accountNumber = aNumber;
		state = new Silver(this);
	}
	
	//methods
	public void addFlight(int newMiles){
		state.addFlight(newMiles);
	}
	
	public String getAccountType() {
		return state.getState();
	}
	
	public void setAccountType(AccountState state){
		this.state = state;
	}
	
	public int getNumberOfMiles() {
		return numberOfMiles;
	}
	
	public int getNumberOfFlights() {
		return numberOfFlights;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}

	//added setters
	public void setNumberOfFlights(int numberOfFlights) {
		this.numberOfFlights = numberOfFlights;
	}
	
	public void setNumberOfMiles(int numberOfMiles) {
		this.numberOfMiles = numberOfMiles;
	}
} 
