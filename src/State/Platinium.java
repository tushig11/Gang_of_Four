package State;

public class Platinium implements AccountState{

	private String name = "Platinium";
	private FFAccount myAccount;
	//private AccountState nextState = newState;
	
	public Platinium(FFAccount account) {
		this.myAccount = account;
	}
	
	@Override
	public void addFlight(int newMiles) {
		int currentMiles = myAccount.getNumberOfMiles();
		int currentFlights = myAccount.getNumberOfFlights();
		myAccount.setNumberOfMiles(currentMiles+=3*newMiles);
		myAccount.setNumberOfFlights(currentFlights += 2);
//		checkForUpdate();
	}

	@Override
	public String getState() {
		return name;
	}

//	public void checkForUpdate(){
//		do Something();
//	}
	
}
