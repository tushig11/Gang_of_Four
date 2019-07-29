package Builder;

public class Request {

	private String reqId;
	private Customer requester;
	private Agent agent;
	private String reqContent;
	private String respContent;
	private boolean isAnswered;
	private boolean isSaleLead;
	private boolean needCallBack;

	//getters
	public String getReqId() {
		return this.reqId;
	}
	public Customer getRequester() {
		return this.requester;
	}
	public Agent getAgent() {
		return this.agent;
	}
	public String getReqContent() {
		return this.reqContent;
	}
	public String getRespContent() {
		return this.respContent;
	}
	public boolean getAnswered(){
		return this.isAnswered;
	}
	public boolean getSaleLead(){
		return this.isSaleLead;
	}
	public boolean getNeedCallBack(){
		return this.needCallBack;
	}
	//setters
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public void setRequester(Customer requester) {
		this.requester = requester;
	}
	public void setAnswered(boolean isAnswered) {
		this.isAnswered = isAnswered;
	}
	public void setNeedCallBack(boolean needCallBack) {
		this.needCallBack = needCallBack;
	}
	public void setReqContent(String reqContent) {
		this.reqContent = reqContent;
	}
	public void setRespContent(String respContent) {
		this.respContent = respContent;
	}
	public void setSaleLead(boolean isSaleLead) {
		this.isSaleLead = isSaleLead;
	}
	
	@Override
	public String toString() {
		return "--- Call record information ---\n" +
				"Request id: " + this.reqId +
				"\nAnswered: " + this.isAnswered + 
				"\nNeed Call back: " + this.needCallBack  +
			   "\n-------------------------------\n";
	}
}
