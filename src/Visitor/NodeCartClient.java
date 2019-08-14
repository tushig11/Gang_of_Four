package Visitor;

public class NodeCartClient {
	
	public static void main(String[] args)
	{
		Composite root = new Root("Topic");
		Node aNode= new Node("A", Side.RIGHT);
		Node bNode = new Node("B", Side.RIGHT);
		Node cNode = new Node("C", Side.RIGHT);
		Node dNode = new Node("D", Side.LEFT);
		Node eNode = new Node("E", Side.LEFT);
		Node fNode = new Node("F", Side.LEFT);
		
		root.insert(aNode);
		root.insert(bNode);
		root.insert(cNode);
		root.insert(dNode);
		root.insert(eNode);  
		root.insert(fNode);
		
		Node a1Node = new Node("A1", aNode.getSide());
		aNode.insert(a1Node);
		aNode.insert(new Node("A2",aNode.getSide()));
		
		a1Node.insert(new Node("AA1", aNode.getSide()));
		a1Node.insert(new Node("AA2", aNode.getSide()));
		a1Node.insert(new Node("AA3", aNode.getSide()));
		
		
		bNode.insert(new Node("B1", bNode.getSide()));
		bNode.insert(new Node("B2", bNode.getSide()));
		
		
		cNode.insert(new Node("C1", cNode.getSide()));
		cNode.insert(new Node("C2", cNode.getSide()));

		
		dNode.insert(new Node("D1", dNode.getSide()));
		dNode.insert(new Node("D2", dNode.getSide()));
		
		
		eNode.insert(new Node("E1", eNode.getSide()));
		eNode.insert(new Node("E2", eNode.getSide()));
		eNode.insert(new Node("E3", eNode.getSide()));
		
		
		fNode.insert(new Node("F1", fNode.getSide()));
		fNode.insert(new Node("F2", fNode.getSide()));
		
		NodeVisitor visitor = new DisplayNodeVisitor();
		
		root.accept(visitor);
		
		for(int i = 0; i < root.getChildrenNum(); i++)
		{
			root.chilren().get(i).accept(visitor);
		}
	
		
	}
	
}
