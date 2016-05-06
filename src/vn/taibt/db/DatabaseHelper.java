package vn.taibt.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseHelper {

	public static ResultSet executePreparedStatement(Connection con, String sql, Object[] params) throws SQLException, ClassNotFoundException {
		try {
			PreparedStatement pstt = con.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				pstt.setObject(i + 1, params[i]);
			}
			ResultSet rs = pstt.executeQuery();
			return rs;
		} catch (SQLException e) {
			throw e;
		}
		
	}

	public static ResultSet executePreparedStatement(Connection con, String sql) throws SQLException, ClassNotFoundException {
		try {
			PreparedStatement pstt = con.prepareStatement(sql);
			ResultSet rs = pstt.executeQuery();
			return rs;
		} catch (SQLException e) {
			throw e;
		}
	}

	public static void executeUpdate(Connection con, String sql, Object[] params) throws SQLException, ClassNotFoundException {
		try {
			PreparedStatement pstt = con.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				pstt.setObject(i + 1, params[i]);
			}
			pstt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
