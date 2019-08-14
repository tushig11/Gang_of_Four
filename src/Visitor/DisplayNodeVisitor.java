package Visitor;

public class DisplayNodeVisitor implements NodeVisitor {
	private Root root;
	private int nodeCount = 1;
	
	
	@Override
	public void visit(Root root) {
		// TODO Auto-generated method stub
		this.root = root;
		
		System.out.println(this.root.getName());
	}

	@Override
	public void visit(Node node) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < node.getChildrenNum(); i++)
		{
			Node childNode = node.chilren().get(i);
			
 			if(childNode.getChildrenNum() > 0)
			{
				nodeCount += node.chilren().get(i).getChildrenNum();
				
				childNode.accept(this);
			} 
 			else
 			{
 				
 				if(node.getSide() == Side.RIGHT)
 				{
 					System.out.println("Right nodes:");
 					System.out.println(nodeCount + " " + node.getName() + " nodes");
 					nodeCount = 1;
 				}
 				else
 				{
 					System.out.println("Left nodes:");
 					System.out.println(nodeCount + " " + node.getName() + " nodes");
 					nodeCount = 1;
 				}
 				
 			}
			
		}
	
	}

}
