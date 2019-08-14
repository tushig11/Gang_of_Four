package Interpreter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tokenString = "- + 10 5 - 8 2";
			
		Expression expression = new Expression(tokenString);
		System.out.println(expression.interpret());
	}

}
