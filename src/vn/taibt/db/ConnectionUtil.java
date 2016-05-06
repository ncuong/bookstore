package vn.taibt.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bookstore?useUnicode=yes&characterEncoding=UTF-8";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "";

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(DRIVER_CLASS);
		Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		return con;
	}
	
	public static void closeConnection(Connection con) throws SQLException {
		if(null != con) {
			con.close();
		}
	}
}
