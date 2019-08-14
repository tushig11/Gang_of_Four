package Visitor;

public interface Component {
	
	public void accept(NodeVisitor visitor);
	
	public Side getSide();
	
	public String getName();
	
	public void insert(Node node);
	
	public int getChildrenNum();
}
