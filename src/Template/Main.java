package Template;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterPrinter printer = new ConcreteLetterPrinter();
		printer.printLetter("resources/A.txt");
		printer.printLetter("resources/B.txt");
		printer.printLetter("resources/C.txt");
		
	}

}
