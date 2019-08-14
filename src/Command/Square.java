package Command;

public class Square {
	private Position pos = new Position();
	private int side = 1;
	private int scale = 1;
	
	public void create(int side)
	{
		int maxSide = this.side * side;
		System.out.println("Square created " + " side: " + maxSide);
		for(int i = 0; i < maxSide; i++)
		{
			for(int j = 0; j < maxSide; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		this.side = maxSide;
		
		pos.setX(0);
		pos.setY(0);

	}
	
	public void scale(int scale)
	{
		
		int maxSide = side * scale;
		
		System.out.println("Square scaled " + " side: " + scale + " times. ");
		
		for(int i = 0; i < maxSide; i++)
		{
			for(int j = 0; j < maxSide; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		this.side= maxSide;
		this.scale = scale;
	}
	
	public void undoScale()
	{
		int maxSide = side / scale;
		
		System.out.println("Undo " + " side: " + scale + " times. ");
		
		for(int i = 0; i < maxSide; i++)
		{
			for(int j = 0; j < maxSide; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		this.side= maxSide;
		this.scale = 1;
	}
	
	public void moveRight(int unit)
	{
		int moveX = pos.getX() + unit;
		pos.setX(moveX);
		System.out.println("Moved right by " + unit + " Pos X: " + pos.getX() + " " + "Pos Y: " + pos.getY());
	}
	
	public void moveLeft(int unit)
	{
		int moveX = pos.getX() - unit;
		pos.setX(moveX);
		System.out.println("Moved left by " + unit + " Pos X: " + pos.getX() + " " + "Pos Y: " + pos.getY());
	}
	
	public void moveUp(int unit)
	{
		int moveY = pos.getY() + unit;
		pos.setY(moveY);
		System.out.println("Moved up by " + unit + " Pos X: " + pos.getX() + " " + "Pos Y: " + pos.getY());
	}
	
	public void moveDown(int unit)
	{
		int moveY = pos.getY() - unit;
		pos.setY(moveY);
		System.out.println("Moved down by " + unit + " Pos X: " + pos.getX() + " " + "Pos Y: " + pos.getY());
	}
}
