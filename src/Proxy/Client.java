package Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Row row = new Row();
		Row row2 = new Row();
		row2.setNum(10);
		
		ITable table1 = new TableProxy(false);
		
		table1.addRow(row, 1);
		table1.modifyRow(1, row2);
		table1.addRow(row, 2);
		table1.deleteRow(2);
		
		ITable table2 = new TableProxy(true);
		table2.addRow(row, 3);
		table2.modifyRow(3, row2);
		table2.addRow(row, 4);
		table2.deleteRow(4);
		
	}

}
