package Facade;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResultSetImp implements IResultSet {
	java.sql.ResultSet rset = null;
	
	@Override
	public java.sql.ResultSet getResultSet(PreparedStatement prep) {
		// TODO Auto-generated method stub
		try {
			rset = prep.executeQuery();

			if(rset.next())
			{
				System.out.println(rset.getString("<column name"));
			}
		
		} catch(SQLException e) {
			e.printStackTrace();
		}  finally {
			if(rset != null) {
				try {
					rset.close();
				} catch(SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
		return rset;
	}

}
