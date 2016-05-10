package vn.taibt.db.dao;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.User;

public interface UserDAO {
	public List<User> findAll() throws ClassNotFoundException, SQLException;
	public void add(User user) throws ClassNotFoundException, SQLException;
	public void update(User user) throws ClassNotFoundException, SQLException;
	public void delete(Integer userId) throws ClassNotFoundException, SQLException;
	public User findById(Integer userId) throws ClassNotFoundException, SQLException;
	public User findByUsername(String username) throws ClassNotFoundException, SQLException;
}
