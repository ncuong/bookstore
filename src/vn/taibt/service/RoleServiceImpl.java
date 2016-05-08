package vn.taibt.service;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.Role;
import vn.taibt.db.dao.RoleDAO;
import vn.taibt.db.dao.RoleDAOImpl;

public class RoleServiceImpl implements RoleService {
	
	private RoleDAO roleDAO;

	@Override
	public List<Role> findAll() throws ClassNotFoundException, SQLException {
		roleDAO = new RoleDAOImpl();
		List<Role> roles = roleDAO.findAll();
		return roles;
	}

	@Override
	public void add(Role role) throws ClassNotFoundException, SQLException {
		roleDAO = new RoleDAOImpl();
		roleDAO.add(role);
	}

	@Override
	public void update(Role role) throws ClassNotFoundException, SQLException {
		roleDAO = new RoleDAOImpl();
		roleDAO.update(role);
	}

	@Override
	public void delete(Integer roleId) throws ClassNotFoundException,
			SQLException {
		roleDAO = new RoleDAOImpl();
		roleDAO.delete(roleId);

	}

	@Override
	public Role findById(Integer roleId) throws ClassNotFoundException,
			SQLException {
		roleDAO = new RoleDAOImpl();
		Role role = roleDAO.findById(roleId);
		return role;
	}

}
