package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Node extends Composite {
	
	private List<Node> children = new ArrayList<>();

	public Node(String name, Side side)
	{
		this.name = name;
		this.side = side;
	}
	
	public void insert(Node child)
	{
		children.add(child);
	}
	
	public Side getSide()
	{
		return side;
	}
	
	public int getChildrenNum()
	{
		
		return children.size();
	}
	
	@Override
	public void accept(NodeVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	public List<Node> chilren() {
		// TODO Auto-generated method stub
		return children;
	}

}
