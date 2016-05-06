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

	@Override
	public void delete(Integer categoryId) throws ClassNotFoundException,
			SQLException {
		categoryDAO = new CategoryDAOImpl();
		categoryDAO.delete(categoryId);
	}

	@Override
	public void update(Category category) throws ClassNotFoundException,
			SQLException {
		categoryDAO = new CategoryDAOImpl();
		categoryDAO.update(category);
	}

	@Override
	public Category findById(Integer categoryId) throws ClassNotFoundException,
			SQLException {
		categoryDAO = new CategoryDAOImpl();
		return categoryDAO.findById(categoryId);
	}

	@Override
	public void add(Category category) throws ClassNotFoundException,
			SQLException {
		categoryDAO = new CategoryDAOImpl();
		categoryDAO.add(category);
	}

}
