package Builder;

public class RequestDirector {

	private RequestBuilder reqBuilder = null; //or multiple meal builders
	public RequestDirector(RequestBuilder reqBuilder) {
		this.reqBuilder = reqBuilder;
	}
	public void constructRequest(Call call, Customer cust, String req) {
		reqBuilder.buildOpening(call, cust);
		reqBuilder.buildResponse(req);
		reqBuilder.buildClosing();
	}
	public Request getRequest() {
		return reqBuilder.getRequest();
	}

}
