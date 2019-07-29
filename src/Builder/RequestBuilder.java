package Builder;

public interface RequestBuilder {
	public void buildOpening(Call call, Customer cust);
	public void buildResponse(String req);
	public void buildClosing();
	public Request getRequest();
}
