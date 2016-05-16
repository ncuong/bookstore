package vn.taibt.db.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vn.taibt.bean.User;
import vn.taibt.bean.Role;
//import vn.taibt.bean.User;
//import vn.taibt.bean.Role;
//import vn.taibt.bean.User;
//import vn.taibt.bean.Role;
//import vn.taibt.bean.User;
import vn.taibt.db.ConnectionUtil;
import vn.taibt.db.DatabaseHelper;

public class UserDAOImpl implements UserDAO {
	
	private RoleDAO roleDAO;

	@Override
	public List<User> findAll() throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.getConnection();
		roleDAO = new RoleDAOImpl();
		try {
			String sql = new StringBuilder().append("SELECT * FROM users").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql);
			List<User> users = new ArrayList<User>();
			while(rs.next()) {
				User user = new User();
				Integer userId = rs.getInt("USER_ID");
				String fullName = rs.getString("FULL_NAME");
				String userName = rs.getString("USER_NAME");
				String email = rs.getString("EMAIL");
				user.setUserId(userId);
				user.setFullName(fullName);
				user.setUserName(userName);
				user.setEmail(email);

				Integer roleId = rs.getInt("ROLE_ID");
				Role role = roleDAO.findById(roleId);
				user.setRole(role);

				users.add(user);
			}
			return users;
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

	@Override
	public void add(User user) throws ClassNotFoundException, SQLException {
		String sql = new StringBuilder().append(
				"INSERT INTO users(FULL_NAME, USER_NAME, PASSWORD, EMAIL, ROLE_ID) VALUES(?, ?, ?, ?, ?)").toString();
		Connection con = ConnectionUtil.getConnection();
		try {
			DatabaseHelper.executeUpdate(con, sql,
					new Object[] { user.getFullName(), user.getUserName(),user.getPassword(), user.getEmail(), user.getRole().getRoleId() });
		} finally {
			ConnectionUtil.closeConnection(con);
		}

	}

	@Override
	public void update(User user) throws ClassNotFoundException, SQLException {
		String sql = new StringBuilder().append("UPDATE users SET FULL_NAME = ?, USER_NAME =?, PASSWORD = ?, EMAIL = ?, ROLE_ID = ? WHERE USER_ID = ?").toString();
		Connection con = ConnectionUtil.getConnection();
		try {
			DatabaseHelper.executeUpdate(con, sql, new Object[] {user.getFullName(), user.getUserName(), user.getPassword(), user.getEmail(), user.getRole().getRoleId(), user.getUserId()});
		} finally {
			ConnectionUtil.closeConnection(con);
		}

	}

	@Override
	public void delete(Integer userId) throws ClassNotFoundException,
			SQLException {
		Connection con = ConnectionUtil.getConnection();
		String sql = new StringBuilder().append("DELETE FROM users WHERE USER_ID = ?").toString();
		try {
			DatabaseHelper.executeUpdate(con, sql, new Object[] {userId});
		} finally {
			ConnectionUtil.closeConnection(con);
		}

	}

	@Override
	public User findById(Integer id) throws ClassNotFoundException,
			SQLException {
		Connection con = ConnectionUtil.getConnection();
		try {
			roleDAO = new RoleDAOImpl();
			String sql = new StringBuilder().append("SELECT * FROM users WHERE USER_ID = ?").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql, new Object[] {id});
			List<User> users = new ArrayList<User>();
			while(rs.next()) {
				User user = new User();
				Integer userId = rs.getInt("USER_ID");
				String fullName = rs.getString("FULL_NAME");
				String userName = rs.getString("USER_NAME");
				String email = rs.getString("EMAIL");
				Integer roleId = rs.getInt("ROLE_ID");
				
				user.setUserId(userId);
				user.setFullName(fullName);
				user.setUserName(userName);
				user.setEmail(email);
				
				Role role = roleDAO.findById(roleId);
				user.setRole(role);
				
				users.add(user);
			}
			if(users.size() > 0) {
				return users.get(0);
			} else {
				return null;
			}
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

	@Override
	public User findByUsername(String usernameSearch) throws ClassNotFoundException,
			SQLException {
		Connection con = ConnectionUtil.getConnection();
		try {
			String sql = new StringBuilder().append("SELECT * FROM users INNER JOIN roles ON users.ROLE_ID = roles.ROLE_ID WHERE users.USER_NAME LIKE ?").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql, new Object[] {usernameSearch});
			List<User> users = new ArrayList<User>();
			while(rs.next()) {
				User user = new User();
				
				Integer userId = rs.getInt("USER_ID");
				String username = rs.getString("USER_NAME");
				String password = rs.getString("PASSWORD");
				String email = rs.getString("EMAIL");
				Integer roleId = rs.getInt("ROLE_ID");
				String roleName = rs.getString("ROLE_NAME");
				
				user.setUserId(userId);
				user.setUserName(username);
				user.setPassword(password);
				user.setEmail(email);
				
				Role role = new Role();
				role.setRoleId(roleId);
				role.setRoleName(roleName);
				
				user.setRole(role);
				
				users.add(user);
			}
			if(users.size() > 0) {
				return users.get(0);
			} else {
				return null;
			}
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

}
