package vn.taibt.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vn.taibt.bean.Role;
import vn.taibt.db.ConnectionUtil;
import vn.taibt.db.DatabaseHelper;

public class RoleDAOImpl implements RoleDAO{

	@Override
	public List<Role> findAll() throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.getConnection();
		try {
			String sql = new StringBuilder().append("SELECT * FROM roles").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql);
			List<Role> roles = new ArrayList<Role>();
			while(rs.next()) {
				Role role = new Role();
				Integer roleId = rs.getInt("ROLE_ID");
				String roleName = rs.getString("ROLE_NAME");
				
				role.setRoleId(roleId);
				role.setRoleName(roleName);
				
				roles.add(role);
			}
			return roles;
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

	@Override
	public void add(Role role) throws ClassNotFoundException, SQLException {
		String sql = new StringBuilder().append("INSERT INTO roles(ROLE_NAME) VALUES(?)").toString();
		Connection con = ConnectionUtil.getConnection();
		try{
			DatabaseHelper.executeUpdate(con, sql, new Object[] {role.getRoleName()});
		} finally {
			ConnectionUtil.closeConnection(con);
		}
		
	}

	@Override
	public void update(Role role) throws ClassNotFoundException, SQLException {
		String sql = new StringBuilder().append("UPDATE roles SET ROLE_NAME = ? WHERE ROLE_ID = ?").toString();
		Connection con = ConnectionUtil.getConnection();
		try {
			DatabaseHelper.executeUpdate(con, sql, new Object[] {role.getRoleName(), role.getRoleId()});
		} finally {
			ConnectionUtil.closeConnection(con);
		}
		
	}

	@Override
	public void delete(Integer roleId) throws ClassNotFoundException,
			SQLException {
		Connection con = ConnectionUtil.getConnection();
		String sql = new StringBuilder().append("DELETE FROM roles WHERE ROLE_ID = ?").toString();
		try {
			DatabaseHelper.executeUpdate(con, sql, new Object[] {roleId});
		} finally {
			ConnectionUtil.closeConnection(con);
		}
		
	}

	@Override
	public Role findById(Integer id) throws ClassNotFoundException,
			SQLException {
		Connection con = ConnectionUtil.getConnection();
		try {
			String sql = new StringBuilder().append("SELECT * FROM roles WHERE ROLE_ID = ?").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql, new Object[] {id});
			List<Role> roles = new ArrayList<Role>();
			while(rs.next()) {
				Role role = new Role();
				Integer roleId = rs.getInt("ROLE_ID");
				String roleName = rs.getString("ROLE_NAME");
				
				role.setRoleId(roleId);
				role.setRoleName(roleName);
				
				roles.add(role);
			}
			if(roles.size() > 0) {
				return roles.get(0);
			} else {
				return null;
			}
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

}
