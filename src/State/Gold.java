package State;

public class Gold implements AccountState {

	private String name = "Gold";
	private FFAccount myAccount;
	private AccountState nextState;
	
	public Gold(FFAccount account) {
		this.myAccount = account;
	}
	@Override
	public void addFlight(int newMiles) {
		int currentMiles = myAccount.getNumberOfMiles();
		int currentFlights = myAccount.getNumberOfFlights();
		myAccount.setNumberOfMiles(currentMiles+=2*newMiles);
		myAccount.setNumberOfFlights(currentFlights++);
		checkForUpdate();
	}
	
	public String getState() {
		return name;
	}

	public void checkForUpdate(){
		if ((myAccount.getNumberOfMiles() > 150.000)|| (myAccount.getNumberOfFlights() > 145)){
			nextState = new Platinium(myAccount);
			myAccount.setAccountType(nextState);
		} 	
	}
}
