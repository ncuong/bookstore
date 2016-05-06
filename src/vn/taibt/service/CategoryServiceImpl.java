package vn.taibt.service;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.Category;
import vn.taibt.db.dao.CategoryDAO;
import vn.taibt.db.dao.CategoryDAOImpl;

public class CategoryServiceImpl implements CategoryService {
	
	private CategoryDAO categoryDAO;

	@Override
	public List<Category> findAll() throws ClassNotFoundException, SQLException {
		categoryDAO = new CategoryDAOImpl();
		List<Category> categories = categoryDAO.findAll();
		return categories;
	}

}
