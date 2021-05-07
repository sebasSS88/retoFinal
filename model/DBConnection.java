package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DBConnection {
	
	protected Connection con;
	protected PreparedStatement stmt;
	
	protected void connect() throws Exception {
		try {
			String url = "jdbc:mysql://localhost:3306/bd_library?serverTimezone=Europe/Madrid&useSSL=false";
			con = DriverManager.getConnection(url, "root", "abcd*1234");
		} catch (SQLException e) {
			throw new Exception (e);
		}
	}

	protected void disconnect() throws Exception {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (con != null)
				con.close();
		} catch (SQLException e) {
			throw new Exception (e);
		}
	}

	protected void closeRs(ResultSet rs) throws SQLException {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException ex) {
				//throw new Exception (ex);
			}
		}
	}
	
	
}
