package Visitor;

import java.util.List;

public abstract class Composite implements Component {
	protected Side side;
	protected String name;
	
	public String getName()
	{
		return this.name;
	}
	
	public Side getSide()
	{
		return this.side;
	}
	
	public abstract void insert(Node node);
	
	public abstract int getChildrenNum();
	
	public abstract List<Node> chilren();
	
	@Override
	public abstract void accept(NodeVisitor visitor);
}
