package vn.taibt.db.dao;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.Role;

public interface RoleDAO {
	public List<Role> findAll() throws ClassNotFoundException, SQLException;
	public void add(Role role) throws ClassNotFoundException, SQLException;
	public void update(Role role) throws ClassNotFoundException, SQLException;
	public void delete(Integer roleId) throws ClassNotFoundException, SQLException;
	public Role findById(Integer roleId) throws ClassNotFoundException, SQLException;
}
