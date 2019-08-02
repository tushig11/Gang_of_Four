package State;

public class Silver implements AccountState {
	
	private String name = "Silver";
	private FFAccount myAccount;
	private AccountState nextState = new Gold(myAccount);;
	
	public Silver(FFAccount account) {
		this.myAccount = account;
	}
	@Override
	public void addFlight(int newMiles) {
		int currentMiles = myAccount.getNumberOfMiles();
		int currentFlights = myAccount.getNumberOfFlights();
		myAccount.setNumberOfMiles(currentMiles+=newMiles);
		myAccount.setNumberOfFlights(currentFlights++);
		checkForUpdate();
	}
	
	@Override
	public String getState() {
		return name;
	}
	
	public void checkForUpdate(){
		if ((myAccount.getNumberOfMiles() > 75000)|| (myAccount.getNumberOfFlights() > 75)){
			myAccount.setAccountType(nextState);
		} 	
	}

}
