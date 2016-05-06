package vn.taibt.service;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.Category;

public interface CategoryService {
	public List<Category> findAll() throws ClassNotFoundException, SQLException;
	public void delete(Integer categoryId) throws ClassNotFoundException, SQLException;
	public void update(Category category) throws ClassNotFoundException, SQLException;
	public Category findById(Integer categoryId) throws ClassNotFoundException, SQLException;
	public void add(Category category) throws ClassNotFoundException, SQLException;
}
