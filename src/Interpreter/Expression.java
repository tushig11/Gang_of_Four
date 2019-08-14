package Interpreter;

public class Expression {
	private String tokenString;
	
	public Expression(String tokenString) {
		this.tokenString = tokenString;
	}
	
	public String interpret() {
		return "";
	}
	
	public String getTokenString() {
		return tokenString;
	}
}
