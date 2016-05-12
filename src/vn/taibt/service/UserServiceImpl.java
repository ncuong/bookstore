package vn.taibt.service;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.User;
import vn.taibt.db.dao.UserDAO;
import vn.taibt.db.dao.UserDAOImpl;

public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	
	@Override
	public List<User> findAll() throws ClassNotFoundException, SQLException {
		userDAO = new UserDAOImpl();
		List<User> users = userDAO.findAll();
		return users;
	}

	@Override
	public void add(User user) throws ClassNotFoundException, SQLException {
		userDAO = new UserDAOImpl();
		userDAO.add(user);

	}

	@Override
	public void update(User user) throws ClassNotFoundException, SQLException {
		userDAO = new UserDAOImpl();
		userDAO.update(user);

	}

	@Override
	public void delete(Integer userId) throws ClassNotFoundException,
			SQLException {
		userDAO = new UserDAOImpl();
		userDAO.delete(userId);

	}

	@Override
	public User findById(Integer userId) throws ClassNotFoundException,
			SQLException {
		userDAO = new UserDAOImpl();
		User user = userDAO.findById(userId);
		return user;
	}

	@Override
	public User findByUsername(String username) throws ClassNotFoundException,
			SQLException {
		userDAO = new UserDAOImpl();
		User user = userDAO.findByUsername(username);
		return user;
	}

}
