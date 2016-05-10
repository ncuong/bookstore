package vn.taibt.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vn.taibt.bean.User;
import vn.taibt.bean.Role;
import vn.taibt.bean.User;
import vn.taibt.db.ConnectionUtil;
import vn.taibt.db.DatabaseHelper;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<User> findAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User user) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer userId) throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public User findById(Integer userId) throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		return null;
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
