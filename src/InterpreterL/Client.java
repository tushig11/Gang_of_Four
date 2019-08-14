package InterpreterL;

import java.util.Iterator;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roman = "MDCCCXIII";
		
		Context context = new Context(roman);
		
		List<?> tree = context.getParseTree();
		
		for(Iterator<?> it = tree.iterator(); it.hasNext();)
		{
			Expression exp = (Expression) it.next();
			System.out.println("Parsing with exp: " + exp);
			exp.interpret(context);
		}
		
		System.out.println("-----------------------------------");
		System.out.println(roman + " = " + context.output);
	}

}
