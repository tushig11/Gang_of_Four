package Proxy;

public class TableProxy implements ITable {
	private ITable table;
	private boolean isLocked;
	
	public TableProxy(boolean isLocked) {
		// TODO Auto-generated constructor stub
		this.table = new Table();
		this.isLocked = isLocked;
	}

	@Override
	public int numOfRows() {
		// TODO Auto-generated method stub
		return table.numOfRows();
	}

	@Override
	public IRow getRow(int rowNum) {
		// TODO Auto-generated method stub
		return table.getRow(rowNum);
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		// TODO Auto-generated method stub
		
		table.addRow(row, rowNum);
		
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		// TODO Auto-generated method stub
		if(!isLocked)
		{
			table.modifyRow(rowNum, row);
		}
		else
		{
			System.out.println(rowNum + " row is not allowed to modify!");
		}
	}

	@Override
	public void deleteRow(int rowNum) {
		// TODO Auto-generated method stub
		if(!isLocked)
		{
			table.deleteRow(rowNum);
		}
		else
		{
			System.out.println(rowNum + " row is not allowed to delete!");
		}
	}

}
