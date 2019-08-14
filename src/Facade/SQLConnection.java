package Facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection implements IConnection {

	Connection conn = null;
	
	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		try {		
			Class.forName("<driver>").newInstance();
			conn = DriverManager.getConnection("<database>");
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(InstantiationException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch(SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
		
		return conn;
	}

}
