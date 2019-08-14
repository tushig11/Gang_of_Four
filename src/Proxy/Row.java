package Proxy;

public class Row implements IRow {
	
	private int num;

	public Row()
	{
	}

	@Override
	public int getNum() {
		// TODO Auto-generated method stub
		return num;
	}
	
	@Override
	public void setNum(int num)
	{
		this.num = num;
	}

}
