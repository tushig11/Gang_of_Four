package Facade;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementImp implements ICallableStatement {
	java.sql.CallableStatement call = null;
	
	@Override
	public CallableStatement getCall(Connection conn, String sql) {
		// TODO Auto-generated method stub
		
		try {
			call = conn.prepareCall(sql);
			call.setInt(1, 1972);
			call.registerOutParameter(2, java.sql.Types.INTEGER);
			call.execute();
			System.out.println(call.getInt(2));
			
		} catch(SQLException e)
		{
			e.printStackTrace();
		} finally {
			if(call != null) {
				try {
					call.close();
				} catch(SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
		
		return call;
	}

}
