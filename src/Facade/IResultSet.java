package Facade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface IResultSet {
	public ResultSet getResultSet(PreparedStatement prep);
}
