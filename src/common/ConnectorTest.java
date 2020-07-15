package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorTest {
	private static final String URL = "jdbc:oarcle:thin:@localhost:1521:xe";
	private static final String ID = "c#test";
	private static final String PWD = "test";
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";

	public static Connection con;

	static {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getCon() {
		if (con == null) {
			try {
				con = DriverManager.getConnection(URL, ID, PWD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}

	public static void Close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		con = null;
	}
	
	public static void main(String[] args) {
		System.out.println("");
	}
}
