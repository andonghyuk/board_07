package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String ID = "c##test";
	private static final String PWD = "test";
	private static Connection con;

	private static void init() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		if (con == null) {
			init();
			try {
				con = DriverManager.getConnection(URL, ID, PWD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}

	public static void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		con = null;
	}

}
