package Facade;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class DatabaseFacade {
	
	public void connectToDatabase()
	{
		IConnection connection = new SQLConnection();
		IStatement statement = new PreStatement();
		IResultSet resultSet = new ResultSetImp();
		ICallableStatement callable = new CallableStatementImp();
		
		Connection conn = connection.getConnection();
		
		String sql = "SELECT * FROM <table> WHERE <column name> = ?";
		
		PreparedStatement prep = statement.getStatement(conn, sql);
		
		resultSet.getResultSet(prep);
		
		sql = "{call <stored procedure}(?, ?)";
		
		callable.getCall(conn, sql);

	}
}
