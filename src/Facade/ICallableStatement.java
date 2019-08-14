package Facade;

import java.sql.CallableStatement;
import java.sql.Connection;

public interface ICallableStatement {
	public CallableStatement getCall(Connection conn, String sql);
}
