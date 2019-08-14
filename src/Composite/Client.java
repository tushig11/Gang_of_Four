package Composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component root = new Composite("<HTML>", "</HTML>");
		Component compHead = new Composite("<HEAD>", "</HEAD>");
		Component leafTitle = new Leaf("<TITLE>Your Title Here", "</TITLE>");
		Component compBody = new Composite("<BODY>", "</BODY>");
		Component leafCenter = new Leaf("<CENTER><IMG SRC=\"clouds.jpg\" >", " </CENTER>");
		Component leafA = new Leaf("<a href=\"http://somegreatsite.com\">Link Name", " </a>");
		Component leafH1 = new Leaf("<H1>This is a Header", " </H1>");
		Component leafH2 = new Leaf("<H2>This is a Medium Header", " </H2>");
		Component leafB1 = new Leaf("<B>This is a new paragraph!", " </B>");
		Component leafB2 = new Leaf("<B><I>This is a new sentence without a paragraph break, in bold italics.</I>", " </B>");
		
		compBody.addItem(leafCenter);
		compBody.addItem(leafA);
		compBody.addItem(leafH1);
		compBody.addItem(leafH2);
		compBody.addItem(leafB1);
		compBody.addItem(leafB2);
		compHead.addItem(leafTitle);
		root.addItem(compHead);
		root.addItem(compBody);
		
		root.print();
	}

}
