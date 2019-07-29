package CoR;

public class Request {
	private String request;
	private boolean answered;
	
	public Request(String req) {
		this.request = req;
	}
	
	public String getRequest() {
		return request;
	}
	
	public boolean getAnswered(){
		return this.answered;
	}
	
	public void setAnswered(boolean answered) {
		this.answered = answered;
	}
	
	public void setRequest(String request) {
		this.request = request;
	}

}
