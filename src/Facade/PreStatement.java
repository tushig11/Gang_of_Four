package Facade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreStatement implements IStatement {
	PreparedStatement prep = null;
	
	@Override
	public PreparedStatement getStatement(Connection conn, String sql) {
		// TODO Auto-generated method stub
		try {
		prep = conn.prepareStatement(sql);
		prep.setString(1, "<column value>");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(prep != null) {
				try {
					prep.close();
				} catch(SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
		
		return prep;
	}

}
