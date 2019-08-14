package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Table implements ITable {
	List<IRow> rowList = new ArrayList<>();

	@Override
	public int numOfRows() {
		// TODO Auto-generated method stub
		return rowList.size();
	}

	@Override
	public IRow getRow(int rowNum) {
		// TODO Auto-generated method stub
		IRow row = null;
		
		for(IRow r : rowList)
		{
			if(r.getNum() == rowNum)
			{
				row = r;
				return row;
			}
		}
		
		return null;
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		// TODO Auto-generated method stub
		row.setNum(rowNum);
	
		rowList.add(row);
		
		System.out.println(rowNum + " row is added!");
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		// TODO Auto-generated method stub
		for(IRow r : rowList)
		{
			if(r.getNum() == rowNum)
				r = row;
		}

		System.out.println(rowNum + " row is modified to " + " row " + row.getNum());
	}

	@Override
	public void deleteRow(int rowNum) {
		// TODO Auto-generated method stub
		for(IRow r : rowList)
		{
			if(r.getNum() == rowNum)
			{
				rowList.remove(r);
			}
		}
		
		System.out.println(rowNum + " row is deleted!");
	}

}
