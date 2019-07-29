package Builder;

public class ConcreteBuilder implements RequestBuilder{

	private Request req;
	
	public ConcreteBuilder() {
		req = new Request();
	}

	@Override
	public void buildOpening(Call call, Customer cust){
		this.req.setAgent(call.getAgent());
		this.req.setReqId(call.getRequestId());
		//Customer check things
		this.req.setRequester(cust);
	}

	@Override
	public void buildResponse(String req) {
		this.req.setReqContent(req);
		if(req.contains("a")) {
			System.out.println("Here is the Response");
			this.req.setAnswered(true);
		}
		else {
			System.out.println("Redirecting your request");
			this.req.setAnswered(false);
		}

	}

	@Override
	public void buildClosing() {
		if(this.req.getAnswered()) {
			this.req.setNeedCallBack(false);
			this.req.setSaleLead(true);
		}
		else {
			this.req.setNeedCallBack(true);
			this.req.setSaleLead(false);
		}
		//save it into a db
			
	}

	@Override
	public Request getRequest() {
		return this.req;
	}

}
