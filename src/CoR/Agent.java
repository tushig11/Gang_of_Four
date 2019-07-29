package CoR;

public class Agent {
	
	private String agentId;
	private Address workLocation;
	
	public Agent(String id, Address addr) {
		this.agentId = id;
		this.workLocation = addr;
	}
	
	//getters
	public String getAgentId() {
		return agentId;
	}
	
	public Address getWorkLocation() {
		return workLocation;
	}
	
	//setters
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	
	public void setWorkLocation(Address workLocation) {
		this.workLocation = workLocation;
	}

}
