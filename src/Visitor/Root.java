package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Root extends Composite {
	
	private List<Node> children = new ArrayList<>();
	
	public Root(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.side = Side.NONE;
	}
	
	@Override
	public void accept(NodeVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	public void insert(Node node) {
		// TODO Auto-generated method stub
		children.add(node);
	}

	@Override
	public int getChildrenNum() {
		// TODO Auto-generated method stub
		return children.size();
	}

	@Override
	public List<Node> chilren() {
		// TODO Auto-generated method stub
		return children;
	}

}
