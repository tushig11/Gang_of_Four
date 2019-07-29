package Builder;

public class Response {

	private String reqContent;
	private String respContent;
	
	public Response(String req) {
		this.reqContent = req;
	}
	
	//getters
	public String getReqContent() {
		return reqContent;
	}
	
	public String getRespContent() {
		return respContent;
	}
	
	//setters
	public void setReqContent(String reqContent) {
		this.reqContent = reqContent;
	}
	
	public void setRespContent(String respContent) {
		this.respContent = respContent;
	}

}
